package Escolinha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    private Estudante gabriel;
    private Estudante leandro;
    private Estudante jackson;
    private CadastroEstudante rh;

    @BeforeEach
    void setUp() {


        gabriel = new Estudante("Gabriel", 20, "154df");
        leandro = new Estudante("Leandro", 20, "a4wdf");
        jackson = new Estudante("Michael", 20, "9qwdf");
        rh = new CadastroEstudante();


    }

    @Test
    void adicionarEstudanteTest() {

        CadastroEstudante rh = new CadastroEstudante();

        rh.adicionarEstudante(gabriel);
        rh.adicionarEstudante(leandro);
        rh.adicionarEstudante(jackson);

        assertNotNull(gabriel);
        assertNotNull(leandro);
        assertNotNull(jackson);
    }

    @Test
    void consultarNomeTest() {

        rh.consultarNome("Gabriel");
        assertNotNull(gabriel);

    }

    @Test
    void listarEstudantesTest() {

        rh.listarEstudantes();
        assertNotNull(rh);

    }

}