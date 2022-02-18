//import jdk.internal.jshell.tool.resources.version;

public abstract class ComputerBuilder {

    protected Computer computer;

    public ComputerBuilder(){
        computer = new Computer();
    }

    public abstract void buildPreco();
    public abstract void buildMontadora();
    public abstract void buildAnoFabricacao();
    public abstract void buildModelo();

    public Computer getComputer(){
        return computer;
    }

}