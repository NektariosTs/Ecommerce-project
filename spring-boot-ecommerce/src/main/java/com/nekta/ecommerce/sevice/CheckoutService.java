package com.nekta.ecommerce.sevice;


import com.nekta.ecommerce.dto.Purchase;
import com.nekta.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
