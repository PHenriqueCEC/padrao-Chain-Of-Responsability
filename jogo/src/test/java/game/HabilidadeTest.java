package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HabilidadeTest {

    Arqueiro arqueiro;
    Mago mago;
    General general;
    Heroi heroi;

    @BeforeEach
    void setUp() {
        heroi = new Heroi(null);
        general = new General(heroi);
        mago = new Mago(general);
        arqueiro = new Arqueiro(mago);
    }

    @Test
    void deveRetornarSoldadoParaUsarGolpeFraco() {
        assertEquals("Golpe de um arqueiro", arqueiro.usarHabilidade(new Habilidade(TipoHabilidadeFraca.getTipoHabilidadeFraca())));
    }

    @Test
    void deveRetornarEspadachimParaUsarGolpeMedio() {
        assertEquals("Golpe do Mago", arqueiro.usarHabilidade(new Habilidade(TipoHabilidadeNormal.getTipoHabilidadeNormal())));
    }

    @Test
    void deveRetornarGeneralParaUsarGolpeForte() {
        assertEquals("Golpe do General", arqueiro.usarHabilidade(new Habilidade(TipoHabilidadeForte.getTipoHabilidadeForte())));
    }

    @Test
    void deveRetornarHeroiUsarGolpeSupremo() {
        assertEquals("Golpe do Guerreiro mais poderoso de todos", arqueiro.usarHabilidade(new Habilidade(TipoHabilidadeSuprema.getTipoHabilidadePoderosa())));
    }

    @Test
    void deveRetornarNenhumHeroiParaGolpeAereo() {
        assertEquals("Sem Classe para usar um Golpe", arqueiro.usarHabilidade(new Habilidade(TipoHabilidadeAerea.getTipoHabilidadeAerea())));
    }

}