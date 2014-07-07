package othlon.backslab;

import net.minecraftforge.common.config.Configuration;

import java.io.File;


public class BSConfig {

    //class members

    public static boolean canBackSlabVanilla;
    public static boolean canBackSlabBOP;





    public static void configurating(File confile)
    {
        Configuration config = new Configuration(confile);



        config.load();

        canBackSlabVanilla  = config.get("Vanilla BackSlab","",true,"").getBoolean(true);


       canBackSlabBOP = config.get("Biomes O Plenty BackSlab", "", true, "").getBoolean(true);



        if(config.hasChanged())config.save();
    }

}
