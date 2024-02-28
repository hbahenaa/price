package org.play.shoporch.controller;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.play.shoporch.application.service.IPriceService;
import org.play.shoporch.infrastructure.controller.PriceApiController;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class PriceApiControllerTest {

    @InjectMocks
    private PriceApiController priceApiController;

    @Mock
    private IPriceService priceService;

    @BeforeEach
    void setUp() {
        priceApiController = new PriceApiController(priceService);
    }

    @Test
    void test_controller_price() {
        assertThat(priceApiController.priceMe(LocalDateTime.now(), "1", "3545"));
    }
}
