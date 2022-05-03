public class Animal {
    private String nome;
    private int quant_patas;
    private String especie;

    public Animal(String nome, int quant_patas, String especie) {
        this.nome = nome;
        this.quant_patas = quant_patas;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant_patas() {
        return quant_patas;
    }

    public void setQuant_patas(int quant_patas) {
        this.quant_patas = quant_patas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
