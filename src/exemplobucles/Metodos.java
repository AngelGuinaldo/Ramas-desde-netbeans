package exemplobucles;

import java.util.Scanner;

public class Metodos {

    int nota;
    Scanner ler = new Scanner(System.in);

    public int pedirNota() {
        int res;
        do{
        System.out.println("Escribe una nota");
        res = ler.nextInt();
        if(res <1 || res>10){
            System.out.println("Error, introduce nota valida");
        }
        }while(res <1 || res>10);
        return res;
    }

    public void bucleWhile() {
        nota = pedirNota();
        while (nota >= 5) {
            System.out.println("Aprobado");
            nota = pedirNota();

        }
        System.out.println("Saimos do while");
    }
    
    public void bucleDoWhile(){
        do{
        nota= pedirNota();
        if(nota>=5)
            System.out.println("**Está aprobado**");
        }while(nota>=5);
        System.out.println("Saimos de DoWhile");
        
    }
   //dadas 5 notas visualiza os aprobados
    public void bucleFor(){
        int con;
        for(con=0; con<5 ; con++){
            nota = pedirNota();
            if(nota>=5){
                System.out.println("Aprobado");
            }
            
        }
        System.out.println("Saimos do For");
        
    }

}
