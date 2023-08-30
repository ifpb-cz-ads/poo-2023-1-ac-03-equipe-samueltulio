import java.util.Scanner;
public class CBBAtividadePratrica4{
     public static final float CEM = 100f;
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Calculadora de Orçamento de Piscina");
         System.out.print("Informe o comprimento da piscina (metros): ");
         double comprimento = scanner.nextDouble();
         System.out.print("Informe a largura da piscina (metros): ");
         double largura = scanner.nextDouble();
         System.out.print("Informe a profundidade da piscina (metros): ");
         double profundidade = scanner.nextDouble();
         double cubagem = comprimento * largura * profundidade;
         double valorTotal = cubagem * CEM;
         System.out.printf("O valor total para a construção da piscina é de R$%.2f",valorTotal);
         scanner.close();
         
     }
 
}
