import javax.inject.Inject;
import javax.inject.Named;

public class Processor {

    private String model;
    private int core;
    private float frequency;

    public Processor() {
    }

    @Inject
    public Processor(@Named("ProcessorModel") String model,@Named("Core") int core,@Named("Frequency") float frequency) {
        this.model = model;
        this.core = core;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                ", core=" + core +
                ", frequency=" + frequency +
                '}';
    }
}
