public class FabricaDirector {
    
    protected ComputerBuilder construtor;

    public FabricaDirector(ComputerBuilder construtor) {
        this.construtor = construtor;
    }

    public void MontarComputer(){

        construtor.buildPreco();
        construtor.buildAnoFabricacao();
        construtor.buildModelo();
        construtor.buildMontadora();

    }

    public Computer retornaComputerConstruido(){
        return construtor.getComputer();
    }
}
