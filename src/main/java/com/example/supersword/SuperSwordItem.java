package com.example.supersword;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class SuperSwordItem extends SwordItem {
    // Base player damage is 1, so 99 + 1 = 100 total attack damage.
    public SuperSwordItem(Item.Properties props) {
        super(SuperSwordTier.INSTANCE, props.sword(SuperSwordTier.INSTANCE, 99.0F, -2.4F));
    }
}
