import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner foo = new Scanner(System.in);

        String s1, s2, s3;
        
        s1 = foo.nextLine();
        s2 = foo.nextLine();
        s3 = foo.nextLine();
        
        System.out.println("Dado digito: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        foo.close();
        
    } 
}
