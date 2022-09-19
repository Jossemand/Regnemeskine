import java.util.Scanner;

public class Regnemaskine {
    public static void main(String[] args) {
        System.out.println("Hejsa, dette er en regnemaskine");
        int tal1;
        int tal2;
        int plusminus;
        java.util.Scanner brugerinput = new  java.util.Scanner(System.in);
        System.out.println("Skriv det første tal");
        tal1 = brugerinput.nextInt();
        System.out.println("Skriv det næste tal");
        tal2 = brugerinput.nextInt();
        System.out.println("Tast 1 for at plusse tallene, tast 2 for at minusse tallene eller tast 3 for at gange");
        plusminus = brugerinput.nextInt();
        if (plusminus == 1) System.out.println(tal1+tal2);
        if (plusminus == 2) System.out.println(tal1-tal2);


    }
}
