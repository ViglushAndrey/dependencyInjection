import javax.inject.Inject;

public class ComputerCase {

    private Motherboard motherboard;
    private Processor processor;
    private RAM ram;
    private SSD ssd;
    private PowerSupply powerSupply;

    public ComputerCase() {
    }

    @Inject
    public ComputerCase(Motherboard motherboard, Processor processor, RAM ram, SSD ssd, PowerSupply powerSupply) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
        this.powerSupply = powerSupply;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard=" + motherboard +
                ", processor=" + processor +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", powerSupply=" + powerSupply +
                '}';
    }
}
