public class OrdemDePedido {
    private Integer quantidade;
    private Double valor;

    //Composicão tem um
    private Produto produto;

    public OrdemDePedido() {

    }

    public OrdemDePedido(Integer quantidade, Double valor, Produto produto) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.produto = produto;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public double subTotal() {
    return  valor * quantidade;
    }
}

