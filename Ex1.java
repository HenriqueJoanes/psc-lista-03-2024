import java.util.Scanner;

public class Ex1 {

       public static void main(String[] args){
        
         System.out.println("Digíte o 1° número: ");
         Scanner scanner = new Scanner(System.in);
         double numero1 = scanner.nextDouble();

         System.out.println("Digite o segundo número");
         double numero2 = scanner.nextDouble();

         System.out.println("Digite o 3° número");
         double numero3 = scanner.nextDouble();

         //Encontrar o maior número
         double maior = numero1;
         if (numero2 > maior){
             maior = numero2;
         }
         if(numero3 > maior){
            maior = numero3;
         }
         double menor = numero1;
        if(numero2 < menor){
            menor = numero2;
         }
         if(numero3 < menor){
            menor = numero3;
         }

         double media = (numero1 + numero2 + numero3) / 3;


         System.out.println("O maior número é: " + maior);
         System.out.println("O menor número é: " + menor);
         System.out.println("A media é: " + media);

         scanner.close();











       }
}