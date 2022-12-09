import javax.inject.Inject;
import javax.inject.Named;

public class Motherboard {

    private String model;

    public Motherboard() {
    }

    @Inject
    public Motherboard(@Named("MotherboardModel") String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + model + '\'' +
                '}';
    }
}
