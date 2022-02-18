
import javax.swing.JOptionPane;


public class Cliente {

    
    public static void main(String[] args) {
       ChefDirector chef = new ChefDirector(new IronManBurguer());
       
       chef.construirLanche();
       
       JOptionPane.showMessageDialog(null, chef.lanchePronto().getCarne());
    }
    
}
