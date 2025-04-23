public class Recursivo {
    public int triplica(int n){
        System.out.println("\n\n-----------PROGRAMA---RECUSIVO-----------\n\n");

        int a = n;
        int b = 0;
         
        if (a!= 0){
            a--;
            b = triplica(a);
            b++;
            b++;
            b++;

        } 

        System.out.print("Saída: ");
        return b;
    }

    

    public int triplicaNaoEquivalente(int n){
        System.out.println("\n\n-----------PROGRAMA---RECUSIVO-----------\n\n");

        int a = n;
        int b = 0;

        if (n!= 0){
            a--;
            b = triplica(a);
            b++;
            b++;
            b--;
            b++;
            b++;

        } 

        System.out.print("Saída: ");
        return b;
    }
}
  