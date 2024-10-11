package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer();
        List<Bulldozer> list = new ArrayList<>();
        list.add(bulldozer);
        return list;
    }
}
