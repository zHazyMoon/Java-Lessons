

public abstract class BurguerBuilder {

    protected Hamburguer lanche;
    
    
    public BurguerBuilder(){
        lanche = new Hamburguer();
    }
    
    
    public abstract void buildPreco();
    public abstract void buildQtdeQueijoCheddar();
    public abstract void buildTipoCarne();
    
    
    public Hamburguer getLanche(){
        return lanche;
    }
    
    
}
