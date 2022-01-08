package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        CD[] cds;
        CD cd = new CD();
        cds = cd.carregaCD("CD.txt");

        MP3[] mp3s;
        MP3 mp3 = new MP3();
        mp3s = mp3.carregaMp3("MP3.txt");

        LP[] lps;
        LP lp = new LP();
        lps = lp.carregaLP("Lp.txt");


        int menu;
        int anoInicial, anoFinal;

        do {
            exibirMenu();
            menu = in.nextInt();
            switch (menu) {
                case 1: {
                    System.out.println("\n== IMPRESSÃO DAS LISTAS DE MUSICAS ==\n");
                    cd.listaCD(cds);
                    mp3.listaMP3(mp3s);
                    lp.listaLP(lps);
                    break;
                }
                case 2: {
                    PesquisaCD.buscarCompositor(cds);
                    PesquisaMP3.buscarCompositor(mp3s);
                    PesquisaLP.buscarCompositor(lps);
                    break;
                }
                case 3: {
                    PesquisaCD.buscarTitulos(cds);
                    PesquisaMP3.buscarTitulos(mp3s);
                    PesquisaLP.buscarTitulos(lps);
                    break;
                }
                case 4: {
                    PesquisaCD.buscarInterprete(cds);
                    PesquisaMP3.buscarInterprete(mp3s);
                    PesquisaLP.buscarInterprete(lps);
                    break;
                }
                case 5: {
                    PesquisaCD.buscarAnoCD(cds);
                    PesquisaMP3.buscarAnoMP3(mp3s);
                    PesquisaLP.buscarAnoLP(lps);
                    break;
                }
                case 6: {
                    System.out.print("Ano de Inicio da Busca: ");
                    anoInicial = in.nextInt();
                    System.out.print("Ano de Fim da Busca: ");
                    anoFinal = in.nextInt();
                    PesquisaCD.buscarPorAnoCD(cds,anoInicial,anoFinal);
                    PesquisaMP3.buscarPorAnoMP3(mp3s,anoInicial,anoFinal);
                    PesquisaLP.buscarPorAnoLP(lps,anoInicial,anoFinal);
                    break;
                }
                case 7: {
                    PesquisaMP3.buscarTamanhoBytes(mp3s);
                    break;
                }
                case 8: {
                    System.out.println("FIM");
                    break;
                }
                default: {
                    System.out.println("Opção de menu inválida!!");
                }
            }
        } while (menu != 8);
    }
    //metodo para exibir menu
    static void exibirMenu(){
        System.out.println("\n=====> CADASTRO DE MUSICAS: ");
        System.out.println("Selecione uma opção: ");
        System.out.println("[1] LISTAR MUSICAS ");
        System.out.println("[2] PESQUISA POR COMPOSITOR ");
        System.out.println("[3] PESQUISA por TITULO  ");
        System.out.println("[4] PESQUISA por INTERPRETE");
        System.out.println("[5] ANOS DAS MUSICAS");
        System.out.println("[6] PESQUISA por PERIODO DE ANOS (INICIO-FIM)");
        System.out.println("[7] TAMANHO EM BYTES DOS Ficheiros MP3");
        System.out.println("[8] Sair");
        System.out.print("=========> Introduza a opção pretendida: ");
    }
}
