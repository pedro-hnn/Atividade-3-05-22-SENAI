public class Pessoa {
    private Double peso;
    private String nome;
    private Double altura;
    private int idade;

    public Pessoa(String nome, Double peso, Double altura, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public Double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
