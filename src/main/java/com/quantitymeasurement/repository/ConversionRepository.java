package com.quantitymeasurement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quantitymeasurement.model.UnitValue;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversionRepository extends JpaRepository<UnitValue, String> {
}
