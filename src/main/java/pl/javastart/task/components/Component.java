package pl.javastart.task.components;

public abstract class Component {
    String model;
    String producer;
    int serialNumber;

    public Component(String model, String producer, int serialNumber) {
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }
}
