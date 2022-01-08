package com.company;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PesquisaLP {


    public static int contaLinhas3(File file){
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
        System.out.println("LPs Carregados: "+total);
        return total;
    }
    public static void buscarTitulos(LP[] lps){
        System.out.println("\n=====> TITULOS DE MUSICAS DOS LPs:");
        for (LP lp : lps) {
            if(lp.getTitulo().toLowerCase().contains(lp.getTitulo().toLowerCase())){
                System.out.println("Titulo da musica......:"+lp.getTitulo());
            }
        }
    }
    public static void buscarCompositor(LP[] lps) {
        System.out.println("\n=====> COMPOSITORES DAS MUSICAS DOS LPs:");
        for (LP lp : lps) {
            if (lp.getCompositor().toLowerCase().contains(lp.getCompositor().toLowerCase())) {
                System.out.println("Compositor...:" + lp.getCompositor());
            }
        }
    }
    public static void buscarInterprete(LP[] lps) {
        System.out.println("\n=====> INTERPRETES DAS MUSICAS DOS LPs:");
        for (LP lp : lps) {
            if (lp.getInterprete().toLowerCase().contains(lp.getInterprete().toLowerCase())) {
                System.out.println("Interprete...:" + lp.getCompositor());
            }
        }
    }
    public static void buscarAnoLP(LP[] lps) {
        System.out.println("\n=====> ANO DAS MUSICAS DOS LPs:");
        for (LP lp : lps) {
            if (lp.getAno().toLowerCase().contains(lp.getAno().toLowerCase())) {
                System.out.println("Ano...:" + lp.getAno());
            }
        }
    }
    public static void buscarPorAnoLP(LP[] lps,int inicio, int fim){
        System.out.println("\n=====> ANO DAS MUSICAS DOS LPs:");
        for (LP lp : lps) {
            if ((Integer.parseInt(lp.getAno().trim())>=inicio) && (Integer.parseInt(lp.getAno().trim())<=fim)){
                System.out.println("Titulo: " + lp.getTitulo());
                System.out.println("Ano: " + lp.getAno());
            }
        }
    }
}
