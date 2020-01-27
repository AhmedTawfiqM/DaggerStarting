package atdev.com.daggerstarting.pojo.models;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    @Inject
    Engine engine;

    private Wheels wheels;

    //Inject the constructor of Car Object......
    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void Drive() {
        Log.d(TAG, "Driving....");
    }
}
