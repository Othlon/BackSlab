package othlon.backslab.bop;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class BSBoP {

    private static final String[] woodTypes = new String[] {"sacredoak",
            "cherry", "dark", "fir", "holy", "magic", "mangrove", "palm",
            "redwood", "willow", "pine", "hell_bark", "jacaranda", "mahogany"};


    private static final String[] rockTypes = new String[] {"mudbrick"};

    public static void SetUp(){
        for(int i = 0; i < woodTypes.length; i++ )
        {

            ItemStack woodSlab  = new ItemStack(GameData.getBlockRegistry().getObject("BiomesOPlenty:"+woodTypes[i]+"Slab"));
            if(woodSlab.getItem() == null) {
                System.out.println("butts" );
            }

            ItemStack woodPlank = new ItemStack(GameData.getBlockRegistry().getObject("BiomesOPlenty:"+woodTypes[i]+"Plank"));
            if(woodPlank.getItem() == null) {
                System.out.println("double butts" );
            }
            GameRegistry.addShapelessRecipe(woodPlank, woodSlab, woodSlab);

        }

    }

}
