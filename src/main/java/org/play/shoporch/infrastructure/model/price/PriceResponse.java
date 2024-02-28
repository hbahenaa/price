package org.play.shoporch.infrastructure.model.price;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;


@Getter
@Setter
public class PriceResponse implements Serializable {

    /**
     * @serial serialVersionUID
     */
    @Serial
    private static final long serialVersionUID = -2719669608796875007L;


    private Integer productId;

    private Integer brandId;

    private Integer priceList;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Integer price;
}
