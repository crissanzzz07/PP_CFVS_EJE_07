//https://github.com/crissanzzz07/PP_CFVS_EJE_07
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Función para leer un dato y agregarlo a la lista
    public static void leerDato(List<Integer> lista, Scanner sc) {
        System.out.print("Ingrese un numero entero: ");
        int valor = sc.nextInt();
        lista.add(valor);
        System.out.println("Dato agregado a la lista.");
    }

    // Función para mostrar los números pares de la lista
    public static void mostrarPares(List<Integer> lista) {
        System.out.println("Numeros pares de la lista:");
        boolean hayPares = false;
        for (int valor : lista) {
            if (valor % 2 == 0) {
                System.out.println(valor);
                hayPares = true;
            }
        }
        if (!hayPares) {
            System.out.println("No hay numeros pares en la lista.");
        }
    }

    // Función para mostrar el cuadrado de cada valor de la lista
    public static void mostrarCuadrados(List<Integer> lista) {
        System.out.println("Cuadrado de los valores de la lista:");
        for (int valor : lista) {
            System.out.println(valor + "^2 = " + (valor * valor));
        }
    }

    // Función para sumar los elementos de la lista
    public static int sumarElementos(List<Integer> lista) {
        int suma = 0;
        for (int valor : lista) {
            suma += valor;
        }
        return suma;
    }

    // Función para buscar un elemento en la lista
    public static void buscarElemento(List<Integer> lista, Scanner sc) {
        System.out.print("Ingrese el numero a buscar: ");
        int buscado = sc.nextInt();
        int posicion = lista.indexOf(buscado);
        if (posicion != -1) {
            System.out.println("El numero " + buscado + " se encontro en la posicion " + posicion + ".");
        } else {
            System.out.println("El numero " + buscado + " no se encuentra en la lista.");
        }
    }

    // Función para encontrar el valor máximo de la lista
    public static int encontrarMaximo(List<Integer> lista) {
        int maximo = lista.get(0);
        for (int valor : lista) {
            if (valor > maximo) {
                maximo = valor;
            }
        }
        return maximo;
    }

    // Función que muestra el menú de opciones
    public static void mostrarMenu() {
        System.out.println("\n===== MENU DE OPCIONES =====");
        System.out.println("1.- Leer dato");
        System.out.println("2.- Muestre numeros pares");
        System.out.println("3.- Muestre los cuadrado de los valores");
        System.out.println("4.- Suma de los elementos de la lista");
        System.out.println("5.- Buscar un elementos de la lista");
        System.out.println("6.- Encontrar valor maximo");
        System.out.println("7.- Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    leerDato(lista, sc);
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        mostrarPares(lista);
                    }
                    break;
                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        mostrarCuadrados(lista);
                    }
                    break;
                case 4:
                    if (lista.isEmpty()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        System.out.println("Suma de los elementos: " + sumarElementos(lista));
                    }
                    break;
                case 5:
                    if (lista.isEmpty()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        buscarElemento(lista, sc);
                    }
                    break;
                case 6:
                    if (lista.isEmpty()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        System.out.println("Valor maximo: " + encontrarMaximo(lista));
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        } while (opcion != 7);

        sc.close();
    }
}
