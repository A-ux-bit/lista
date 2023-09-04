
import java.sql.Date;

public class Equipamento {
    private String id;
    private String nome;
    private String modelo;
    private String fornecedor;
    private Date dataAquisicao;
    private Boolean ativo;

    //método construtor

    public Equipamento(){
        System.out.println("Classe equipamento construída");
        
    }

      public Equipamento(String id){
        System.out.println("Classe equipamento com id construida: " +id);
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

     public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

     public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }
    public void setDataaquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }


     public String toString(){
        String report;

        report = "*******Listagem de resultado ******* \n" +
                 "id:" + getId() + "\n" +
                 "nome:" + getNome() + "\n" +
                 "modelo:" + getModelo() + "\n" +
                 "fornecedor:" + getFornecedor() + "\n" +
                 "dataaquisicao:" + getDataAquisicao() + "\n" +
                 "ativo:" + getAtivo() + "\n" +
                 "\n" + "******************";

        return report;
    }
}
