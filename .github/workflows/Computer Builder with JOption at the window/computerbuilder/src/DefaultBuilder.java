
public class DefaultBuilder extends ComputerBuilder {

    @Override
    public void buildPreco() {
     computer.setPreco(2500.0);
        
    }

    @Override
    public void buildMontadora() {
    computer.setMontadora("DELL");
        
    }

    @Override
    public void buildAnoFabricacao() {
    computer.setAnoFabricacao(2021);
        
    }

    @Override
    public void buildModelo() {
    computer.setModelo("Inspiron 666");
        
    }


}