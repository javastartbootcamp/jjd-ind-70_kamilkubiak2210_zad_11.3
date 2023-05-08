package pl.javastart.task.components;

import pl.javastart.task.Overclockable;
import pl.javastart.task.exceptions.TooHighTemperatureException;

public class Memory extends Component implements Overclockable {

    int amountOfRam;
    int timing;
    int temperature;
    final int maxSafeTemp;

    public Memory(String model, String producer, int serialNumber, int amountOfRam, int timing, int temperature, int maxSafeTemp) {
        super(model, producer, serialNumber);
        this.amountOfRam = amountOfRam;
        this.timing = timing;
        this.temperature = temperature;
        this.maxSafeTemp = maxSafeTemp;
    }

    @Override
    public void overclock() {

        if (temperature + 15 <= maxSafeTemp) {
            temperature += 15;
            timing += 100;
            System.out.println("Podkręcono pamięć ram");
        } else {
            throw new TooHighTemperatureException("Uwaga, za duża temperatura, nie udało się podkręcić pamięci RAM");
        }
    }

    @Override
    public String toString() {
        return "Pamięć ram: " + producer + " " + model + " taktowanie: " + timing + "MHz "
                + "pamięć: " + amountOfRam + "MB " + temperature + "C";
    }
}
