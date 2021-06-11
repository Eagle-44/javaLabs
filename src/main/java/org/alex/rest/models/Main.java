package org.alex.rest.models;

import org.alex.rest.models.woodworkingMachine.*;
import org.alex.rest.models.woodworkingMachineManager.WoodworkingMachineManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WoodworkingMachineManager woodworkingMachineManager = new WoodworkingMachineManager(new ArrayList<WoodworkingMachine>());
        woodworkingMachineManager.addWoodMachine(new Lathe("AR", "1231", 2000, 1000,
                Companies.BOSCH, 9090, 100, "Wood", "Dbl-1000", 3));
        woodworkingMachineManager.addWoodMachine(new CircularSaw("JM", "31-12", 1879,
                1100, Companies.MAKITA, 6666, 70, "Wood",
                "Circular Disk 20cm", 10));
        woodworkingMachineManager.addWoodMachine(new ThicknessPlanner("PL", "7821", 3999,
                2125, Companies.MAKITA, 10000, 85, "Wood", 3,
                "Cutter Head"));

        System.out.println("_______________________________________________________");
        System.out.println("Sorting by Power:");
        woodworkingMachineManager.sortByWatts(true).forEach(System.out::println);

        System.out.println("_______________________________________________________");
        System.out.println("Sorting by Volume:");
        woodworkingMachineManager.sortByVolume(true).forEach(System.out::println);
        System.out.println("Search by Company name and Purpose:");
        woodworkingMachineManager.searchWorkbench(Companies.MAKITA, "Wood").forEach(System.out::println); ;
    }
}
