package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck = new Truck();
        List<Truck> list = new ArrayList<>();
        list.add(truck);
        return list;
    }
}
