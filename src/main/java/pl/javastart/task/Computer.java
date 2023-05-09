package pl.javastart.task;

import pl.javastart.task.components.HardDrive;
import pl.javastart.task.components.Memory;
import pl.javastart.task.components.Processor;

public class Computer  {
    protected Processor processor;
    protected Memory memory;
    protected HardDrive hardDrive;

    public Computer(Processor processor, Memory memory, HardDrive hardDrive) {
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return processor.toString() + "\n" + memory.toString() + "\n" + hardDrive.toString();
    }
}
