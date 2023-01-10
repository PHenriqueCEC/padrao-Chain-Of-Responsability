package game;
public class Arqueiro extends Classe {

    public Arqueiro(Classe superior) {
        listaHabilidades.add(TipoHabilidadeFraca.getTipoHabilidadeFraca());
        setClasseSuperior(superior);
    }

    public String getDescricaoClasse() {
        return "Golpe de um arqueiro";
    }
}
