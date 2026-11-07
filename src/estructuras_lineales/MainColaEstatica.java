package estructuras_lineales;

public class MainColaEstatica {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA LINEAL ===");
        ColaEstatica cola = new ColaEstatica(5);

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.mostrar();

        System.out.println("Elemento en el frente (peek): " + cola.peek());
        System.out.println("Total de elementos: " + cola.contarElementos());

        System.out.println("Elemento desencolado: " + cola.desencolar());
        cola.mostrar();
        System.out.println("Nuevo frente (peek): " + cola.peek());
        System.out.println("Total de elementos: " + cola.contarElementos());
    }
}