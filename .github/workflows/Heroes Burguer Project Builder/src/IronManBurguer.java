

public class IronManBurguer  extends BurguerBuilder{

    
    
    @Override
    public void buildPreco() {
   
        lanche.setPreco(30.0);
    
    }

    @Override
    public void buildQtdeQueijoCheddar() {
    lanche.setQueijoChedar(1);
    
    }

    @Override
    public void buildTipoCarne() {
    lanche.setCarne("CARNE DO HOMEM DE FERRO");
    
    }

}

