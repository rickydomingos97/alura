public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        // System.out.println("saldo primeira conta " + primeiraConta);
        // System.out.println("saldo primeira conta " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; /* Aqui estamos referenciando a segundaConta
        com a primeiraConta. elas tem acesso ao mesmo endereco na memoria.
        Como no caso de duas cartas sendo enviadas ao mesmo endereco residencial.
        Sao duas cartas diferentes mas que tem o mesmo endereco em comum */

        System.out.println(segundaConta);
        System.out.println(primeiraConta);

        System.out.println("O saldo da segunda conta recebendo o valor da primeira conta eh " + segundaConta.saldo);
        segundaConta.saldo += 100;
        System.out.println("O saldo da segunda conta mais 100 eh " + segundaConta.saldo);
        System.out.println("O saldo da primeira conta agora eh de " + primeiraConta.saldo);

        if(segundaConta == primeiraConta) {
            System.out.println("sao a mesma conta");
        }
    }
}
