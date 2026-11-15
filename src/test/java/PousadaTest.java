import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PousadaTest {

    @Test
    void deveRetornarEstruturaPousada() {
        Setor setor1 = new Setor("Área de Lazer");

        Setor setor2 = new Setor("Térreo");
        Quarto quarto21 = new Quarto("Quarto Casal", 2);
        setor2.addInstalacao(quarto21);

        Setor setor3 = new Setor("Primeiro Andar");
        Quarto quarto31 = new Quarto("Quarto Família", 4);
        Quarto quarto32 = new Quarto("Suíte Master", 3);
        setor3.addInstalacao(quarto31);
        setor3.addInstalacao(quarto32);

        Setor estrutura = new Setor("Pousada Casa do Tijolinho");
        estrutura.addInstalacao(setor1);
        estrutura.addInstalacao(setor2);
        estrutura.addInstalacao(setor3);

        Pousada pousada = new Pousada();
        pousada.setEstrutura(estrutura);

        assertEquals("Setor: Pousada Casa do Tijolinho\n" +
                "Setor: Área de Lazer\n" +
                "Setor: Térreo\n" +
                "Quarto: Quarto Casal - capacidade: 2\n" +
                "Setor: Primeiro Andar\n" +
                "Quarto: Quarto Família - capacidade: 4\n" +
                "Quarto: Suíte Master - capacidade: 3\n", pousada.getEstrutura());
    }

    @Test
    void deveRetornarExcecaoPousadaSemEstrutura() {
        try {
            Pousada pousada = new Pousada();
            pousada.getEstrutura();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Pousada sem estrutura", e.getMessage());
        }
    }
}
