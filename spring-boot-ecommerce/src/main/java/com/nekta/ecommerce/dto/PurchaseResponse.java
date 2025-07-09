package com.nekta.ecommerce.dto;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NonNull;


public class PurchaseResponse {

    private String orderTrackingNumber;

    public PurchaseResponse() {
        // no-args constructor
    }

    public PurchaseResponse(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    // getters & setters

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }
}
