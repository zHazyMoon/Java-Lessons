
public class NotebookLinuxLenovo extends NotebookLinux{
    public NotebookLinuxLenovo(){
        setPreco(4500.0);
    }    
    
    @Override
    public String toString() {
        return "Linux Lenovo = " + getPreco();
    }
}
