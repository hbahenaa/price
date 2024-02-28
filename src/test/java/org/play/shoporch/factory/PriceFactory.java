package org.play.shoporch.factory;

import org.play.shoporch.infrastructure.model.entity.PricesEntity;

public class PriceFactory {


    public static  final String resource_price = "mocks/price.json";
    public static PricesEntity generatePrices(){
        Object obj = ObjectFactory.createMock(PricesEntity.class,resource_price);

        if(obj != null){
            return (PricesEntity) obj;
        }
        return null;
    }

}
