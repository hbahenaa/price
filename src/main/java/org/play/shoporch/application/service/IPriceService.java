package org.play.shoporch.application.service;

import org.play.shoporch.infrastructure.model.price.PriceRequest;
import org.play.shoporch.infrastructure.model.price.PriceResponse;

public interface IPriceService {


    PriceResponse getPrice(PriceRequest priceRequest);
}
