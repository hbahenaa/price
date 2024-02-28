package org.play.shoporch.application.service;

import lombok.AllArgsConstructor;
import org.play.shoporch.infrastructure.model.entity.PricesEntity;
import org.play.shoporch.infrastructure.model.price.PriceRequest;
import org.play.shoporch.infrastructure.model.price.PriceResponse;
import org.play.shoporch.application.repository.IPriceRepository;
import org.springframework.stereotype.Service;
import org.play.shoporch.infrastructure.mapper.PriceMapper;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class PriceService implements IPriceService {

    private final IPriceRepository priceRepository;

    @Override
    public PriceResponse getPrice(PriceRequest priceRequest) {
        List<PricesEntity> prices = priceRepository.findRangeDateApplication(priceRequest.getEndDate(), priceRequest.getBrandId(), priceRequest.getProductId());
        PricesEntity price = prices.stream().sorted(Comparator.comparing(PricesEntity::getPriority)).findFirst().orElseThrow(NoSuchElementException::new);
        return PriceMapper.INSTANCE.mapPricesforlist(price);

    }
}
