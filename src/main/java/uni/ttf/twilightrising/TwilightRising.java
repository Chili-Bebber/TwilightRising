package uni.ttf.twilightrising;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import uni.ttf.twilightrising.common.misc.TwilightTab;
import uni.ttf.twilightrising.core.TConfig;

@Mod(modid = TwilightRising.MODID, name = TwilightRising.MODNAME, version = TwilightRising.VERSION)
public class TwilightRising {
	public static final String MODID = "twilightrising";
	public static final String MODNAME = "Twilight Rising";
	public static final String VERSION = "1.0";

	private static Configuration config;
	public static CreativeTabs tabTwilight = new TwilightTab(CreativeTabs.getNextID(), "Twilight Rising");

	@SidedProxy(clientSide = "uni.ttf.twilightrising.ClientProxy", serverSide = "uni.ttf.twilightrising.CommonProxy", modId = MODID)
	public static CommonProxy proxy;


	//////////////////////////////////////////////////////
	//                    METHODS                       //
	//////////////////////////////////////////////////////

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());
		TConfig.loadConfig(config);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
