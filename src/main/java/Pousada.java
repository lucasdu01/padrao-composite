public class Pousada {

    private Instalacao estrutura;

    public void setEstrutura(Instalacao estrutura) {
        this.estrutura = estrutura;
    }

    public String getEstrutura() {
        if (this.estrutura == null) {
            throw new NullPointerException("Pousada sem estrutura");
        }
        return this.estrutura.getInstalacao();
    }
}
