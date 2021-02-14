public class TestaEscolpo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        /*
         boolean acompanhado = quantidadePessoas > 2;
         System.out.println(" o valor de acompanhado eh " + acompanhado);
        */
        boolean acompanhado;

        if(quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }


        if (idade >= 18) {
            System.out.println("voce tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        } else if (quantidadePessoas > 2) {
            System.out.println(" voce tem menos de 18, mas esta acompanhado de pessoas e pode entrar");
        } else {
            System.out.println("Infelimente voce nao pode entrar");
        }

    }
}
