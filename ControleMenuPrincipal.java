import java.util.Scanner;

public class ControleMenuPrincipal {
    public ControleMenuPrincipal (){
         Scanner input = new Scanner(System.in);
         {
            new TelaMenuPrincipal();
             switch (Integer.parseInt(input.nextLine())) {
            case 1:
            new ControleCadastroComputador();
            break;
            case 2:
                 System.out.println("Em construção.....");
            case 3:
            System.exit(0);
            break;
        
            default:
                break;
        }
        
    }
    
    }}
