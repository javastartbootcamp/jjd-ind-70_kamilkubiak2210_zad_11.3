package pl.javastart.task.components;

public class HardDrive extends Component {

    int capacity;

    public HardDrive(String model, String producer, int serialNumber, int capacity) {
        super(model, producer, serialNumber);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Dysk: " + producer + " " + model + " " + capacity + "GB";
    }
}
