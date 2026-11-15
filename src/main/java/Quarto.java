public class Quarto extends Instalacao {

    private int capacidade;

    public Quarto(String descricao, int capacidade) {
        super(descricao);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getInstalacao() {
        return "Quarto: " + this.getDescricao() + " - capacidade: " + this.capacidade + "\n";
    }

}
