import java.util.Scanner;

public class TelaJuridica extends TelaPessoa{
    private String cnpj;

    protected String getCnpj() {
        return cnpj;
    }
protected void desenhatelajuridica(){
    this.desenhatelapessoa();
    Scanner inputPessoaJuridica = new Scanner(System.in);
    System.out.print("Cnpj:");
    this.cnpj = inputPessoaJuridica.nextLine();
}
    
}