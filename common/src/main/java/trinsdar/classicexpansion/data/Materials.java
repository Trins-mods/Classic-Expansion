package trinsdar.classicexpansion.data;

import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.material.Material;
import muramasa.antimatter.material.TextureSet;
import trinsdar.classicexpansion.ClassicExpansion;

import static muramasa.antimatter.material.Element.*;
import static muramasa.antimatter.material.TextureSet.*;

public class Materials {
    public static Material Tin = AntimatterAPI.register(Material.class, new Material(ClassicExpansion.ID, "tin", 0xdcdcdc, DULL, Sn));
    public static Material Silver = AntimatterAPI.register(Material.class, new Material(ClassicExpansion.ID, "silver", 0xdcdcff, SHINY, Ag));
    public static Material Lead = AntimatterAPI.register(Material.class, new Material(ClassicExpansion.ID, "lead", 0x8c648c, DULL, Pb));
    public static Material Nickel = AntimatterAPI.register(Material.class, new Material(ClassicExpansion.ID, "nickel", 0xc8c8fa, METALLIC, Ni));
    public static Material Platinum = AntimatterAPI.register(Material.class, new Material(ClassicExpansion.ID, "platinum", 0xffffc8, SHINY, Pt));

    public static Material Signalum = AntimatterAPI.register(Material.class, new Material(ClassicExpansion.ID, "signalum", 0xff4000, TextureSet.NONE));
    public static Material Lumium = AntimatterAPI.register(Material.class, new Material(ClassicExpansion.ID, "lumium", 0xffff50, TextureSet.NONE));
    public static Material Enderium = AntimatterAPI.register(Material.class, new Material(ClassicExpansion.ID, "enderium", 0x3c7d73, TextureSet.NONE));
    public static Material Mithril = AntimatterAPI.register(Material.class,  new Material(ClassicExpansion.ID, "mithril", 0x648cfa, NONE));
}
