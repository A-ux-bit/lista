import java.util.Scanner;

public class Telafornecedor extends TelaJuridica{
    private String campoProduto;
    private String descricaoproduto;

    protected String getCampoProduto() {
        return campoProduto;
    }
    protected String getDescricaoproduto() {
        return descricaoproduto;
    }
    protected void desenhatelafornecedor(){
    this.desenhatelafornecedor();
    Scanner inputFornecedor = new Scanner(System.in);
    System.out.print("Produto:");
    this.campoProduto = inputFornecedor.nextLine();
    System.out.print("Descrição do produto:");
    this.descricaoproduto = inputFornecedor.nextLine();
}

    
}
