package com.company;
import java.io.*;

public class CD extends BibliotecaDeMusicas {

    //construtor sem parametros
    public CD() {
        this("Nenhum", "Nenhum", "Nenhum", "Nenhum", "");
    }
    //construtor com parametros
    public CD(String nomeAlbum, String titulo, String compositor, String interprete, String ano) {
        super(nomeAlbum, titulo, compositor, interprete, ano);}


    public CD[] carregaCD(String fileName) {
        File file = new File(fileName);
        CD cd;
        CD[] cds;
        PesquisaCD pesquisaCD = new PesquisaCD();
        cds = new CD[pesquisaCD.contaLinhas2(file)];

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
                cd = new CD();
                cd.setNomeAlbum(dados[0]);
                cd.setTitulo(dados[1]);
                cd.setCompositor(dados[2]);
                cd.setInterprete(dados[3]);
                cd.setAno(dados[4]);
                cds[linhas] = cd;
                linhas++;
            }
            bf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return cds;
    }

    public void listaCD(CD[] cds){
        System.out.println("====> LISTA DE CDs:");
        for (CD cd : cds) {
            System.out.println("Nome do Album..:"+cd.getNomeAlbum());
            System.out.println("Titulo da musica......:"+cd.getTitulo());
            System.out.println("Compositor...:"+cd.getCompositor());
            System.out.println("Interprete...:"+cd.getInterprete());
            System.out.println("Ano...:"+cd.getAno());
            System.out.println("----------------");
        }
    }
}