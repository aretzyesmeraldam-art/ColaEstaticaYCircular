package estructuras_lineales;

public class MainColaCircular {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===");
        ColaEstaticaCircular colaCircular = new ColaEstaticaCircular(3);

        colaCircular.encolar(100);
        colaCircular.encolar(200);
        colaCircular.encolar(300);
        colaCircular.mostrar();

        System.out.println("Elemento en el frente (peek): " + colaCircular.peek());
        System.out.println("Total de elementos: " + colaCircular.contarElementos());

        System.out.println("Desencolando un elemento: " + colaCircular.desencolar());
        colaCircular.mostrar();

        System.out.println("Reutilizando espacio disponible (encolar 400)...");
        colaCircular.encolar(400);
        colaCircular.mostrar();
        System.out.println("Elemento en el frente (peek): " + colaCircular.peek());
        System.out.println("Total de elementos: " + colaCircular.contarElementos());
    }
}