package com.quantitymeasurement.controller;

import com.quantitymeasurement.service.IQuantityMeasurement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quantityConversion")
public class QuantityMeasurement {

    @Autowired
    private IQuantityMeasurement quantityMeasurementInterface;

    @GetMapping("/getConversion/{unitType}/{inputValue}")
    public double getConversion(@PathVariable String unitType, @PathVariable double inputValue) {
        return quantityMeasurementInterface.getConvertQuantity(unitType, inputValue);
    }
}
