
public class Cliente {

    
    public static void main(String[] args) {
        
        NotebookLinux               linux;
        NotebookWindows             windows;
        NotebookChrome              chrome;
        AbstractFactoryNotebooks    fabrica;
        
        
        fabrica = new FabricaAcer();
        
        
        linux   = fabrica.criarNotebookLinux();
       
        windows = fabrica.criarNotebookWindows();
        
        chrome = fabrica.criarNotebookChrome();
        
        System.out.println(linux);
           System.out.println(windows);
        
        fabrica = new FabricaDell();
        
        linux   = fabrica.criarNotebookLinux();
        
        windows = fabrica.criarNotebookWindows();
        
        chrome = fabrica.criarNotebookChrome();
        
        System.out.println(linux);
           System.out.println(windows);
                System.out.println(chrome);
        
            
    }
    
}
