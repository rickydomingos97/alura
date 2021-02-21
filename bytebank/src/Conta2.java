public class Conta2 {
    double saldo = 100;
    int agencia = 1;
    int numero = 550654;
    String titular;

    // METODO DE DEPOSITO NA CONTA //

    /* 1) Escreva o método deposita, que recebe um valor do tipo double.
    Lembre-se que quando nosso método não retorna nenhum valor,
    devemos colocar a palavra especial void,
    ficando assim: */
    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    // METODO SACA DINHEIRO DA CONTA //
    public boolean saca(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Voce conseguiu sacar!");
            return true;
        } else {
            System.out.println("Voce nao tem saldo suficiente!");
             return false;
        }
    }

    // METODO TRANSFERE DINHEIRO DA CONTA //
    // DESTINO.DEPOSITA POR QUE A TRANSFERENCIA EH COMO UM DEPOSITO PARA OUTRA CONTA //
    public boolean transfere(double valor, Conta2 destino) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);

            System.out.println("TRANSFERENCIA CONCLUIDA COM SUCESSO!");
            return true;
        }else{
            System.out.println("TRANSFERENCIA NAO REALIZADA. VOCE NAO TEM SALDO SUFICIENTE.");
            return false;
        }
    }

}
