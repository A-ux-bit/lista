import java.util.Scanner;

public class TelaFisica extends TelaPessoa{
    private String cpf;

    protected String getCpf() {
        return cpf;
    }
    protected void desenhatelaFisica(){
    this.desenhatelapessoa();
    Scanner inputPessoaFisica = new Scanner(System.in);
    System.out.print("Cpf:");
    this.cpf = inputPessoaFisica.nextLine();
}
    
}
