import javax.inject.Inject;
import javax.inject.Named;

public class PowerSupply {

    private String model;
    private String capacity;

    public PowerSupply() {
    }

    @Inject
    public PowerSupply(@Named("PowerSupplyModel") String model,@Named("PowerSupplyCapacity") String capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "model='" + model + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
