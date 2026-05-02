package cn.sh1rocu.touhoulittlemaidaddon.eschest;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class TouhouLittleMaidAddonESChest implements ModInitializer {
    public static final String MOD_ID = "touhou_little_maid_addon_eschest";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Touhou Little Maid Addon: EStorage Chest loaded.");
    }
}
