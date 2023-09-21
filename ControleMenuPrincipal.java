import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleMenuPrincipal {

    private ArrayList<Computador> computadores;

    public void chamarControleMenuPrincipal (){
         Scanner input = new Scanner(System.in);
         ControleCadastroComputador controleCadastroComputador = new ControleCadastroComputador();
         {
            new TelaMenuPrincipal();

            switch (Integer.parseInt(input.nextLine())) {
            case 1:
            controleCadastroComputador.cadastroComputador();
            computadores = controleCadastroComputador.getArrayComputador();
            new ControleMenuPrincipal();
            this.chamarControleMenuPrincipal();
            break;

            case 2:
            computadores.forEach((comp) -> System.out.println(comp));
            this.chamarControleMenuPrincipal();
            break;
            case 3:
            System.exit(0);
            break;
        
            default:
            this.chamarControleMenuPrincipal();
                break;
        }
        
    }
    
    }}
   

