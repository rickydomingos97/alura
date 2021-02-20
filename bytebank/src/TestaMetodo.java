public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoRicky = new Conta();
        contaDoRicky.saldo = 100;
        contaDoRicky.deposita(150);
        // contaDoRicky.saca(1330);


        boolean conseguiuRetirar = contaDoRicky.saca(1113);
        System.out.println(contaDoRicky.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaIrina = new Conta();
        contaDaIrina.deposita(1000);
// Nao precisa usar o this aqui, por que ja pasasmos a origem contaDaIrina //
        contaDaIrina.tranfere(300, contaDoRicky);
    }
}
