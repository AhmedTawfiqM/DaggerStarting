package atdev.com.daggerstarting.pojo.models;


//Injector

import atdev.com.daggerstarting.ui.mainactivity.MainActivity;
import dagger.Component;
import dagger.Module;

@Component (modules = ModuleWheels.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
