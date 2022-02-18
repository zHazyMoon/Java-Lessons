

public class PrototypeOvelha {

    
    
    private Ovelha sally = new Ovelha("Sally");
    
    public PrototypeOvelha(Ovelha ovelha){
        this.sally = ovelha;
    }
    
    public Animal getClone(){
     return getSally().clonar();
    }
    
    
    public Ovelha getSally() {
        return sally;
    }

    public void setSally(Ovelha sally) {
        this.sally = sally;
    }

}
