package pl.javastart.task.components;

public class Memory extends OverclcockableComponent {
    int amountOfRam;

    public Memory(String model, String producer, int serialNumber, int amountOfRam, int timing, int temperature, int maxSafeTemp) {
        super(model, producer, serialNumber, timing, temperature, maxSafeTemp);
        this.amountOfRam = amountOfRam;
    }

    @Override
    int temperatureStep() {
        return 15;
    }

    @Override
    String componentName() {
        return "RAM";
    }

    @Override
    public String toString() {
        return "Pamięć ram: " + producer + " " + model + " taktowanie: " + timing + "MHz "
                + "pamięć: " + amountOfRam + "MB " + temperature + "C";
    }
}
