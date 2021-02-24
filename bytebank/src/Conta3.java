public class Conta3 {
    double saldo = 100;
    int agencia;
    int numero;
    String titular;
    Integer digito;

    // DEPOSITAR //
    public void deposita(double valor){
        this.saldo += + valor;
    }

    // SACAR //
    public boolean saca(double valor){
        if(this.saldo >= valor){
            System.out.println("SAQUE REALIZADO COM SUCESSO");
            return true;
        }else {
            System.out.println("SAQUE NAO REALIZADO");
            return false;
        }
    }

    // TRANSFERENCIA //

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            destino.deposita(valor);
            System.out.println("TRANSFERENCIA REALIZADA");
            return true;
        }else{
            System.out.println("TRANSFERENCIA NAO REALIZADA");
            return false;
        }
    }
}




