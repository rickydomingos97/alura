public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoRicky = new Conta();
        contaDoRicky.saldo = 100;
        System.out.println("SALDO INICIAL DA CONTA DO RICKY: " + contaDoRicky.saldo);
        contaDoRicky.deposita(550);
        System.out.println("SALDO INICIAL DA CONTA DO RICKY: " + contaDoRicky.saldo);
        contaDoRicky.saca(1330);


        boolean conseguiuRetirar = contaDoRicky.saca(110);
        System.out.println("O SALDO DA CONTA DO RICKY EH: " + contaDoRicky.saldo);
        System.out.println("CONSEGUIU SACAR? " + conseguiuRetirar);
        System.out.println("SALDO CONTA RICKY: " + contaDoRicky.saldo);

        Conta contaDaIrina = new Conta();
        contaDaIrina.deposita(1000);

// NAO USAMOS O THIS NESSE CASO POR QUE JA ESTAMOS USANDO A CONTA DE ORIGEM //
        // METODO TRANSFERE X VALOR >> PARA >> FULANO //
        if (contaDaIrina.transfere(3000, contaDoRicky))
        {
            System.out.println("transferencia realizada com sucesso!");
        } else {
            System.out.println("Ooops! faltou dinheiro!");
        }
        System.out.println("A conta da Irina tem saldo de: " + contaDaIrina.saldo);
        System.out.println("A conta do rickt tem saldo de: " + contaDoRicky.saldo);
    }
}
