import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class ControleCadastroComputador {
    private ArrayList<Computador> arraycomputador = new ArrayList<Computador>();
    public ControleCadastroComputador(){
        TelaCadastroComputador telacadastrocomputador = 
        new TelaCadastroComputador();    
        Computador computador = new Computador();
        ArrayList<Computador> arraycomputador = new ArrayList<Computador>();
        Scanner input = new Scanner(System.in);
        
        do{
        
        telacadastrocomputador.desenhaTelacadastroComputador();
        
        computador.setCpu(telacadastrocomputador.getCampoCpu());
        computador.setRam(telacadastrocomputador.getCampoRam());;
        computador.setSoftware(telacadastrocomputador.getCampoSoftware());
        
        this.arraycomputador.add(computador);
        System.out.println("Deseja continuar [S/N]");

        } while(input.nextLine().equals("S")||input.nextLine().equals("s"));
    
    }
    public ArrayList<Computador> geArraycComputadors(){
      return this.arraycomputador;
}
}
