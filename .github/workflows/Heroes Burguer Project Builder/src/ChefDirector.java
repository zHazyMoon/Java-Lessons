

public class ChefDirector {

    BurguerBuilder tipoLanche;
    
    
    public ChefDirector(BurguerBuilder lanche){
        this.tipoLanche = lanche;
    }
    
    
    public void construirLanche(){
        
        tipoLanche.buildPreco();
        tipoLanche.buildQtdeQueijoCheddar();
        tipoLanche.buildTipoCarne();
        
    }
    
    public Hamburguer lanchePronto(){
        return tipoLanche.getLanche();
    }
    
}
