package caso1;

import java.util.Scanner;

public class AppCarro {
    public static void main(String args[]){
        int op=0;
        Scanner sc=new Scanner(System.in);
        Carro carro=new Carro();

        do{
            carro.listarDados();
            System.out.println("Selecione uma opção: ");
            System.out.println("(1) - Ligar");
            System.out.println("(2) - Desligar");
            System.out.println("(3) - Acelerar");
            System.out.println("(4) - Frear");
            System.out.println("(5) - Aumentar Marcha");
            System.out.println("(6) - Diminuir Marcha");
            System.out.println("(7) - Virar para direita");
            System.out.println("(8) - Virar para esquerda");
            System.out.println("(9) - Sair");
            op=sc.nextInt();

            switch (op){
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.frear();
                    break;
                case 5:
                    carro.aumentarMarcha();
                    break;
                case 6:
                    carro.diminuirMarcha();
                    break;
                case 7:
                    carro.virarDireita();
                    break;
                case 8:
                    carro.virarEsquerda();
                    break;
                case 9:
                    System.out.println("Finalizando programa!");
                    break;
                default:
                    System.out.println("Essa opção não existe. tente novamente!");
                    break;
            }

        }while (op!=9);
    }
}
