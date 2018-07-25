package com.yaypay.api.dto.payment;

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
public class PaymentResponse {

    private Payment payment;

    private Long id;

    private String createTime;

    private String updateTime;

    private Integration integration;

    @java.beans.ConstructorProperties({"payment", "id", "createTime", "updateTime", "integration"})
    PaymentResponse(Payment payment, Long id, String createTime, String updateTime, Integration integration) {
        this.payment = payment;
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.integration = integration;
    }

    public static PaymentResponseBuilder builder() {
        return new PaymentResponseBuilder();
    }

    public Payment getPayment() {
        return this.payment;
    }

    public Long getId() {
        return this.id;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class PaymentResponseBuilder {
        private Payment payment;
        private Long id;
        private String createTime;
        private String updateTime;
        private Integration integration;

        PaymentResponseBuilder() {
        }

        public PaymentResponse.PaymentResponseBuilder payment(Payment payment) {
            this.payment = payment;
            return this;
        }

        public PaymentResponse.PaymentResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PaymentResponse.PaymentResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public PaymentResponse.PaymentResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public PaymentResponse.PaymentResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public PaymentResponse build() {
            return new PaymentResponse(payment, id, createTime, updateTime, integration);
        }

        public String toString() {
            return "PaymentResponse.PaymentResponseBuilder(payment=" + this.payment + ", id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", integration=" + this.integration + ")";
        }
    }
}
