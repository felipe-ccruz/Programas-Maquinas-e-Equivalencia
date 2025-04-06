public class Recursivo {

    public int triplica(int n){

        if (n!= 0){
            n--;
            n = triplica(n);
            n++;
            n++;
            n++;

        } 
        return n;
    }

    

    public int triplicaNaoEquivalente(int n){
        if (n!= 0){
            n--;
            n = triplica(n);
            n++;
            n++;
            n--;
            n++;
            n++;

        } 
        return n;
    }
}
  