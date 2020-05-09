package com.quantitymeasurement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnitValue {

    @Id
    private String Unit;
    private double value;

    public UnitValue() {
    }

    public UnitValue(String unit, double value) {
        Unit = unit;
        this.value = value;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
