public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("Primeira conta tem saldo de " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 55;
        System.out.println("Segunda conta tem saldo de " + segundaConta.saldo);

        Conta terceiraConta = new Conta();
        System.out.println("A terceira conta tem saldo de " + terceiraConta.saldo);

        System.out.println("A agencia da primeira conta eh " + primeiraConta.agencia);
        System.out.println("a agencia da segunda conta eh " + segundaConta.agencia);
        System.out.println("O titular da primeira conta eh " + primeiraConta.titular);
    }
}
