package caso2;

import java.util.Scanner;

public class AppTelevisao {
    public static void main(String agrs[]){
        int op=0;

        Scanner sc=new Scanner(System.in);
        Televisao tv=new Televisao(48);

        do {
            System.out.println("CONTROLE: ");
            System.out.println("(1) - ligar/desligar");
            if(tv.getLigado()){
                tv.listarDados();
                System.out.println("(2) - Aumentar volume");
                System.out.println("(3) - Diminuir volume");
                System.out.println("(4) - Aumentar canal");
                System.out.println("(5) - Diminuir canal");
            }
            System.out.println("(6) - Sair do programa");
            op= sc.nextInt();

            switch(op){
                case 1:
                    if(tv.getLigado()){
                        tv.desligarTv();
                    }else {
                        tv.ligarTv();
                    }
                    break;
                case 2:
                    if(tv.getLigado()){
                        tv.aumentarVolume();
                    }
                    break;
                case 3:
                    if(tv.getLigado()){
                        tv.diminuirVolume();
                    }
                    break;
                case 4:
                    if(tv.getLigado()){
                        tv.aumentarCanal();
                    }
                    break;
                case 5:
                    if(tv.getLigado()){
                        tv.diminuirCanal();
                    }
                    break;
                case 6:
                    System.out.println("Finalizando programa!");
                    break;
                default:
                    System.out.println("Essa opção não existe. Tente outra!");
                    break;
            }

        }while (op!=6);

    }
}
