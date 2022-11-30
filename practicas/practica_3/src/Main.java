public class Main {
    public static void main(String[] args) {
        arbol arbol=new arbol();
        arbol.insertar(45);
        arbol.insertar(80);
        arbol.insertar(90);
        arbol.insertar(3);
        arbol.insertar(50);
        arbol.insertar(40);
        System.out.println("inorden");
        arbol.dispararInorden();
        System.out.println("");
        System.out.println("postorden");
        arbol.dispararPostorden();
        System.out.println("");
        System.out.println("preorden");
        arbol.dispararPreorden();

    }
}