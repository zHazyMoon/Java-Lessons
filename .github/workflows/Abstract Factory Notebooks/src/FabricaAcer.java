
public class FabricaAcer implements AbstractFactoryNotebooks{

    @Override
    public NotebookLinux criarNotebookLinux() {
       return new NotebookLinuxAcer();
        
    
    }

    @Override
    public  NotebookWindows criarNotebookWindows() {
    
    return new NotebookWindowsAcer();
    }

    @Override
    public NotebookChrome criarNotebookChrome() {
        
        return new NotebookChromeAcer();
    
    }
    
}
