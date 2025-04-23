import java.util.Scanner;

public class Iterativo {
    public int triplica(){
        System.out.println("\n\n-----------PROGRAMA---ITEATIVO-----------\n\n");
        System.out.print("Digite um numero inteiro: ");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;

        while(a != 0){
            a--;
            b++;
            b++;
            b++;
        }

        sc.close();

        System.out.print("Saída: ");
        return b;
    } 
}
