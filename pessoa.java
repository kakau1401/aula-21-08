public class pessoa {
    private static int totalPessoas = 0;
    private String nome;
    private int idade;

    // Construtores existentes
    public pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
        totalPessoas++;
    }

    public pessoa(String nome) {
        this(nome, 0);
    }

    public pessoa() {
        this("Sem nome", 0);
    }

    public static int getTotalPessoas() {
        return totalPessoas;
    }

    private void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Desconhecido";
        } else {
            this.nome = nome;
        }
    }

    private void setIdade(int idade) {
        if (idade < 0) {
            this.idade = 0;
        } else {
            this.idade = idade;
        }
    }

    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }

    public String info() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}