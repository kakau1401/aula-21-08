public class main2 {
    public static void main(String[] args) {
        pessoa p1 = new pessoa("Alice", 25);
        pessoa p2 = new pessoa("Bob");
        pessoa p3 = new pessoa();
        pessoa p4 = new pessoa("Charlie", -5); // idade negativa

        System.out.println(p1.info() + ", Maior de idade: " + p1.isMaiorDeIdade());
        System.out.println(p2.info() + ", Maior de idade: " + p2.isMaiorDeIdade());
        System.out.println(p3.info() + ", Maior de idade: " + p3.isMaiorDeIdade());
        System.out.println(p4.info() + ", Maior de idade: " + p4.isMaiorDeIdade());

        System.out.println("Total de pessoas criadas: " + pessoa.getTotalPessoas());
    }
}