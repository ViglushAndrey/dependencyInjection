import javax.inject.Inject;

public class Computer {

    private ComputerCase computerCase;

    public Computer() {
    }

    @Inject
    public Computer(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerCase=" + computerCase +
                '}';
    }
}
