public class Produto {
    private String nome;
    private Double preco_venda;
    private Double preco_custo;

    public Produto(String nome, Double preco_venda, Double preco_custo) {
        this.nome = nome;
        this.preco_venda = preco_venda;
        this.preco_custo = preco_custo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco_venda() {
        return preco_venda;
    }

    public Double getPreco_custo() {
        return preco_custo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco_venda(Double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public void setPreco_custo(Double preco_custo) {
        this.preco_custo = preco_custo;
    }
}
