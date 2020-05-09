package com.quantitymeasurement.service;

import com.quantitymeasurement.repository.ConversionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuantityMeasurementServiceImplemented implements QuantityMeasurementInterface {

    @Autowired
    ConversionRepository conversionRepository;

    @Autowired
    private ModelMapper modelMapper;

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
