
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ovelha implements Animal{

    private String nome;
    
     public Ovelha(String nome){
         this.nome = nome;
     }
    @Override
    public Animal clonar() {
        
        
        try {
            return (Animal) this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Ovelha.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
      }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome; //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
