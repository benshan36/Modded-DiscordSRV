package net.discordsrv_modded.forge;

import dev.architectury.platform.forge.EventBuses;
import net.discordsrv_modded.DiscordSRV_Modded;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DiscordSRV_Modded.MOD_ID)
public class DiscordSRV_ModdedForge {
    public DiscordSRV_ModdedForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(DiscordSRV_Modded.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        DiscordSRV_Modded.init();
    }
}
