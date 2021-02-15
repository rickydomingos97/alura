public class App {
    public static void main(String[] args) {
        Pessoa funcionario = new Pessoa();
        funcionario.nome = "Ricardo";
        funcionario.idade = 38;
        funcionario.sexo = "Masculino";

        Pessoa gerente = new Pessoa();
        gerente.nome = "Joao";
        gerente.idade = 67;
        gerente.sexo = "Masculino";

        System.out.println(funcionario);
        System.out.println(gerente);
    }
}
