package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService{
    @Override
    public List<? extends Machine> getAll(List <? extends Machine> machines) {
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.add(value);

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }

    }
}
