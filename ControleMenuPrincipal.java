import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleMenuPrincipal {

    public ControleMenuPrincipal (){
         Scanner input = new Scanner(System.in);
         ControleCadastroComputador controleCadastroComputador = new ControleCadastroComputador();
         {
            new TelaMenuPrincipal();
           // ControleCadastroComputador controleCadastroComputador = new ControleCadastroComputador();

            switch (Integer.parseInt(input.nextLine())) {
            case 1:
            controleCadastroComputador.cadastroComputador();
            controleCadastroComputador.getArrayComputador().forEach((comp) -> System.out.println(comp));
            new ControleMenuPrincipal();
           //controleCadastroComputador.getArrayComputador().foreah((comp))
            break;

            case 2:
            //controleCadastroComputador.getArrayComputador().forEach((comp) -> System.out.println(comp));
            //new ControleMenuPrincipal();
            break;
            case 3:
            System.exit(0);
            break;
        
            default:
            new ControleMenuPrincipal();
                break;
        }
        
    }
    
    }}
   

