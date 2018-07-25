package com.yaypay.api.dto.payment;

import com.yaypay.api.dto.core.Integration;

import java.math.BigDecimal;

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
public class PaymentItem {

    private Integration invoice;
    private BigDecimal amount;
    private BigDecimal discount;
    private BigDecimal appliedAmount;
    private String paymentDate;

    @java.beans.ConstructorProperties({"invoice", "amount", "discount", "appliedAmount", "paymentDate"})
    PaymentItem(Integration invoice, BigDecimal amount, BigDecimal discount, BigDecimal appliedAmount, String paymentDate) {
        this.invoice = invoice;
        this.amount = amount;
        this.discount = discount;
        this.appliedAmount = appliedAmount;
        this.paymentDate = paymentDate;
    }

    public static PaymentItemBuilder builder() {
        return new PaymentItemBuilder();
    }

    public Integration getInvoice() {
        return this.invoice;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public BigDecimal getAppliedAmount() {
        return this.appliedAmount;
    }

    public String getPaymentDate() {
        return this.paymentDate;
    }

    public static class PaymentItemBuilder {
        private Integration invoice;
        private BigDecimal amount;
        private BigDecimal discount;
        private BigDecimal appliedAmount;
        private String paymentDate;

        PaymentItemBuilder() {
        }

        public PaymentItem.PaymentItemBuilder invoice(Integration invoice) {
            this.invoice = invoice;
            return this;
        }

        public PaymentItem.PaymentItemBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public PaymentItem.PaymentItemBuilder discount(BigDecimal discount) {
            this.discount = discount;
            return this;
        }

        public PaymentItem.PaymentItemBuilder appliedAmount(BigDecimal appliedAmount) {
            this.appliedAmount = appliedAmount;
            return this;
        }

        public PaymentItem.PaymentItemBuilder paymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public PaymentItem build() {
            return new PaymentItem(invoice, amount, discount, appliedAmount, paymentDate);
        }

        public String toString() {
            return "PaymentItem.PaymentItemBuilder(invoice=" + this.invoice + ", amount=" + this.amount + ", discount=" + this.discount + ", appliedAmount=" + this.appliedAmount + ", paymentDate=" + this.paymentDate + ")";
        }
    }
}
