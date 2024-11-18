package com.benshan36.DiscordSRV_Modded.mixin;

import com.benshan36.DiscordSRV_Modded.DiscordSRV_Modded;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        DiscordSRV_Modded.LOGGER.info("This line is printed by an example mod mixin!");
    }
}
