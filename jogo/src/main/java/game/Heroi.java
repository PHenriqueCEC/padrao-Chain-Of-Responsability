package game;
public class Heroi extends Classe {
    public Heroi(Classe superior) {
        listaHabilidades.add(TipoHabilidadeSuprema.getTipoHabilidadePoderosa());
        setClasseSuperior(superior);
    }

    public String getDescricaoClasse() {
        return "Golpe do Guerreiro mais poderoso de todos";
    }
}
