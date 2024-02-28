package org.play.shoporch.infrastructure.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.play.shoporch.infrastructure.model.entity.PricesEntity;
import org.play.shoporch.infrastructure.model.price.PriceResponse;

@Mapper(componentModel = "spring")
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
    PriceResponse mapPricesforlist(PricesEntity price);


}
