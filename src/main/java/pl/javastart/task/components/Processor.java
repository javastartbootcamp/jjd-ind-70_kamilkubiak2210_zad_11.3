package pl.javastart.task.components;

public class Processor extends OverclcockableComponent {

    public Processor(String model, String producer, int serialNumber, int timing, int temperature, int maxSafeTemp) {
        super(model, producer, serialNumber, timing, temperature, maxSafeTemp);
    }

    @Override
    int temperatureStep() {
        return 10;
    }

    @Override
    String componentName() {
        return "procesor";
    }

    @Override
    public String toString() {
        return "Procesor: " + producer + " " + model + " taktowanie: " + timing + "MHz "
                + temperature + "C";
    }
}
