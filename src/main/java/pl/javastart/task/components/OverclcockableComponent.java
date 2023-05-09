package pl.javastart.task.components;

import pl.javastart.task.exceptions.TooHighTemperatureException;

abstract class OverclcockableComponent extends Component implements Overclockable {
    int timing;
    int temperature;
    final int maxSafeTemp;
    final int amountOfTimingAddedWhenOverclocking = 100;

    public OverclcockableComponent(String model, String producer, int serialNumber, int timing, int temperature, int maxSafeTemp) {
        super(model, producer, serialNumber);
        this.timing = timing;
        this.temperature = temperature;
        this.maxSafeTemp = maxSafeTemp;
    }

    @Override
    public void overclock() {
        if (temperature + temperatureStep() <= maxSafeTemp) {
            temperature += temperatureStep();
            timing += amountOfTimingAddedWhenOverclocking;
            System.out.println("Podkręcono " + componentName());
        } else {
            throw new TooHighTemperatureException("Uwaga, za duża temperatura, nie udało się podkręcić " + componentName());
        }
    }

    abstract int temperatureStep();

    abstract String componentName();
}
