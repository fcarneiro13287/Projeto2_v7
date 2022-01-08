import com.company.CD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CDteste {
    @Test
    void buscarTitulos() {
        String titulo = "Oceano";
        CD[] cds;
        CD cd = new CD();
        cds = cd.carregaCD("CD.txt");
        assertEquals(titulo, cds[0].getTitulo().trim());
    }
    @Test
    void buscarCompositor() {
        String titulo = "DJavan";
        CD[] cds;
        CD cd = new CD();
        cds = cd.carregaCD("CD.txt");
        assertEquals(titulo, cds[0].getCompositor().trim());
    }

    @Test
    void buscarInterprete() {
        String titulo = "DJavan";
        CD[] cds;
        CD cd = new CD();
        cds = cd.carregaCD("CD.txt");
        assertEquals(titulo, cds[0].getCompositor().trim());
    }

}
