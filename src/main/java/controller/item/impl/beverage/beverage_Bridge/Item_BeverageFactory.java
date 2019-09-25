package controller.item.impl.beverage.beverage_Bridge;

import domain.item.impl.ItemBridge.Item_beverage;

public class Item_BeverageFactory {
    public static Item_beverage getItem_beverage(String id,String item_id,String classic_id,String description){
        return new Item_beverage.Builder(id)
                .buildBeverage(classic_id)
                .buildDescription(description)
                .buildItemId(item_id)
                .build();
    }
}
