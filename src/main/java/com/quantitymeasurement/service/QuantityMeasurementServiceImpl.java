package com.quantitymeasurement.service;

import com.quantitymeasurement.repository.ConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuantityMeasurementServiceImpl implements IQuantityMeasurement {

    @Autowired
    private ConversionRepository conversionRepository;

    @Override
    public double getConvertQuantity(String unitType, double convertValue) {
        double outputValue;
        if (unitType.equals("CELSIUS_TO_FAHRENHEIT"))
            outputValue = (convertValue * 9 / 5) + 32;
        else if (unitType.equals("FAHRENHEIT_TO_CELSIUS"))
            outputValue = (convertValue - 32) * 5 / 9;
        else outputValue = (convertValue * conversionRepository.findById(unitType).get().getValue());
        return outputValue;
    }
}
