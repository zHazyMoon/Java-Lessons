

public class HulkBurguer extends BurguerBuilder{

    
    
    @Override
    public void buildPreco() {
   
        lanche.setPreco(40.0);
    
    }

    @Override
    public void buildQtdeQueijoCheddar() {
    lanche.setQueijoChedar(2);
    
    }

    @Override
    public void buildTipoCarne() {
    lanche.setCarne("CARNE DO HULK");
    
    }

}
