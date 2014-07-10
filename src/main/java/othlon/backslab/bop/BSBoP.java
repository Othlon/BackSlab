package othlon.backslab.bop;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class BSBoP {

    private static final String[] woodTypes = new String[] {"sacredoak",
            "cherry", "dark", "fir", "holy", "magic", "mangrove", "palm",
            "redwood", "willow", "pine", "hell_bark", "jacaranda", "mahogany"};


    private static final String[] rockTypes = new String[] {"mudbrick"};

    public static void SetUp(){
        for(int i = 0; i < woodTypes.length; i++ )
        {

            ItemStack woodSlab  = new ItemStack(Block.getBlockFromName("BiomesOPlenty:"+woodTypes[i]+"Slab"));
            ItemStack woodPlank = new ItemStack(Block.getBlockFromName("BiomesOPlenty:"+woodTypes[i]+"Plank"));
            GameRegistry.addShapelessRecipe(woodPlank, woodSlab, woodSlab);

        }

    }

}
