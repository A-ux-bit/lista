import java.sql.Date;
import java.util.Scanner;

public class Telacadastro{

    private String id;
    private String nome;
    private String modelo;
    private String fornecedor;
    private Date dataAquisicao;
    private Boolean ativo;

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
        this.ativo = Boolean.parseBoolean(input.nextLine());
    }
}
