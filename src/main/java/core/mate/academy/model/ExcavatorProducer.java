package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator();
        List<Excavator> list = new ArrayList<>();
        list.add(excavator);
        return list;
    }
}
