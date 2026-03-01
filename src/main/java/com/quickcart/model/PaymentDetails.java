package com.quickcart.model;

import com.quickcart.domain.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {
    private String paymentId;
    private String razopayPaymentLinkId;
    private String razopayPaymentStatus;
    private String razopayPaymentId;
    private PaymentStatus status;
}
