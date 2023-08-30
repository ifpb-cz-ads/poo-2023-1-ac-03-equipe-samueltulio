import java.util.Scanner;
public class CBBAtividadePratica3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a base de um triangulo:");
        double base = scanner.nextDouble();
        System.out.print("Informe a altura de um triangulo:");
        double altura = scanner.nextDouble();
        double area = (base*altura)/2;
        System.out.println("A Area do triangulo é:" + area);
        scanner.close();
    }
   
}
