package org.alex.rest.service;

import org.alex.rest.models.woodworkingMachine.WoodworkingMachine;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.alex.rest.models.woodworkingMachine.WoodworkingMachine;


@Service
@ApplicationScope
public class WoodworkingMachineService {
    private AtomicInteger id = new AtomicInteger(0);

    private final Map<Integer, WoodworkingMachine> MACHINE_MAP = new HashMap<Integer, WoodworkingMachine>();

    public WoodworkingMachine addWoodworkingMachine(WoodworkingMachine woodworkingMachine) {
        Integer WoodworkingMachineId = id.incrementAndGet();
        woodworkingMachine.setId(WoodworkingMachineId);
        MACHINE_MAP.put(WoodworkingMachineId, woodworkingMachine);
        return woodworkingMachine;
    }

    public WoodworkingMachine updateWoodworkingMachine(int id, WoodworkingMachine woodworkingMachine) {
        woodworkingMachine.setId(id);
        return MACHINE_MAP.put(id, woodworkingMachine);
    }

    public List<WoodworkingMachine> getWoodworkingMachines() {
        return MACHINE_MAP.values().stream().collect(Collectors.toList());
    }

    public WoodworkingMachine getWoodworkingMachine(Integer id) {
        return MACHINE_MAP.get(id);
    }

    public Map<Integer, WoodworkingMachine> getWoodworkingMachineMap(){
        return MACHINE_MAP;
    }

    public void deleteWoodworkingMachineById(Integer id){
        MACHINE_MAP.remove(id);
    }
}
