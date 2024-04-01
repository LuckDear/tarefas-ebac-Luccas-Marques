public class Main {
    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1L, 10d, "TV");
        Produto produtoCell = criarProduto(12L, 1000d, "Celular");
        
        Vendedor vendedor = criarVendedor("Junior",10d);

        Comprador comprador = criarComprador("Luccas", 3000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoCell);
        venda.add(produtoTV);

        venda.concretizarVenda();
    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);

    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }


    private static Produto criarProduto(Long codigo, Double preco, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(String.valueOf(codigo));
        produto.setPreco(preco);
        produto.setNome(nome);
        return produto;
    }
}