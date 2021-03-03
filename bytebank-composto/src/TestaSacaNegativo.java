public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(205);
        conta.saca(300);
        System.out.println(conta.pegaSaldo());
    }
}
