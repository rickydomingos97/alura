public class TestaMetodoExercicios {
    public static void main(String[] args) {
        Conta2 contadaIrina = new Conta2();
        contadaIrina.saldo = 200;
        System.out.println("Saldo conta Irina: " + contadaIrina.saldo);
        contadaIrina.deposita(1000);
        System.out.println("Irina tem o saldo de R$" + contadaIrina.saldo);

        Conta2 contaDoRicardo = new Conta2();
        contaDoRicardo.saldo = 50;
        System.out.println("saldo conta ricardo: " + contaDoRicardo.saldo);

        contadaIrina.transfere(200, contaDoRicardo);
        System.out.println("saldo conta ricardo agora: " + contaDoRicardo.saldo);


    }
}
