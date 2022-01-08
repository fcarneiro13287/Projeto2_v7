package com.company;
import java.io.*;

public class LP extends BibliotecaDeMusicas {

    String rotacoes;

    //construtor sem parametros
    public LP() {
        this("Nenhum", "Nenhum", "Nenhum", "Nenhum", "", "");
    }

    //construtor com parametros
    public LP(String nomeAlbum, String titulo, String compositor, String interprete, String ano, String rotacoes) {
        super(nomeAlbum, titulo, compositor, interprete, ano);
        this.rotacoes=rotacoes;
    }

    public String getRotacoes() {
        return rotacoes;
    }

    public void setRotacoes(String rotacoes) {
        this.rotacoes = rotacoes;
    }

    public LP[] carregaLP(String fileName) {
        File file = new File(fileName);
        LP lp;
        LP[] lps;
        PesquisaLP pesquisaLP = new PesquisaLP();
        lps = new LP[pesquisaLP.contaLinhas3(file)];

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
                lp = new LP();
                lp.setNomeAlbum(dados[0]);
                lp.setTitulo(dados[1]);
                lp.setCompositor(dados[2]);
                lp.setInterprete(dados[3]);
                lp.setAno(dados[4]);
                lp.setRotacoes(dados[5]);
                lps[linhas] = lp;
                linhas++;
            }
            bf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lps;
    }

    public void listaLP(LP[] lps) {

        System.out.println("\n====> LISTA DE LPs:");
        for (LP lp : lps) {
            System.out.println("Nome do Album..:" + lp.getNomeAlbum());
            System.out.println("Titulo da musica......:" + lp.getTitulo());
            System.out.println("Compositor...:" + lp.getCompositor());
            System.out.println("Interprete...:" + lp.getInterprete());
            System.out.println("Ano...:" + lp.getAno());
            System.out.println("Rotações...:" + lp.getRotacoes());
            System.out.println("----------------");

        }

    }
}



