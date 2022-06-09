import java.util.Scanner;

public class Atividades {
    public static void main (String[] args){
         Scanner entrada = new Scanner(System.in);

         System.out.println("digite um numero:");
         double  numero1 = entrada.nextDouble();

    
         System.out.println("digite um numero:");
         double  numero2 = entrada.nextDouble();

         double resultado = (numero1 + numero2);

         System.out.println("O resultado  " + resultado);
        //2
         System.out.println("Digite uma medida (em metros):" );
         double metros = entrada.nextDouble();
     
         double centimetros = (metros *100);
         System.out.println("Voce tem " + centimetros +"cm");
     
         //3
     
         System.out.println("Digite um numero:" );
         double numero = entrada.nextDouble();
         double par = (numero %2);
     
             if (par == 0){
                 System.out.println("Seu numero e par");
             } else{
                 System.out.println("Seu numero e impar");
             }
     
         //4
         
         System.out.println("Digite sua velocidade:" );
         double velocidade = entrada.nextDouble();
     
         double multa = (velocidade-80)*5;
     
             if (velocidade > 80){
                 System.out.println("Voce é burro, sua multa e de, " +multa);
             } else{
                 System.out.println("mandou bem,carinha");
             }
         }
     }

    


