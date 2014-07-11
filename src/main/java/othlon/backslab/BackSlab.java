package othlon.backslab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import othlon.backslab.bop.BSBoP;
import othlon.backslab.vanilla.BSVanilla;

/**
 * Created by jen on 4/07/2014.
 */


@Mod(modid = BackSlab.MODID, name = BackSlab.MODNAME, version = BackSlab.VERSION, dependencies = "after:BiomesOPlenty")
public class BackSlab {

    public static final String MODID   = "backslab";
    public static final String MODNAME = "backslab";
    public static final String VERSION = "0.1";

    @Mod.EventHandler
    public static void preInit( FMLPreInitializationEvent event)
    {

        BSConfig.configurating(event.getSuggestedConfigurationFile());

    }//end pre init


    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){
        BSVanilla.SetUp(BSConfig.canBackSlabVanilla, BSConfig.canBackSlabVanilla);
        BSBoP.SetUp();
    }//post init


}
