package dev.vini2003.$nameLowercase;

import dev.vini2003.hammer.chat.HC;
import dev.vini2003.hammer.preset.HP;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class $nameTitle implements ModInitializer {
	public static final String ID = "$nameLowercase";
	
	public static Identifier id(String path) {
		return new Identifier(ID, path);
	}
	
	@Override
	public void onInitialize() {
		HC.CONFIG.disableChatPrefix = false;
		HC.CONFIG.disableChatPreviewEventHighlight = true;
		HC.CONFIG.disableChatSigning = true;
		
		HP.CONFIG.windowName = "$nameTitle";
		
		HP.CONFIG.disableFabulousGraphics = true;
		HP.CONFIG.disableSinglePlayer = true;
		HP.CONFIG.disableToasts = true;
		HP.CONFIG.enableWelcome = false;
		HP.CONFIG.enableChannels = false;
		HP.CONFIG.enableRoles = false;
		
		HP.CONFIG.hideServerAddress = true;
		
		HP.CONFIG.defaultShowChat = true;
		HP.CONFIG.defaultShowGlobalChat = true;
		HP.CONFIG.defaultShowCommandFeedback = false;
		HP.CONFIG.defaultShowWarnings = false;
		HP.CONFIG.defaultShowDirectMessages = true;
		HP.CONFIG.defaultFastChatFade = false;
	}
}
