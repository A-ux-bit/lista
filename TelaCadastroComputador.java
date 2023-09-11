import java.util.Scanner;
import java.sql.Date;
public class TelaCadastroComputador extends TelaCadastro {
    private String campoCpu;
    private String campoRam;
    private String campoSoftware;
   
    
    public String getCampoCpu() {
        return campoCpu;
    }


    public String getCampoRam() {
        return campoRam;
    }


    public String getCampoSoftware() {
        return campoSoftware;
    }



    public void desenhaTelacadastroComputador(){
        Scanner inputComputador = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Código.......");
        this.setId(inputComputador.nextLine());
        System.out.print("Nome.......");
        this.setNome(inputComputador.nextLine());
        System.out.print("Modelo.......");
        this.setModelo(inputComputador.nextLine());
        System.out.print("Fornecedor.......");
        this.setFornecedor(inputComputador.nextLine());
        //System.out.print("Data de aquisição.......");
        //this.setDataAquisicao(String.inputComputador.nextLine());
        System.out.print("C.P.U.......");
        this.campoCpu = inputComputador.nextLine();
        System.out.print("R.A.M.....");
        this.campoRam = inputComputador.nextLine();
        System.out.print("Software.....");
        this.campoSoftware = inputComputador.nextLine();
        System.out.print("Ativo [S/N].......");
        
        if (input.nextLine().equals("S")){
            this.setAtivo(true);
        }
        else if(input.nextLine().equals("N")) {
            this.setAtivo(false);
        }

        //inputComputador.close();
    }

}
