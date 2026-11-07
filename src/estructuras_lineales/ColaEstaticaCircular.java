package estructuras_lineales;

public class ColaEstaticaCircular {
    private int[] arreglo;
    private int frente;
    private int fin;
    private int capacidad;
    private int tamano;

    public ColaEstaticaCircular(int capacidad) {
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
            System.out.println("La cola circular está llena.");
            return;
        }
        fin = (fin + 1) % capacidad;
        arreglo[fin] = x;
        tamano++;
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola circular está vacía.");
            return -1;
        }
        int valor = arreglo[frente];
        frente = (frente + 1) % capacidad;
        tamano--;
        return valor;
    }

    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola circular está vacía.");
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
        for (int i = 0; i < tamano; i++) {
            int indice = (frente + i) % capacidad;
            System.out.print("[" + arreglo[indice] + "] ");
        }
        System.out.println("<- Fin");
    }
}