package com.quantitymeasurement.controller;

import com.quantitymeasurement.service.QuantityMeasurementInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuantityMeasurementController {

    @Autowired
    QuantityMeasurementInterface quantityMeasurementInterface;

    @GetMapping("/{unitType}/{inputValue}")
    public double getConversion(@PathVariable String unitType, @PathVariable double inputValue) {
        return quantityMeasurementInterface.getConvertQuantity(unitType, inputValue);
    }
}
