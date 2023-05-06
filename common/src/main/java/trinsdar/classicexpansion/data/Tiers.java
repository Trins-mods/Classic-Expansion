package trinsdar.classicexpansion.data;

import muramasa.antimatter.machine.Tier;
import net.minecraft.ChatFormatting;
import trinsdar.classicexpansion.ClassicExpansion;

public class Tiers {
    public static final Tier BASIC = new Tier(ClassicExpansion.ID, "basic", 50, ChatFormatting.WHITE, 1);
    public static final Tier HARDENED = new Tier(ClassicExpansion.ID, "hardened", 200, ChatFormatting.WHITE,2);
    public static final Tier REINFORCED = new Tier(ClassicExpansion.ID, "reinforced", 2000, ChatFormatting.YELLOW,3);
    public static final Tier RESONANT = new Tier(ClassicExpansion.ID, "resonant", 8000, ChatFormatting.AQUA,4);
    public static final Tier CREATIVE = new Tier(ClassicExpansion.ID, "creative", Integer.MAX_VALUE, ChatFormatting.LIGHT_PURPLE);
}
