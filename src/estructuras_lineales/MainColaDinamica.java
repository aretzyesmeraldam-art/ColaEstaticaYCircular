package estructuras_lineales;

public class MainColaDinamica {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA DINÁMICA ===");
        ColaDinamica colaDinamica = new ColaDinamica();

        colaDinamica.encolar(5);
        colaDinamica.encolar(15);
        colaDinamica.encolar(25);
        colaDinamica.encolar(35);
        colaDinamica.mostrar();

        System.out.println("Elemento en el frente (peek): " + colaDinamica.peek());
        System.out.println("Total de nodos activos: " + colaDinamica.contarElementos());

        System.out.println("Desencolando: " + colaDinamica.desencolar());
        colaDinamica.mostrar();
        System.out.println("Nuevo frente (peek): " + colaDinamica.peek());
        System.out.println("Total de nodos activos: " + colaDinamica.contarElementos());
    }
}