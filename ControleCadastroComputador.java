import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class ControleCadastroComputador {
    private ArrayList<computador> arraycomputador = new ArrayList<computador>();
    public ControleCadastroComputador(){
        Telacadastrocomputador telacadastrocomputador = 
        new Telacadastrocomputador();    
        computador computadors = new computador();
        ArrayList<computador> Arraycomputadors = new ArrayList<computador>();
        Scanner input = new Scanner(System.in);
        
        do{
        
        telacadastrocomputador.desenhaTelacadastroComputador();
        
        computadors.setCpu(telacadastrocomputador.getCampoCpu());
        computadors.setRam(telacadastrocomputador.getCampoRam());;
        computadors.setSoftware(telacadastrocomputador.getCampoSoftware());
        
        this.arraycomputador.add(computadors);
        System.out.println("Deseja continuar [S/N]");

        } while(input.nextLine().equals("S")||input.nextLine().equals("s"));
    
    }
    public ArrayList<computador> geArraycComputadors(){
      return this.arraycomputador;
}
}