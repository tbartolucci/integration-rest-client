package com.yaypay.api.dto.adjustment;

import com.yaypay.api.dto.core.Integration;

import java.math.BigDecimal;
import java.util.List;

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
public class Adjustment {
    private Integration customer;
    private String adjustmentDate;
    private String adjustmentNumber;
    private String currency;
    private BigDecimal total;
    private BigDecimal appliedAmount;
    private BigDecimal exchangeRate;
    private AdjustmentType adjustmentType;
    private List<AdjustmentInvoiceItem> adjustmentInvoiceItems;
    private List<AdjustmentPaymentItem> adjustmentPaymentItems;

    @java.beans.ConstructorProperties({"customer", "adjustmentDate", "adjustmentNumber", "currency", "total", "appliedAmount", "exchangeRate", "adjustmentType", "adjustmentInvoiceItems", "adjustmentPaymentItems"})
    Adjustment(Integration customer, String adjustmentDate, String adjustmentNumber, String currency, BigDecimal total, BigDecimal appliedAmount, BigDecimal exchangeRate, AdjustmentType adjustmentType, List<AdjustmentInvoiceItem> adjustmentInvoiceItems, List<AdjustmentPaymentItem> adjustmentPaymentItems) {
        this.customer = customer;
        this.adjustmentDate = adjustmentDate;
        this.adjustmentNumber = adjustmentNumber;
        this.currency = currency;
        this.total = total;
        this.appliedAmount = appliedAmount;
        this.exchangeRate = exchangeRate;
        this.adjustmentType = adjustmentType;
        this.adjustmentInvoiceItems = adjustmentInvoiceItems;
        this.adjustmentPaymentItems = adjustmentPaymentItems;
    }

    public static AdjustmentBuilder builder() {
        return new AdjustmentBuilder();
    }

    public Integration getCustomer() {
        return this.customer;
    }

    public String getAdjustmentDate() {
        return this.adjustmentDate;
    }

    public String getAdjustmentNumber() {
        return this.adjustmentNumber;
    }

    public String getCurrency() {
        return this.currency;
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public BigDecimal getAppliedAmount() {
        return this.appliedAmount;
    }

    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    public AdjustmentType getAdjustmentType() {
        return this.adjustmentType;
    }

    public List<AdjustmentInvoiceItem> getAdjustmentInvoiceItems() {
        return this.adjustmentInvoiceItems;
    }

    public List<AdjustmentPaymentItem> getAdjustmentPaymentItems() {
        return this.adjustmentPaymentItems;
    }

    public static class AdjustmentBuilder {
        private Integration customer;
        private String adjustmentDate;
        private String adjustmentNumber;
        private String currency;
        private BigDecimal total;
        private BigDecimal appliedAmount;
        private BigDecimal exchangeRate;
        private AdjustmentType adjustmentType;
        private List<AdjustmentInvoiceItem> adjustmentInvoiceItems;
        private List<AdjustmentPaymentItem> adjustmentPaymentItems;

        AdjustmentBuilder() {
        }

        public Adjustment.AdjustmentBuilder customer(Integration customer) {
            this.customer = customer;
            return this;
        }

        public Adjustment.AdjustmentBuilder adjustmentDate(String adjustmentDate) {
            this.adjustmentDate = adjustmentDate;
            return this;
        }

        public Adjustment.AdjustmentBuilder adjustmentNumber(String adjustmentNumber) {
            this.adjustmentNumber = adjustmentNumber;
            return this;
        }

        public Adjustment.AdjustmentBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Adjustment.AdjustmentBuilder total(BigDecimal total) {
            this.total = total;
            return this;
        }

        public Adjustment.AdjustmentBuilder appliedAmount(BigDecimal appliedAmount) {
            this.appliedAmount = appliedAmount;
            return this;
        }

        public Adjustment.AdjustmentBuilder exchangeRate(BigDecimal exchangeRate) {
            this.exchangeRate = exchangeRate;
            return this;
        }

        public Adjustment.AdjustmentBuilder adjustmentType(AdjustmentType adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }

        public Adjustment.AdjustmentBuilder adjustmentInvoiceItems(List<AdjustmentInvoiceItem> adjustmentInvoiceItems) {
            this.adjustmentInvoiceItems = adjustmentInvoiceItems;
            return this;
        }

        public Adjustment.AdjustmentBuilder adjustmentPaymentItems(List<AdjustmentPaymentItem> adjustmentPaymentItems) {
            this.adjustmentPaymentItems = adjustmentPaymentItems;
            return this;
        }

        public Adjustment build() {
            return new Adjustment(customer, adjustmentDate, adjustmentNumber, currency, total, appliedAmount, exchangeRate, adjustmentType, adjustmentInvoiceItems, adjustmentPaymentItems);
        }

        public String toString() {
            return "Adjustment.AdjustmentBuilder(customer=" + this.customer + ", adjustmentDate=" + this.adjustmentDate + ", adjustmentNumber=" + this.adjustmentNumber + ", currency=" + this.currency + ", total=" + this.total + ", appliedAmount=" + this.appliedAmount + ", exchangeRate=" + this.exchangeRate + ", adjustmentType=" + this.adjustmentType + ", adjustmentInvoiceItems=" + this.adjustmentInvoiceItems + ", adjustmentPaymentItems=" + this.adjustmentPaymentItems + ")";
        }
    }
}
