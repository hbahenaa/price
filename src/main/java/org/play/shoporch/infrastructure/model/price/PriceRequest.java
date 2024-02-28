package org.play.shoporch.infrastructure.model.price;


import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class PriceRequest  implements Serializable {

    /**
     * @serial serialVersionUID
     */
    @Serial
    private static final long serialVersionUID = 8491181954279766052L;

    private LocalDateTime endDate;

    private Integer productId;

    private Integer brandId;

}
