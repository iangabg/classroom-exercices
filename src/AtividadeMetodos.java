import java.util.Scanner;

public class AtividadeMetodos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Digite seu nome: ");
        name = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        age = entrada.nextInt();


        System.out.println(name + " é de maior? " + verificarMaiorIdade(age));

    }

    public static boolean verificarMaiorIdade (int age){
        return age >= 18;
    }
}
