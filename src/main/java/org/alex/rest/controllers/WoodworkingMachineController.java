package org.alex.rest.controllers;

import org.alex.rest.models.woodworkingMachine.WoodworkingMachine;
import org.alex.rest.service.WoodworkingMachineService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/WoodworkingMachines")

public class WoodworkingMachineController {
    @Autowired
    private WoodworkingMachineService woodworkingMachineService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<WoodworkingMachine> getWoodworkingMachine(@PathVariable(name = "id") Integer id) {
        if(woodworkingMachineService.getWoodworkingMachine(id) != null) {
            return new ResponseEntity<WoodworkingMachine>(woodworkingMachineService.getWoodworkingMachine(id), HttpStatus.OK);
        }
        return new ResponseEntity<WoodworkingMachine>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public List<WoodworkingMachine> getWoodworkingMachines() {
        return woodworkingMachineService.getWoodworkingMachines();
    }

    @PostMapping
    public WoodworkingMachine createWoodworkingMachine(@RequestBody @Valid WoodworkingMachine WoodworkingMachine) {
        return woodworkingMachineService.addWoodworkingMachine(WoodworkingMachine);
    }

    @PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<WoodworkingMachine> updateWoodworkingMachine(@Valid @PathVariable("id") int id, @RequestBody WoodworkingMachine WoodworkingMachine) {
        if (woodworkingMachineService.getWoodworkingMachine(id) != null) {
            return new ResponseEntity<WoodworkingMachine>(woodworkingMachineService.updateWoodworkingMachine(id, WoodworkingMachine), HttpStatus.OK);
        } else {
            return new ResponseEntity<WoodworkingMachine>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{id}")
    public void deleteWoodworkingMachineById(@PathVariable("id") Integer id) {
        woodworkingMachineService.deleteWoodworkingMachineById(id);
    }
}
