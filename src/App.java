public class App {
    public static void main(String[] args) throws Exception {
        Iterativo it = new Iterativo();
        System.out.println(it.triplica());
        
        System.out.println("\n\n");

        Recursivo r = new Recursivo();
        System.out.println(r.triplica(3));
    }
}
