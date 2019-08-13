import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int alto = Integer.parseInt(scanner.nextLine());
        int ancho = Integer.parseInt(scanner.nextLine());
        System.out.println("Area = " + (ancho*alto));
        System.out.println("Perimetro = " + (2*ancho+2*alto));
    }
}
