package org.play.shoporch.infrastructure.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.play.shoporch.infrastructure.model.price.PriceRequest;
import org.play.shoporch.infrastructure.model.price.PriceResponse;
import org.play.shoporch.application.service.IPriceService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;


/**
 * The {@link PriceApiController} controller class that allows requests and
 * responds to http requests from the Price API
 */
@Slf4j
@RestController
@RequestMapping("/me")
@RequiredArgsConstructor
public class PriceApiController {

    /**
     * injects The {@link IPriceService}
     */
    private final IPriceService priceService;

    /**
     * retrieves the detailed price information
     *
     * @param dateAplication date for consult
     * @param brandId value brand for consult
     * @param productID value product for consult
     * @return PriceResponse for information detailed price
     */
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public PriceResponse priceMe(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime dateAplication,
                                 @RequestParam(value = "brandId", required = false) String brandId,
                                 @RequestParam(value = "productID", required = false) String productID) {
        log.info("init Get priceMe");
        var priceRequest = new PriceRequest();
        priceRequest.setEndDate(dateAplication);
        priceRequest.setBrandId(Integer.valueOf(brandId));
        priceRequest.setProductId(Integer.valueOf(productID));

        try {
            return priceService.getPrice(priceRequest);
        } catch (NoSuchElementException e) {
            return new PriceResponse();
        }
    }
}



