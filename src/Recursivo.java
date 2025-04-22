public class Recursivo {
    public int triplica(int n){
        int a = n;
        int b = 0;
         
        if (a!= 0){
            a--;
            b = triplica(a);
            b++;
            b++;
            b++;

        } 
        return b;
    }

    

    public int triplicaNaoEquivalente(int n){
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
        return b;
    }
}
  