import javax.inject.Inject;
import javax.inject.Named;

public class RAM {

    private String model;
    private int frequency;
    private int capacity;

    public RAM() {
    }

    @Inject
    public RAM(@Named("RAMModel") String model,@Named("RAMFrequency")  int frequency,@Named("RAMCapacity")  int capacity) {
        this.model = model;
        this.frequency = frequency;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "model='" + model + '\'' +
                ", frequency=" + frequency +
                ", volume=" + capacity +
                '}';
    }
}
