public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoRicky = new Conta();
        contaDoRicky.saldo = 100;
        contaDoRicky.deposita( 50);

        System.out.println("O VALOR DO SALDO EM CONTA EH DE: " + contaDoRicky.saldo);
        System.out.println();
    }
}
