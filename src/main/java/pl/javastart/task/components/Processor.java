package pl.javastart.task.components;

import pl.javastart.task.Overclockable;
import pl.javastart.task.exceptions.TooHighTemperatureException;

public class Processor extends Component implements Overclockable {

    int timing;
    int temperature;
    final int maxSafeTemp;

    public Processor(String model, String producer, int serialNumber, int timing, int temperature, int maxSafeTemp) {
        super(model, producer, serialNumber);
        this.timing = timing;
        this.temperature = temperature;
        this.maxSafeTemp = maxSafeTemp;
    }

    @Override
    public void overclock() {
        if (temperature + 10 <= maxSafeTemp) {
            temperature += 10;
            timing += 100;
            System.out.println("Podkręcono procesor");
        } else {
            throw new TooHighTemperatureException("Uwaga, za duża temperatura, nie udało się podkręcić procesora");
        }
    }

    @Override
    public String toString() {
        return "Procesor: " + producer + " " + model + " taktowanie: " + timing + "MHz "
                + temperature + "C";
    }
}
