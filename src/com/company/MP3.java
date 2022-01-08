package com.company;
import java.io.*;

public class MP3 extends BibliotecaDeMusicas{

    private String tamBytes;

    //construtor sem parametros
    public MP3() {
        this("Nenhum", "Nenhum", "Nenhum", "Nenhum", "Nenhum","");
    }

    //construtor com parametros
    public MP3(String nomeAlbum, String titulo, String compositor, String interprete, String ano, String tamBytes) {
        super(nomeAlbum, titulo, compositor, interprete, ano); //chamada ao construtor da classe BibliotecaDeMusicas
        this.tamBytes= tamBytes;

    }

    public String getTamBytes() {
        return tamBytes;
    }

    public void setTamBytes(String tamBytes) {
        this.tamBytes = tamBytes;
    }

    public MP3[] carregaMp3(String fileName) {
        File file = new File(fileName);
        MP3 mp3;
        MP3[] mp3s;
        PesquisaMP3 pesquisaMP3 = new PesquisaMP3();
        mp3s = new MP3[pesquisaMP3.contaLinhas1(file)];

        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bf = new BufferedReader(isr);
            String linha;
            linha = bf.readLine();
            int linhas = 0;
            while (true) {
                linha = bf.readLine();
                if (linha == null)
                    break;
                String[] dados = linha.split(";");
                mp3 = new MP3();
                mp3.setNomeAlbum(dados[0]);
                mp3.setTitulo(dados[1]);
                mp3.setCompositor(dados[2]);
                mp3.setInterprete(dados[3]);
                mp3.setAno(dados[4]);
                mp3.setTamBytes(dados[5]);
                mp3s[linhas] = mp3;
                linhas++;
            }
            bf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return mp3s;
    }

    public void listaMP3(MP3[] mp3s){

        System.out.println("\n====> LISTA DE MP3s:");
        for (MP3 mp3 : mp3s) {
            System.out.println("Nome do Album..:"+mp3.getNomeAlbum());
            System.out.println("Titulo da musica......:"+mp3.getTitulo());
            System.out.println("Compositor...:"+mp3.getCompositor());
            System.out.println("Interprete...:"+mp3.getInterprete());
            System.out.println("Ano...:"+mp3.getAno());
            System.out.println("Tamanho em Bytes...:"+ mp3.getTamBytes());
            System.out.println("----------------");

        }

    }
}

