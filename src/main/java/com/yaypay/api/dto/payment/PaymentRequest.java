package com.yaypay.api.dto.payment;

import com.yaypay.api.dto.core.EntityRequest;
import com.yaypay.api.dto.core.Integration;

/*************************************************************************
 * * Yaypay CONFIDENTIAL   2018
 * * All Rights Reserved. * *
 * NOTICE: All information contained herein is, and remains the property of Yaypay Incorporated and its suppliers, if any.
 * The intellectual and technical concepts contained  herein are proprietary to Yaypay Incorporated
 * and its suppliers and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material  is strictly forbidden unless prior written permission is obtained  from Yaypay Incorporated.
 * Author : AKuzovchikov
 * Date Created: 7/25/2018 17:49
 */
public class PaymentRequest extends EntityRequest {
    private Payment payment;
    private Integration integration;

    @java.beans.ConstructorProperties({"payment", "integration"})
    PaymentRequest(Payment payment, Integration integration) {
        this.payment = payment;
        this.integration = integration;
    }

    public static PaymentRequestBuilder builder() {
        return new PaymentRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return payment;
    }

    public Payment getPayment() {
        return this.payment;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class PaymentRequestBuilder {
        private Payment payment;
        private Integration integration;

        PaymentRequestBuilder() {
        }

        public PaymentRequest.PaymentRequestBuilder payment(Payment payment) {
            this.payment = payment;
            return this;
        }

        public PaymentRequest.PaymentRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public PaymentRequest build() {
            return new PaymentRequest(payment, integration);
        }

        public String toString() {
            return "PaymentRequest.PaymentRequestBuilder(payment=" + this.payment + ", integration=" + this.integration + ")";
        }
    }
}
