package com.quantitymeasurement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnitValue {

    @Id
    private String unit;
    private double value;

    public UnitValue() {
    }

    public UnitValue(String unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
