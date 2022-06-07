import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        int a,b,c,cevre;
        double alankare,alan,z;



        System.out.print("Kenar1 :");
        a = input.nextInt();

        System.out.print("Kenar2 :");
        b = input.nextInt();

        System.out.print("Kenar3 :");
        c = input.nextInt();


        cevre = a+b+c;
        z = cevre/2;
        alankare = z * (z - a)* (z - b) * (z - c);
        alan= Math.sqrt(alankare);

        System.out.print("\n");
        System.out.println("Üçgenin Alanı: "+ alan + " m²");

    }
}
