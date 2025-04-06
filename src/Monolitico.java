public class Monolitico {
    private int input;
    private int n;
    private int k;

    

    public Monolitico(int input) {
        this.input = input;
        this.n = 0;
        this.k = 0;
    }

    public void Rodar(){
        R1();
    }

    public void R1(){
        setN(getInput());
        R2();
    }
    public void R2(){
        setK(getInput()*3);
        R3();
    }
    public void R3(){
        if (getN()==0){
            System.out.println("Fim do programa");
        }else{
            R4();
        }
    }
    public void R4(){
        setN(getN()-1);
        R5();
    }
    public void R5(){
        setN(getN()+1);
        R6();
    }
    public void R6(){
        setN(getN()+1);
        R7();
    }
    public void R7(){
        setN(getN()+1);
        R8();
    }
    public void R8(){
        if (getN() == getK()) {
            System.out.println("Fim do programa " + getN());
        }else{
            R3();
        }
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    
}
