package net.discordsrv_modded.fabric;

import net.discordsrv_modded.DiscordSRV_Modded;
import net.fabricmc.api.ModInitializer;

public class DiscordSRV_ModdedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DiscordSRV_Modded.init();
    }
}
