package trinsdar.classicexpansion.machine;

import muramasa.antimatter.machine.MachineState;
import muramasa.antimatter.machine.types.BasicMachine;
import muramasa.antimatter.texture.Texture;
import trinsdar.classicexpansion.ClassicExpansion;
import trinsdar.classicexpansion.data.Tiers;

public class ThermalMachine extends BasicMachine {
    public ThermalMachine(String domain, String id) {
        super(domain, id);
        setTiers(Tiers.BASIC, Tiers.HARDENED, Tiers.REINFORCED, Tiers.RESONANT, Tiers.CREATIVE);
        baseTexture((m, t) -> new Texture[] {
                new Texture(ClassicExpansion.ID, "block/machine/base/" + t.getId() + "_bottom"),
                new Texture(ClassicExpansion.ID, "block/machine/base/" + t.getId() + "_top"),
                new Texture(ClassicExpansion.ID, "block/machine/base/" + t.getId() + "_side"),
                new Texture(ClassicExpansion.ID, "block/machine/base/" + t.getId() + "_side"),
                new Texture(ClassicExpansion.ID, "block/machine/base/" + t.getId() + "_side"),
                new Texture(ClassicExpansion.ID, "block/machine/base/" + t.getId() + "_side"),
        });
        overlayTexture((type, state, tier) -> {
            if (state != MachineState.ACTIVE) state = MachineState.IDLE;
            String stateDir = state == MachineState.IDLE ? "" : state.getId() + "/";
            return new Texture[] {
                    new Texture(ClassicExpansion.ID, "block/machine/overlay/blank"),
                    new Texture(ClassicExpansion.ID, "block/machine/overlay/blank"),
                    new Texture(ClassicExpansion.ID, "block/machine/overlay/blank"),
                    new Texture(ClassicExpansion.ID, "block/machine/overlay/" + type.getId() + "/" + stateDir + "front"),
                    new Texture(ClassicExpansion.ID, "block/machine/overlay/blank"),
                    new Texture(ClassicExpansion.ID, "block/machine/overlay/blank"),
            };
        });
    }
}
