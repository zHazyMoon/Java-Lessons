
public class Cliente {

    
    public static void main(String[] args) {
        PrototypeOvelha clonador = new PrototypeOvelha(new Ovelha("Sally"));
        
        Ovelha x = clonador.getSally();
        // Ovelha y = clonador.getSally();
        
        Ovelha y = (Ovelha) clonador.getClone();
        Ovelha z = (Ovelha) clonador.getClone();
        
        
        System.out.println(x + "\n");
         System.out.println(y + "\n");
          System.out.println(z + "\n");
        
        
    }
    
}
