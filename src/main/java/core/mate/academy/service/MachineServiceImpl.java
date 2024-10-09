package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService{
    @Override
    public List<? extends Machine> getAll(List machines) {
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
