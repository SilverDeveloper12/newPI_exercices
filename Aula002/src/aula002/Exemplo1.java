package aula002;
import java.util.Scanner;

public class Exemplo1{
    public static void main(String []args){
        Scanner input = new Scanner(System.in); 
        
        System.out.println("*-- Calculo da media --*");
        System.out.print("Nome: ");
        String name = input.next();
        System.out.print("Nota 1: ");
        float n1 = input.nextFloat();
        System.out.print("Nota 2: ");
        float n2 = input.nextFloat();
        System.out.print("Nota 3: ");
        float n3 = input.nextFloat();
        System.out.print("Faltas: ");
        byte faltas = input.nextByte();
        
        float media = (n1+n2+n3)/3;
        System.out.println("Media: "+media);
        
        
        if((media >= 6) && (faltas <= 18)){
            System.out.print("Senhor " + name);
            System.out.println(", Parabens o senhor foi aprovado!!!");
        }  
            if(faltas > 18){
                System.out.println("Perdao, o senhor foi reprovado por falta");
              }else{
                if((media < 6)&&( faltas <=18)){
                    System.out.print("Senhor " + name);
                    System.out.println(", o senhor reprovou por nota mas, uma prova de recuperacao existe e caso passe, aprovado em!");
                    System.out.println("*** exame!!! boa sorte!!! ***");
                    System.out.print("Nota do exame: ");
                    float rec = input.nextFloat();
                
                    float newmedia = (rec + media)/2;
                
                        if(newmedia >= 6){
                            System.out.println("aprovado mano boa");
                            
                        }else{
                            System.out.println("O senhor foi reprovado, perdao");
                        }
                        
                   
                }
    
         }
    }
}

