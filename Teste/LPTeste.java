import com.company.LP;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LPTeste {

    @Test
    void buscarTitulos() {
        String titulo = "Came as you are";
        LP[] lps;
        LP lp = new LP();
        lps = lp.carregaLP("Lp.txt");
        assertEquals(titulo, lps[0].getTitulo().trim());
    }

    @Test
    void buscarCompositor() {
        String compositor = "Kurt Kobain";
        LP[] lps;
        LP lp = new LP();
        lps = lp.carregaLP("Lp.txt");
        assertEquals(compositor, lps[0].getCompositor().trim());
    }

    @Test
    void buscarInterprete() {
        String compositor = "Nirvana";
        LP[] lps;
        LP lp = new LP();
        lps = lp.carregaLP("Lp.txt");
        assertEquals(compositor, lps[0].getInterprete().trim());
    }


}
