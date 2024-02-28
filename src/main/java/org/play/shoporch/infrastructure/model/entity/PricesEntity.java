package org.play.shoporch.infrastructure.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PRICE")
public class PricesEntity implements Serializable {

    /**
     * @serial serialVersionUID
     */
    @Serial
    private static final long serialVersionUID = 3286408069002446097L;

    @JsonProperty("BRAND_ID")
    private Integer brandId;
    @JsonProperty("START_DATE")
    private LocalDateTime startDate;
    @JsonProperty("END_DATE")
    private LocalDateTime endDate;
    @JsonProperty("PRICE_LIST")
    private Integer priceList;
    @JsonProperty("PRODUCT_ID")
    private Integer productId;
    @JsonProperty("PRIORITY")
    private Integer priority;
    @JsonProperty("PRICE")
    private Integer price;
    @JsonProperty("CURRENCY")
    private String currency;
    @JsonProperty("LAST_UPDATE")
    private LocalDateTime lastUpdate;
    @JsonProperty("LAST_UPDATE_BY")
    private String lastUpdateBy;
    @Id
    private Long id;

}
