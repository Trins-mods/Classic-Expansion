package trinsdar.classicexpansion;

import com.example.examplemod.ExampleData;
import muramasa.antimatter.AntimatterMod;
import muramasa.antimatter.cover.ICover;
import muramasa.antimatter.datagen.AntimatterDynamics;
import muramasa.antimatter.datagen.providers.AntimatterBlockStateProvider;
import muramasa.antimatter.datagen.providers.AntimatterItemModelProvider;
import muramasa.antimatter.event.MaterialEvent;
import muramasa.antimatter.registration.RegistrationEvent;
import muramasa.antimatter.registration.Side;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassicExpansion extends AntimatterMod {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String ID = "classicexpansion", NAME = "Classic Expansion";
    @Override
    public void onRegistrarInit() {
        super.onRegistrarInit();
        AntimatterDynamics.clientProvider(ID, () -> new AntimatterBlockStateProvider(ID, NAME + " BlockStates"));
        AntimatterDynamics.clientProvider(ID, () -> new AntimatterItemModelProvider(ID, NAME + " Item Models"));
    }

    @Override
    public void onRegistrationEvent(RegistrationEvent event, Side side) {
        switch (event) {
            case DATA_INIT -> {
            }
        }
    }

    @Override
    public String getId() {
        return "example";
    }

    @Override
    public void onMaterialEvent(MaterialEvent event) {
    }
}
