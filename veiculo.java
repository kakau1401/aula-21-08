public class veiculo {
    private static int totalCriados = 0;
    private static int proximoId = 1001;
    private final int id;
    private String modelo;

    public veiculo(int id, String modelo) {
        this.id = id;
        setModelo(modelo);
        totalCriados++;
    }

    public veiculo(String modelo) {
        this(proximoId++, modelo);
    }

    public veiculo() {
        this("Genérico");
    }

    public static int getProximoId() {
        return proximoId;
    }

    private void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            this.modelo = "Indefinido";
        } else {
            this.modelo = modelo;
        }
    }

    public String descricao() {
        return "Veículo ID: " + id + ", Modelo: " + modelo;
    }

    public static int getTotalCriados() {
        return totalCriados;
    }
}