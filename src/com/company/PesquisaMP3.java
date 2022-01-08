package com.company;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PesquisaMP3{

    public static int contaLinhas1(File file){
        System.out.println("Contando as linhas do ficheiro txt");
        int total=0;
        try {
            FileReader isr = new FileReader(file);
            BufferedReader bf = new BufferedReader(isr);
            String linha;
            linha=bf.readLine();
            int linhas=0;
            while(true){
                linha=bf.readLine();
                if(linha==null)
                    break;
                linhas++;
            }
            total=linhas;
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("MP3 Carregados: "+total);
        return total;
    }

    public static void buscarTitulos(MP3[] mp3s){
        System.out.println("\n=====> TITULOS DE MUSICAS DOS MP3s:");
        for (MP3 mp3 : mp3s) {
            if(mp3.getTitulo().toLowerCase().contains(mp3.getTitulo().toLowerCase())){
                System.out.println("Titulo da musica......:"+mp3.getTitulo());
            }
        }
    }
    public static void buscarCompositor(MP3[] mp3s) {
        System.out.println("\n=====> COMPOSITORES DAS MUSICAS DOS MP3s:");
        for (MP3 mp3 : mp3s) {
            if (mp3.getCompositor().toLowerCase().contains(mp3.getCompositor().toLowerCase())) {
                System.out.println("Compositor...:" + mp3.getCompositor());
            }
        }
    }
    public static void buscarInterprete(MP3[] mp3s) {
        System.out.println("\n=====> INTERPRETES DAS MUSICAS DOS MP3s:");
        for (MP3 mp3 : mp3s) {
            if (mp3.getInterprete().toLowerCase().contains(mp3.getInterprete().toLowerCase())) {
                System.out.println("Interprete...:" + mp3.getCompositor());
            }
        }
    }
    public static void buscarAnoMP3(MP3[] mp3s) {
        System.out.println("\n=====> ANO DAS MUSICAS MP3s:");
        for (MP3 mp3 : mp3s) {
            if (mp3.getAno().toLowerCase().contains(mp3.getAno().toLowerCase())) {
                System.out.println("Ano...:" + mp3.getAno());
            }
        }
    }
    public static void buscarTamanhoBytes(MP3[] mp3s) {
        System.out.println("\n=====> TAMANHO EM BYTES DAS MUSICAS MP3s:");
        for (MP3 mp3 : mp3s) {
            if (mp3.getTamBytes().toLowerCase().contains(mp3.getTamBytes().toLowerCase())) {
                System.out.println("Tamanho em Bytes...:" + mp3.getTamBytes());
            }
        }
    }
    public static void buscarPorAnoMP3(MP3[] mp3s,int inicio, int fim){
        System.out.println("\n=====> ANO DAS MUSICAS DOS MP3s:");
        for (MP3 mp3 : mp3s) {
            if ((Integer.parseInt(mp3.getAno().trim())>=inicio) && (Integer.parseInt(mp3.getAno().trim())<=fim)){
                System.out.println("Titulo: " + mp3.getTitulo());
                System.out.println("Ano: " + mp3.getAno());
            }
        }
    }
}
