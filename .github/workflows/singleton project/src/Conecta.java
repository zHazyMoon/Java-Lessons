
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.Conexao;


public class Conecta implements Runnable {

   String nome; 
   public Conecta (String nome){
       this.nome = nome;
   }
    
    @Override
    public void run() {
        
      Conexao conexao = Conexao.getInstance("jdbc:derby://localhost/", "root", "root", "aula05","org.apache.derby.jdbc.ClientDriver");
        try {
            
            
            conexao.getConnection();
            System.out.println("Thread conectada - "   + this.nome);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Conecta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conecta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
