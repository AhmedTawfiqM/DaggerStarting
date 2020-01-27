package atdev.com.daggerstarting.pojo.models;

import javax.inject.Inject;

public class Wheels {

    // Wheels dont own to class Car so i Will make  MOdule

    private Rims rims;
    private Tires tires;


    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
