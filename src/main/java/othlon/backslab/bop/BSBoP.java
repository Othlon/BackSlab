package othlon.backslab.bop;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

/**
 * Created by jen on 7/07/2014.
 */
public class BSBoP {

    private static final String[] woodTypes = new String[] {"sacredoak",
            "cherry", "dark", "fir", "holy", "magic", "mangrove", "palm",
            "redwood", "willow", "pine", "hell_bark", "jacaranda", "mahogany"};


    private static final String[] rockTypes = new String[] {"mudbrick"};

    public static void SetUp(){
        for(int i = 0; i < woodTypes.length; i++ )
        {

            ItemStack woodSlab  = new ItemStack(GameData.getBlockRegistry().getObject("biomesoplenty:"+woodTypes[i]+"Slab"));
            ItemStack woodBlock = new ItemStack(GameData.getBlockRegistry().getObject("biomesoplenty:"+woodTypes[i]+"Plank"));
            GameRegistry.addShapelessRecipe(woodBlock, woodSlab, woodSlab);
        }

    }

}
