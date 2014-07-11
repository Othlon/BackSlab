package othlon.backslab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import othlon.backslab.bop.BSBoP;
import othlon.backslab.vanilla.BSVanilla;

/**
 * Created by jen on 4/07/2014.
 */


@Mod(modid = BackSlab.MODID, name = BackSlab.MODNAME, version = BackSlab.VERSION )
public class BackSlab {

    public static final String MODID   = "backslab";
    public static final String MODNAME = "backslab";
    public static final String VERSION = "0.1";

    @Mod.EventHandler
    public static void preInit( FMLPreInitializationEvent event)
    {

        BSConfig.configurating(event.getSuggestedConfigurationFile());
        BSVanilla.SetUp(BSConfig.canBackSlabVanilla, BSConfig.canBackSlabVanilla);
        BSBoP.SetUp();
    }//end pre init

}
