package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService{
    @Override
    public List getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = null;
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            machines = bulldozerProducer.get();
            return machines;
        }

        if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machines = excavatorProducer.get();
            return machines;
        }

        if (type == Excavator.class) {
            TruckProducer truckProducer = new TruckProducer();
            machines = truckProducer.get();
            return machines;
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.add(value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }

    }
}
