import java.sql.Date;
import java.util.Scanner;

public class TelaCadastro {
    private String id;
    private String nome;
    private String modelo;
    private String fornecedor;
    private Date dataAquisicao;
    private Boolean ativo;

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getFornecedor(){
        return this.fornecedor;
    }

    public Date getDataAquisicao(){
        return this.dataAquisicao;
    }

    public Boolean getAtivo(){
        return this.ativo;
    }

    public void desenhatelacadastro(){
        Scanner input = new Scanner(System.in);
        System.out.print("**********Entrada de dados**********\n\n");
        System.out.print("informe o código:");
        this.id = input.nextLine();
        System.out.print("informe o nome do produto:");
        this.nome = input.nextLine();
        System.out.print("informe o modelo do produto:");
        this.modelo = input.nextLine();
        System.out.print("informe o fornecedor:");
        this.fornecedor = input.nextLine();
        System.out.print("A data de aquisicao:");
        this.dataAquisicao = Date.valueOf(input.nextLine());
        System.out.print("Status do produto:");
        if (input.nextLine().equals("S")){
            this.setAtivo(true);
        }
        else if(input.nextLine().equals("N")) {
            this.setAtivo(false);
        }
    }
    
}
