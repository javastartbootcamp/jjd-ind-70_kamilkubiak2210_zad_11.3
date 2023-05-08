package pl.javastart.task;

import pl.javastart.task.components.HardDrive;
import pl.javastart.task.components.Memory;
import pl.javastart.task.components.Processor;
import pl.javastart.task.exceptions.TooHighTemperatureException;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer(
                new Processor("i5-12400f", "Intel", 123, 3000, 60, 80),
                new Memory("G.SKILL", "Kingston", 124, 4096, 1066, 40, 60),
                new HardDrive("NVMe 960 EVO Plus", "Samsung", 125, 1000));
        try {

            System.out.println(computer.processor);
            computer.processor.overclock();
            System.out.println(computer.processor);
            computer.processor.overclock();
            System.out.println(computer.processor);
            computer.processor.overclock();
            System.out.println(computer.processor);
            computer.processor.overclock();

        } catch (TooHighTemperatureException e) {
            System.out.println();
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {

            System.out.println(computer.memory);
            computer.memory.overclock();
            System.out.println(computer.memory);
            computer.memory.overclock();
            System.out.println(computer.memory);

        } catch (TooHighTemperatureException e) {
            System.out.println();
            System.out.println(e.getMessage());
            System.out.println();
        }
        System.out.println(computer);
    }

}
