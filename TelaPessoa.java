import java.util.Scanner;
public class TelaPessoa{

    private int campoId;
    private String campoNome;
    private String campoEndereco;
    private String campoTelefone;

    protected int getCampoid(){
        return campoId;
    }
     protected String getCampoNome(){
        return campoNome;
    }
     protected String getCampoendereco(){
        return campoEndereco;
    }
     protected String getCampotelefone(){
        return campoTelefone;
    }

    protected void desenhatelapessoa(){
        Scanner inputPessoa = new Scanner(System.in);
        System.out.print("\nId:");
        this.campoId = Integer.parseInt(inputPessoa.nextLine());
        System.out.print("\nNome:");
        this.campoNome = inputPessoa.nextLine();
        System.out.print("\nEndereço:");
        this.campoEndereco = inputPessoa.nextLine();
        System.out.print("\nTelefone:");
        this.campoNome = inputPessoa.nextLine();

    }
}