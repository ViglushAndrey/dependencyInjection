import jdk.jfr.Name;

import javax.inject.Inject;
import javax.inject.Named;

public class SSD {

    private String model;
    private int capacity;

    public SSD() {
    }

    @Inject
    public SSD(@Named("SSDModel") String model,@Named("SSDCapacity") int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
