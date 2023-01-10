package game;
public class TipoHabilidadeSuprema implements TipoHabilidade{

    private static TipoHabilidadeSuprema tipoHabilidadePoderosa= new TipoHabilidadeSuprema();

    private TipoHabilidadeSuprema() {};

    public static TipoHabilidadeSuprema getTipoHabilidadePoderosa() {
        return tipoHabilidadePoderosa;
    }
}
