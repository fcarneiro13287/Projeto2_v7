import com.company.MP3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MP3Teste {

    @Test
    void buscarTitulos() {
        String titulo = "Here I go again";
        MP3[] mp3s;
        MP3 mp3 = new MP3();
        mp3s = mp3.carregaMp3("MP3.txt");
        assertEquals(titulo, mp3s[0].getTitulo().trim());
    }

    @Test
    void buscarCompositor() {
        String compositor = "White Snake";
        MP3[] mp3s;
        MP3 mp3 = new MP3();
        mp3s = mp3.carregaMp3("MP3.txt");
        assertEquals(compositor, mp3s[0].getCompositor().trim());
    }

    @Test
    void buscarInterprete() {
        String interprete = "White Snake";
        MP3[] mp3s;
        MP3 mp3 = new MP3();
        mp3s = mp3.carregaMp3("MP3.txt");
        assertEquals(interprete, mp3s[0].getInterprete().trim());
    }
}
