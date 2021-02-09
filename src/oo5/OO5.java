package oo5;

import java.util.Scanner;

public class OO5 {
    public static void main(String[] args) {
        /*
            as funções só podem ser realizadas com o "aparelho" ligado
            só pode aumentar ou diminuir o volume com o mudo desligado
        */
        int iOpcao, x = 0;
        
        Scanner opcao = new Scanner(System.in);
        ControleRemoto c = new ControleRemoto();
        
        
        System.out.println("++---------------------++\n"+
                           "||   CONTROLE REMOTO   ||\n"+
                           "++---------------------++\n"+
                           "|| [1]  - LIGAR        ||\n"+ 
                           "|| [2]  - DESLIGAR     ||\n"+
                           "|| [3]  - PLAY         ||\n"+
                           "|| [4]  - PAUSE        ||\n"+
                           "|| [5]  - +VOLUME      ||\n"+
                           "|| [6]  - -VOLUME      ||\n"+ 
                           "|| [7]  - LIGAR MUDO   ||\n"+
                           "|| [8]  - DESLIGAR MUDO||\n"+ 
                           "|| [9]  - MENU         ||\n"+ 
                           "|| [10] - SAIR         ||\n"+ 
                           "++---------------------++");
        while(x == 0){
            System.out.print("|| OPÇÃO =>");
            iOpcao = opcao.nextInt();
                
            if((iOpcao < 1)||(iOpcao > 10)){
                System.out.println("|| OPÇÃO INVÁLIDA ||");
            }else if(iOpcao == 1){
                c.ligar();
            }else if(iOpcao == 2){
                c.desligar();
            }else if(iOpcao == 3){
                c.play();
            }else if(iOpcao == 4){
                c.pause();
            }else if(iOpcao == 5){
                c.maisVolume();
            }else if(iOpcao == 6){
                c.menosVolume();
            }else if(iOpcao == 7){
                c.ligarMudo();
            }else if(iOpcao == 8){
                c.desligarMudo();
            }else if(iOpcao == 9){
                c.abrirMenu();
            }else if(iOpcao == 10){
                x = 1; 
            }
        }                
    }    
}
