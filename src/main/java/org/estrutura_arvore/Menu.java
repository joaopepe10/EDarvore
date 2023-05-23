package org.estrutura_arvore;

import java.util.Scanner;

public class  Menu {
    public static Scanner in;
    public Menu(){
        in = new Scanner(System.in);
    }
    public static void chamarMenu(){
        in = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("DIGITE UMA OPCAO: ");
            System.out.println("1-INCLUIR NO NA ARVORE: ");
            System.out.println("2-EXCLUIR NO DA ARVORE: ");
            System.out.println("3-MOSTRE QUANTOS NOS EXISTEM NA ARVORE: ");
            System.out.println("4-MOSTRE O GRAU DA ARVORE: ");
            System.out.println("5-MOSTRE A ALTURA DA ARVORE: ");
            System.out.println("6-BUSCA EM PROFUNDIDADE: ");
            System.out.println("7-BUSCA EM AMPLITUDE: ");
            System.out.println("8-SAIR: ");
            opc = in.nextInt();

            switch (opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        }while (opc != 8);
    }
}
