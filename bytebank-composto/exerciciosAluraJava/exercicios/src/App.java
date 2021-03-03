import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco.logradouro = "rua da alianca";

        System.out.println(p.endereco.logradouro);
    }
}          