package org.play.shoporch.application.repository;

import org.play.shoporch.infrastructure.model.entity.PricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;



    @Repository
    public interface IPriceRepository extends JpaRepository<PricesEntity,Long> {

        @Query("SELECT p FROM PricesEntity p WHERE p.startDate <= ?1 and p.endDate >= ?1 and p.brandId = ?2 and p.productId = ?3")
        public List<PricesEntity> findRangeDateApplication(LocalDateTime starDate, Integer brandId, Integer productId);

    }

