public class Aluno {
    String name;
    int age;

    public Aluno(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void exibirDados(){
        System.out.println(name + " - " + age);
    }
}


