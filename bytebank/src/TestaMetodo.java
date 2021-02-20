public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoRicky = new Conta();
        contaDoRicky.saldo = 100;
        contaDoRicky.deposita(150);
        // contaDoRicky.saca(1330);


        boolean conseguiuRetirar = contaDoRicky.saca(1113);
        // System.out.println(contaDoRicky.saldo);
        // System.out.println(conseguiuRetirar);

        Conta contaDaIrina = new Conta();
        contaDaIrina.deposita(1000);
// NAO USAMOS O THIS NESSE CADO POR QUE JA ESTAMOS USANDO A CONTA DE ORIGEM //
        // //
        if (contaDaIrina.transfere(3000, contaDoRicky))
        {
            System.out.println("transferencia realizada com sucesso!");
        }else{
            System.out.println("Ooops! faltou dinheiro!");
        }
        System.out.println("A conta da Irina tem saldo de: " + contaDaIrina.saldo);
        System.out.println("A conta do rickt tem saldo de: " + contaDoRicky.saldo);
    }
}
