
public class FabricaDell implements AbstractFactoryNotebooks{

    @Override
    public NotebookLinux criarNotebookLinux() {
    
        return new NotebookLinuxDell();
    
    }

    @Override
    public NotebookWindows criarNotebookWindows() {
    
    return new NotebookWindowsDell();
    }

    @Override
    public NotebookChrome criarNotebookChrome() {
       
    return new NotebookChromeDell();
        
    }
    
}
