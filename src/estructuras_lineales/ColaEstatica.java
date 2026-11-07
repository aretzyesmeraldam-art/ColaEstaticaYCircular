package estructuras_lineales;

public class ColaEstatica {
    private int[] arreglo;
    private int frente;
    private int fin;
    private int capacidad;
    private int tamano;

    public ColaEstatica(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamano = 0;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public boolean estaLlena() {
        return tamano == capacidad;
    }

    public void encolar(int x) {
        if (estaLlena()) {
            System.out.println("La cola está llena.");
            return;
        }
        fin++;
        arreglo[fin] = x;
        tamano++;
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return -1;
        }
        int valor = arreglo[frente];
        frente++;
        tamano--;
        return valor;
    }

    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return -1;
        }
        return arreglo[frente];
    }

    public int contarElementos() {
        return tamano;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Frente -> ");
        for (int i = frente; i <= fin; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }
        System.out.println("<- Fin");
    }
}