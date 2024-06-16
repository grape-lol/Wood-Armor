package weird.is.grape.woodarmor;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weird.is.grape.woodarmor.item.ItemHandler;

public class WoodArmor implements ModInitializer {
	public static final String MOD_ID = "woodarmor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize(ModContainer mod) {
		ItemHandler.addItemsToItemGroup();
    }
}
