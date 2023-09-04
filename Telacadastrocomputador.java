import java.util.Scanner;

public class Telacadastrocomputador extends Telacadastro {

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

        System.out.print("C.P.U.......");
        this.campoCpu = inputComputador.nextLine();
        System.out.print("R.A.M.....");
        this.campoRam = inputComputador.nextLine();
        System.out.print("Software.....");
        this.campoSoftware = inputComputador.nextLine();
        System.out.println(this.getCampoCpu()+this.getCampoRam()+this.getCampoSoftware());

        //inputComputador.close();
    }


    
}
