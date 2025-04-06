public class Monolitico {
    private int a;
    private int b;

    

    public Monolitico(int a) {
        this.a = a;
        this.b = 0;
    }

    public void a_sub(){
        setA(getA()-1);
    }

    public void b_add(){
        setB(getB()+1);
    }

    public void Rodar(){
        R1();
    }

    public void R1(){
        R2();
    }
    public void R2(){
        if(getA()==0){
            System.out.println("Fim do programa! " + getB());
        }else{
            R3();
        }
    }
    public void R3(){
            a_sub();
            R4();
    }
    public void R4(){
        b_add();
        R5();
    }
    public void R5(){
        b_add();
        R6();
    }
    public void R6(){
        b_add();
        R2();
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    
    
}
