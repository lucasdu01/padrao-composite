import java.util.ArrayList;
import java.util.List;

public class Setor extends Instalacao {

    private List<Instalacao> instalacoes;

    public Setor(String descricao) {
        super(descricao);
        this.instalacoes = new ArrayList<Instalacao>();
    }

    public void addInstalacao(Instalacao instalacao) {
        this.instalacoes.add(instalacao);
    }

    public String getInstalacao() {
        String saida = "";
        saida = "Setor: " + this.getDescricao() + "\n";
        for (Instalacao instalacao : instalacoes) {
            saida += instalacao.getInstalacao();
        }
        return saida;
    }
}
