public class TestaCondicional {
    public static void main(String[] args){
        System.out.println("testando condicionais");

        int idade = 2;
        int quantidadePessoas = 1;

        if (idade >= 18){
            System.out.println("voce tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        }else if (quantidadePessoas >2 ){
            System.out.println(" voce tem menos de 18, mas esta acompanhado de pessoas e pode entrar");
        } else {
            System.out.println("Infelimente voce nao pode entrar");
        }

    }
}
