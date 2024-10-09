package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<? extends Machine> get() {
        return new ArrayList<>((Collection) new Truck());
    }
}
