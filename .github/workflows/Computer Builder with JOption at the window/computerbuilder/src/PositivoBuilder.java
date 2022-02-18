public class PositivoBuilder extends ComputerBuilder{
    @Override
    public void buildPreco() {
     computer.setPreco(30000.0);
        
    }

    @Override
    public void buildMontadora() {
    computer.setMontadora("Positivo");
        
    }

    @Override
    public void buildAnoFabricacao() {
    computer.setAnoFabricacao(2001);
        
    }

    @Override
    public void buildModelo() {
    computer.setModelo("Casas Bahia 171");
        
    }

}
