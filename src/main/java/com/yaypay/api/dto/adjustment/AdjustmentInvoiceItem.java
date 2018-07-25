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
public class AdjustmentInvoiceItem {
    private Integration invoice;
    private BigDecimal amount;
    private String adjustmentDate;

    @java.beans.ConstructorProperties({"invoice", "amount", "adjustmentDate"})
    AdjustmentInvoiceItem(Integration invoice, BigDecimal amount, String adjustmentDate) {
        this.invoice = invoice;
        this.amount = amount;
        this.adjustmentDate = adjustmentDate;
    }

    public static AdjustmentInvoiceItemBuilder builder() {
        return new AdjustmentInvoiceItemBuilder();
    }

    public Integration getInvoice() {
        return this.invoice;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getAdjustmentDate() {
        return this.adjustmentDate;
    }

    public static class AdjustmentInvoiceItemBuilder {
        private Integration invoice;
        private BigDecimal amount;
        private String adjustmentDate;

        AdjustmentInvoiceItemBuilder() {
        }

        public AdjustmentInvoiceItem.AdjustmentInvoiceItemBuilder invoice(Integration invoice) {
            this.invoice = invoice;
            return this;
        }

        public AdjustmentInvoiceItem.AdjustmentInvoiceItemBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public AdjustmentInvoiceItem.AdjustmentInvoiceItemBuilder adjustmentDate(String adjustmentDate) {
            this.adjustmentDate = adjustmentDate;
            return this;
        }

        public AdjustmentInvoiceItem build() {
            return new AdjustmentInvoiceItem(invoice, amount, adjustmentDate);
        }

        public String toString() {
            return "AdjustmentInvoiceItem.AdjustmentInvoiceItemBuilder(invoice=" + this.invoice + ", amount=" + this.amount + ", adjustmentDate=" + this.adjustmentDate + ")";
        }
    }
}
