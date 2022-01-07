package com.teamfractal.ore_tree.client.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OTClientConfig {
    public static final ForgeConfigSpec CLIENT_CONFIG;
    public static final ForgeConfigSpec.BooleanValue CATALYZE_FAILURE_PARTICLE_DISPLAY;

    static{
        final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
        CLIENT_BUILDER.comment("Client Settings").push("Particle Display");
        CATALYZE_FAILURE_PARTICLE_DISPLAY = CLIENT_BUILDER.comment("Should a smoke particle be spawned when fail to catalyze?").define("particle", true);
        CLIENT_BUILDER.pop();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }
}
