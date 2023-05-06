package trinsdar.classicexpansion.machine;

import muramasa.antimatter.capability.machine.MachineEnergyHandler;
import tesseract.api.gt.GTTransaction;

public class ThermalEnergyHandler<T extends TileThermalMachine<T>> extends MachineEnergyHandler<T> {
    public ThermalEnergyHandler(T tile, boolean isGenerator) {
        super(tile, 0L, (tile.getMachineTier().getIntegerId() * 2L + 2) * 6000, isGenerator ? 0 : tile.getMachineTier().getVoltage(), isGenerator ? tile.getMachineTier().getVoltage() : 0, isGenerator ? 0 : 1, isGenerator ? 1 : 0);
    }

    @Override
    protected boolean checkVoltage(GTTransaction.TransferData data) {
        if (data.getVoltage() > this.getInputVoltage()) {
            return false;
            //Utils.createExplosion(this.tile.getLevel(), tile.getBlockPos(), 4.0F, Explosion.BlockInteraction.DESTROY);
        }
        return true;
    }
}
