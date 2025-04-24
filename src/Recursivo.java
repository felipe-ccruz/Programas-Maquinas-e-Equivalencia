public class Recursivo {
    public int triplica(int n){
        System.out.println("\n\n-----------PROGRAMA---RECUSIVO-----------\n\n");

        int value = R(n);

        System.out.print("Saída: ");
        return value;
    }

    public int R(int n){
        int a = n;
        int b = 0;
         
        if (a!= 0){
            a--;
            b = R(a);
            b++;
            b++;
            b++;

        } 
        return b;
    }    
}
  