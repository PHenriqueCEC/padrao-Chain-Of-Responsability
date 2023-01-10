package game;
public class Mago extends Classe {

    public Mago(Classe superior) {
        listaHabilidades.add(TipoHabilidadeNormal.getTipoHabilidadeNormal());
        setClasseSuperior(superior);
    }

    public String getDescricaoClasse() {
        return "Golpe do Mago";
    }
}
