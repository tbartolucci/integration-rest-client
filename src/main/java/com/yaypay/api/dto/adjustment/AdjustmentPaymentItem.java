package com.yaypay.api.dto.adjustment;

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
public class AdjustmentPaymentItem {
    private Integration payment;
    private BigDecimal amount;
    private String adjustmentDate;

    @java.beans.ConstructorProperties({"payment", "amount", "adjustmentDate"})
    AdjustmentPaymentItem(Integration payment, BigDecimal amount, String adjustmentDate) {
        this.payment = payment;
        this.amount = amount;
        this.adjustmentDate = adjustmentDate;
    }

    public static AdjustmentPaymentItemBuilder builder() {
        return new AdjustmentPaymentItemBuilder();
    }

    public Integration getPayment() {
        return this.payment;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getAdjustmentDate() {
        return this.adjustmentDate;
    }

    public static class AdjustmentPaymentItemBuilder {
        private Integration payment;
        private BigDecimal amount;
        private String adjustmentDate;

        AdjustmentPaymentItemBuilder() {
        }

        public AdjustmentPaymentItem.AdjustmentPaymentItemBuilder payment(Integration payment) {
            this.payment = payment;
            return this;
        }

        public AdjustmentPaymentItem.AdjustmentPaymentItemBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public AdjustmentPaymentItem.AdjustmentPaymentItemBuilder adjustmentDate(String adjustmentDate) {
            this.adjustmentDate = adjustmentDate;
            return this;
        }

        public AdjustmentPaymentItem build() {
            return new AdjustmentPaymentItem(payment, amount, adjustmentDate);
        }

        public String toString() {
            return "AdjustmentPaymentItem.AdjustmentPaymentItemBuilder(payment=" + this.payment + ", amount=" + this.amount + ", adjustmentDate=" + this.adjustmentDate + ")";
        }
    }
}
