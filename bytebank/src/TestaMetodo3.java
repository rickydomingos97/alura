public class TestaMetodo3 {
    public static void main(String[] args) {
        Conta3 contaRicardo = new Conta3();
        Conta3 contaIrina = new Conta3();
        Conta3 contaMae = new Conta3();
        // System.out.println("saldo da conta " + contaRicardo.saldo);
    // DEPOSTAR //
        contaRicardo.deposita(100);
        // System.out.println(contaRicardo.saldo);

    // SACAR //
        contaRicardo.saca(0);
        contaIrina.saca(0);
        contaMae.saca(0);
    // DEPOSITAR //
        contaRicardo.deposita(100);
        contaIrina.deposita(350);
        contaMae.deposita(500);
    // TRANSFERIR //
        System.out.println("SALDO CONTA RICARDO: "  + contaRicardo.saldo);
        System.out.println("SALDO CONTA IRINA: " + contaIrina.saldo);
        System.out.println("SALDO CONTA MAE: " + contaMae.saldo);
        System.out.println(contaRicardo.digito);
        System.out.println(contaRicardo.agencia);
    }
}
