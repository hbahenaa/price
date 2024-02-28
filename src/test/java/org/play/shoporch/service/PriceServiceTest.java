package org.play.shoporch.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.play.shoporch.application.repository.IPriceRepository;
import org.play.shoporch.application.service.PriceService;
import org.play.shoporch.factory.PriceFactory;
import org.play.shoporch.infrastructure.model.entity.PricesEntity;
import org.play.shoporch.infrastructure.model.price.PriceRequest;
import org.play.shoporch.infrastructure.model.price.PriceResponse;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class PriceServiceTest {

    @InjectMocks
    private PriceService priceService;

    @Mock
    private IPriceRepository priceRepository;

    @Test
    void test_service_getPrice(){
        PriceRequest priceRequest = new PriceRequest();

        List<PricesEntity> priceList = new ArrayList<>();
        priceList.add(PriceFactory.generatePrices());
        Mockito.when(priceRepository.findRangeDateApplication(any(), any(), any())).thenReturn(priceList);

                PriceResponse price=priceService.getPrice(priceRequest);
                assertNotNull(price);
    }
}
