package org.alex.rest.models.woodworkingMachine;

import lombok.*;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class WoodworkingMachine {
    private Integer id;

    @NotNull(message = "Missing name")
    @Size(min=2, max=32)
    private String name;

    @NotNull(message = "Missing model")
    @Size(min=2, max=32)
    private String model;

    @NotNull(message = "Missing price")
    @Min(1)
    @Max(99999)
    private float price;

    @NotNull(message = "Missing power")
    @Min(1)
    @Max(99999)
    private int power;

    @NotNull(message = "Missing manufactureCompany (enum)")
    @Enumerated(EnumType.STRING)
    private Companies manufactureCompany;

    @NotNull(message = "Missing rpm")
    @Min(1)
    @Max(99999)
    private int rpm;

    @NotNull(message = "Missing volumePerSec")
    @Min(1)
    @Max(99999)
    private int volumePerSec;

    @NotNull(message = "Missing purpose")
    @Size(min=2, max=32)
    private String purpose;



    WoodworkingMachine(final String namePar, final String modelPar, final float pricePar, int powerPar,
                       final Companies manufactureCompanyPar, final int rpmPar,
                       final int volumePerSecPar, final String purposePar) {

        this.name = namePar;
        this.model = modelPar;
        this.price = pricePar;
        this.power = powerPar;
        this.manufactureCompany = manufactureCompanyPar;
        this.rpm = rpmPar;
        this.volumePerSec = volumePerSecPar;
        this.purpose = purposePar;
    }

    public void turnOn() {
        System.out.println("Machine is ON");
    }

    public void turnOff() {
        System.out.println("Machine is OFF");
    }
}
