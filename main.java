public class main {
    public static void main(String[] args) {
        veiculo v1 = new veiculo(1001, "Fusca");
        veiculo v2 = new veiculo(1002, "Civic");
        veiculo v3 = new veiculo("Palio");
        veiculo v4 = new veiculo("Onix");
        veiculo v5 = new veiculo();

        System.out.println(v1.descricao());
        System.out.println(v2.descricao());
        System.out.println(v3.descricao());
        System.out.println(v4.descricao());
        System.out.println(v5.descricao());

        System.out.println("Total de veículos criados: " + veiculo.getTotalCriados());
        System.out.println("Próximo ID: " + veiculo.getProximoId());
    }
}