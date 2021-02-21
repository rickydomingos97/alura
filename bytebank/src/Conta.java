public class Conta {
    double saldo = 50;
    int agencia = 3101;
    int numero;
    String titular;

    // METODO EM JAVA //
    // DEPOSITO NA CONTA //
    public void deposita(double valor){
    this.saldo += + valor;
    }
    // SAQUE NA CONTA //
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
            System.out.println("voce retirou!");
    		return true;
    	} else {
           // System.out.println("voce nao tem saldo");
           // System.out.println("O seu saldo eh: " + saldo);
    		return false;
    	}
    }
// TRANSFERENCIA NA CONTA //
    /*
    * Quando transferimos, precisamos de um valor e uma conta para receber a transferencia
    * Nesse caso a Conta destino sera a contaDoRicky no TestaMetodo
    * */
    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}

// ISSO AINDA NAO EH UMA CONTA //
// ISSO EH UMA ESPECIFICACAO PARA CONSTRUIR CONTAS //