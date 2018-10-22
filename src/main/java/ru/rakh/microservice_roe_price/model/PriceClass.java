package ru.rakh.microservice_roe_price.model;

import java.util.Calendar;
import java.util.Date;

public class PriceClass {

    private Long priceValue;
    private Long minValue;
    private Long maxVal;
    private Long oldValue;
    private Date dateChange;

    public PriceClass() {
    }

    public PriceClass(Long priceValue, Long minValue, Long maxVal, Long oldValue, Date dateChange) {
        this.priceValue = priceValue;
        this.minValue = minValue;
        this.maxVal = maxVal;
        this.oldValue = oldValue;
        this.dateChange = dateChange;
    }

    public Long getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(Long priceValue) {
        this.priceValue = priceValue;
    }

    public Long getMinValue() {
        return minValue;
    }

    public void setMinValue(Long minValue) {
        this.minValue = minValue;
    }

    public Long getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(Long maxVal) {
        this.maxVal = maxVal;
    }

    public Long getOldValue() {
        return oldValue;
    }

    public void setOldValue(Long oldValue) {
        this.oldValue = oldValue;
    }

    public Date getDateChange() {
        return dateChange;
    }

    public void setDateChange(Date dateChange) {
        this.dateChange = dateChange;
    }
}
