package com.company;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PesquisaCD {


    public static int contaLinhas2(File file){
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
        System.out.println("CDs Carregados :"+total);
        return total;
    }

    public static void  buscarTitulos(CD[] cds){
        System.out.println("\n=====> TITULOS DE MUSICAS DOS CDs:");
        for (CD cd : cds) {
            if(cd.getTitulo().toLowerCase().contains(cd.getTitulo().toLowerCase())){
                System.out.println("Titulo da musica......: "+cd.getTitulo());
            }
        }
    }
    public static void buscarCompositor(CD[] cds) {
        System.out.println("\n=====> COMPOSITORES DAS MUSICAS DOS CDs:");
        for (CD cd : cds) {
            if (cd.getCompositor().toLowerCase().contains(cd.getCompositor().toLowerCase())) {
                System.out.println("Compositor...:" + cd.getCompositor());
            }
        }
    }
    public static void buscarInterprete(CD[] cds) {
        System.out.println("\n=====> INTERPRETES DAS MUSICAS DOS CDs:");
        for (CD cd : cds) {
            if (cd.getInterprete().toLowerCase().contains(cd.getInterprete().toLowerCase())) {
                System.out.println("Interprete...:" + cd.getCompositor());
            }
        }
    }
    public static void buscarAnoCD(CD[] cds) {
        System.out.println("\n=====> ANO DAS MUSICAS DOS CDs:");
        for (CD cd : cds) {
            if (cd.getAno().toLowerCase().contains(cd.getAno().toLowerCase())) {
                System.out.println("Ano...:" + cd.getAno());
            }
        }
    }
    public static void buscarPorAnoCD(CD[] cds,int inicio, int fim){
        System.out.println("\n=====> ANO DAS MUSICAS DOS CDs:");
        for (CD cd : cds) {
            if ((Integer.parseInt(cd.getAno().trim())>=inicio) && (Integer.parseInt(cd.getAno().trim())<=fim)){
                System.out.println("Titulo: " + cd.getTitulo());
                System.out.println("Ano: " + cd.getAno());
            }
        }
    }
}

