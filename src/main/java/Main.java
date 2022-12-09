public class Main {
    public static void main(String[] args) {
        InjectComponent injectComponent;
        injectComponent = DaggerInjectComponent.create();
        Computer computer = injectComponent.buildComputer();
        System.out.println(computer.getComputerCase().getMotherboard().getModel() + '\n'
                + computer.getComputerCase().getProcessor().getModel() + '\n'
                + computer.getComputerCase().getRam().getModel() + '\n'
                + computer.getComputerCase().getSsd() + '\n'
                + computer.getComputerCase().getPowerSupply()
        );
    }
}
