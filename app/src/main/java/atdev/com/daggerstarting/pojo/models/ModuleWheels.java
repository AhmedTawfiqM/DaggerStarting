package atdev.com.daggerstarting.pojo.models;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleWheels {

    @Provides
    static Tires provideTires() {

        Tires tires = new Tires();
        tires.Inflate();
        return tires;
    }

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }


    //use modules and provider methods to add objects to the dependency graph
    // that can't use an @Inject constructor, like classes that belong to 3rd party libraries.
    //
    //Modules are simple Java classes that we annotate with @Module and add to a component.
    // They contain methods that are annotated with @Provides and which define how objects get instantiated and configured.
    // These provider methods can have their very own dependencies as arguments, which Dagger will then provide if possible.
    // By making provider methods static,
    // we can get a performance boost because our component doesn't have to instantiate the module to call them.
}
