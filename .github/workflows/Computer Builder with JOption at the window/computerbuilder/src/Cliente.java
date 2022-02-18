import javax.swing.JOptionPane;

public class Cliente {
    

    public static void main(String[] args) {
        FabricaDirector construtor = 
        new FabricaDirector(new DefaultBuilder());
        construtor.MontarComputer();

        JOptionPane.showMessageDialog(null, construtor.retornaComputerConstruido().getModelo());

        construtor = new FabricaDirector(new PositivoBuilder());
        construtor.MontarComputer();
        JOptionPane.showMessageDialog(null, construtor.retornaComputerConstruido().getModelo());


        //ComputerBuilder computer1 = new DefaultBuilder();
       // System.out.println(computer1.getComputer().getModelo());
}

}
