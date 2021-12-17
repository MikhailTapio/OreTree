package com.teamfractal.ore_tree.common.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OTCommonConfig {
    public static final ForgeConfigSpec COMMON_CONFIG;
    public static final ForgeConfigSpec.DoubleValue COAL_TICK;
    public static final ForgeConfigSpec.DoubleValue COPPER_TICK;
    public static final ForgeConfigSpec.DoubleValue DIAMOND_TICK;
    public static final ForgeConfigSpec.DoubleValue EMERALD_TICK;
    public static final ForgeConfigSpec.DoubleValue GOLD_TICK;
    public static final ForgeConfigSpec.DoubleValue IRON_TICK;
    public static final ForgeConfigSpec.DoubleValue LAPIS_TICK;
    public static final ForgeConfigSpec.DoubleValue QUARTZ_TICK;
    public static final ForgeConfigSpec.DoubleValue REDSTONE_TICK;

    public static final ForgeConfigSpec.DoubleValue COAL_CATALYZE;
    public static final ForgeConfigSpec.DoubleValue COPPER_CATALYZE;
    public static final ForgeConfigSpec.DoubleValue DIAMOND_CATALYZE;
    public static final ForgeConfigSpec.DoubleValue EMERALD_CATALYZE;
    public static final ForgeConfigSpec.DoubleValue GOLD_CATALYZE;
    public static final ForgeConfigSpec.DoubleValue IRON_CATALYZE;
    public static final ForgeConfigSpec.DoubleValue LAPIS_CATALYZE;
    public static final ForgeConfigSpec.DoubleValue QUARTZ_CATALYZE;
    public static final ForgeConfigSpec.DoubleValue REDSTONE_CATALYZE;

    private static final String RT = "Growth possibility per randomTick";
    private static final String C = "Growth possibility when try to catalyze";
    private static final String V = ", a higher value means a higher possibility.";

    static{
        final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        COAL_TICK = COMMON_BUILDER.comment(RT + " on a coal ore tree" + V).defineInRange("t_coal",0.9,0,1);
        COPPER_TICK = COMMON_BUILDER.comment(RT + " on a copper ore tree" + V).defineInRange("t_copper",0.9,0,1);
        DIAMOND_TICK = COMMON_BUILDER.comment(RT + " on a diamond ore tree").defineInRange("t_diamond",0.5,0,1);
        EMERALD_TICK = COMMON_BUILDER.comment(RT + " on an emerald ore tree").defineInRange("t_emerald",0.8,0,1);
        GOLD_TICK = COMMON_BUILDER.comment(RT + " on a gold ore tree").defineInRange("t_gold",0.8,0,1);
        IRON_TICK = COMMON_BUILDER.comment(RT + " on an iron ore tree").defineInRange("t_iron",0.9,0,1);
        LAPIS_TICK = COMMON_BUILDER.comment(RT + " on a lapis ore tree").defineInRange("t_lapis",0.7,0,1);
        QUARTZ_TICK = COMMON_BUILDER.comment(RT + " on a quartz ore tree").defineInRange("t_quartz",0.7,0,1);
        REDSTONE_TICK = COMMON_BUILDER.comment(RT + " on a redstone ore tree").defineInRange("t_redstone",0.7,0,1);

        COAL_CATALYZE = COMMON_BUILDER.comment(C + " a coal ore tree" + V).defineInRange("c_coal",0.9,0,1);
        COPPER_CATALYZE = COMMON_BUILDER.comment(C + " a copper ore tree" + V).defineInRange("c_copper",0.9,0,1);
        DIAMOND_CATALYZE = COMMON_BUILDER.comment(C + " a diamond ore tree").defineInRange("c_diamond",0.4,0,1);
        EMERALD_CATALYZE = COMMON_BUILDER.comment(C + " an emerald ore tree").defineInRange("c_emerald",0.7,0,1);
        GOLD_CATALYZE = COMMON_BUILDER.comment(C + " a gold ore tree").defineInRange("c_gold",0.7,0,1);
        IRON_CATALYZE = COMMON_BUILDER.comment(C + " an iron ore tree").defineInRange("c_iron",0.9,0,1);
        LAPIS_CATALYZE = COMMON_BUILDER.comment(C + " a lapis ore tree").defineInRange("c_lapis",0.7,0,1);
        QUARTZ_CATALYZE = COMMON_BUILDER.comment(C + " a quartz ore tree").defineInRange("c_quartz",0.7,0,1);
        REDSTONE_CATALYZE = COMMON_BUILDER.comment(C + " a redstone ore tree").defineInRange("c_redstone",0.8,0,1);

        COMMON_CONFIG = COMMON_BUILDER.build();


    }
}
