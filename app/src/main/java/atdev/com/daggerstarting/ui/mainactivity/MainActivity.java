package atdev.com.daggerstarting.ui.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import atdev.com.daggerstarting.R;
import atdev.com.daggerstarting.pojo.models.Car;
import atdev.com.daggerstarting.pojo.models.CarComponent;
import atdev.com.daggerstarting.pojo.models.DaggerCarComponent;

public class MainActivity extends AppCompatActivity {

    //vars
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();

        //car = carComponent.getCar();

        carComponent.inject(this);
        car.Drive();
    }
}
