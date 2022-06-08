package practicagit;

import java.util.Scanner;

/**
 *
 * @author Aarón Mendoza
 */
public class PracticaGit {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introdueix 3 numeros segun el teu nivel de felicitat: ");
        n1 = scan.nextInt();
        scan.nextLine();

        n2 = scan.nextInt();
        scan.nextLine();

        n3 = scan.nextInt();
        scan.nextLine();
        
        if(n1<n2 && n2<n3){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
    }

}
