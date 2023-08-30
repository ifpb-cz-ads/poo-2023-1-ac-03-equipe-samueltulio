import java.util.Scanner;
public class CBBAtividadePratica3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a base de um retângulo:");
        double base = scanner.nextDouble();
        System.out.print("Informe a altura de um retângulo:");
        double altura = scanner.nextDouble();
        double area = (base*altura);
        System.out.println("A Area do retângulo é:" + area);
    }
   
}
