package trinsdar.classicexpansion.machine;

import muramasa.antimatter.capability.machine.MachineEnergyHandler;
import muramasa.antimatter.machine.types.Machine;
import muramasa.antimatter.tile.TileEntityMachine;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import static muramasa.antimatter.machine.MachineFlag.ENERGY;
import static muramasa.antimatter.machine.MachineFlag.GENERATOR;

public class TileThermalMachine<T extends TileThermalMachine<T>> extends TileEntityMachine<T> {
    public TileThermalMachine(Machine<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
        if (type.has(ENERGY)) {
            energyHandler.set(() -> new ThermalEnergyHandler<>((T) this, type.has(GENERATOR)));
        }
    }
}
