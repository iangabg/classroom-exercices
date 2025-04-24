import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor;

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);
        lista.add(2);
        lista.add(5);
        lista.add(4);

        System.out.println("Informe um número: ");
        valor = entrada.nextInt();

        System.out.println("Encontrado no indice: " + lista.indexOf(valor));

        Collections.sort(lista);

        System.out.println("Informe outro número: ");
        valor = entrada.nextInt();

        System.out.println("Encontrado no indice: " + Collections.binarySearch(lista, valor));
    }
}