package com.yaypay.api.dto.creditmemo;

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
public class CreditMemo {
    private Integration customer;
    private String paymentDate;
    private String channel;
    private BigDecimal amount;
    private BigDecimal appliedAmount;
    private BigDecimal exchangeRate;
    private String currency;
    private List<CreditMemoItem> applyInvoiceList;
    private String referenceNumber;

    @java.beans.ConstructorProperties({"customer", "paymentDate", "channel", "amount", "appliedAmount", "exchangeRate", "currency", "applyInvoiceList", "referenceNumber"})
    CreditMemo(Integration customer, String paymentDate, String channel, BigDecimal amount, BigDecimal appliedAmount, BigDecimal exchangeRate, String currency, List<CreditMemoItem> applyInvoiceList, String referenceNumber) {
        this.customer = customer;
        this.paymentDate = paymentDate;
        this.channel = channel;
        this.amount = amount;
        this.appliedAmount = appliedAmount;
        this.exchangeRate = exchangeRate;
        this.currency = currency;
        this.applyInvoiceList = applyInvoiceList;
        this.referenceNumber = referenceNumber;
    }

    public static CreditMemoBuilder builder() {
        return new CreditMemoBuilder();
    }

    public Integration getCustomer() {
        return this.customer;
    }

    public String getPaymentDate() {
        return this.paymentDate;
    }

    public String getChannel() {
        return this.channel;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BigDecimal getAppliedAmount() {
        return this.appliedAmount;
    }

    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    public String getCurrency() {
        return this.currency;
    }

    public List<CreditMemoItem> getApplyInvoiceList() {
        return this.applyInvoiceList;
    }

    public String getReferenceNumber() {
        return this.referenceNumber;
    }

    public static class CreditMemoBuilder {
        private Integration customer;
        private String paymentDate;
        private String channel;
        private BigDecimal amount;
        private BigDecimal appliedAmount;
        private BigDecimal exchangeRate;
        private String currency;
        private List<CreditMemoItem> applyInvoiceList;
        private String referenceNumber;

        CreditMemoBuilder() {
        }

        public CreditMemo.CreditMemoBuilder customer(Integration customer) {
            this.customer = customer;
            return this;
        }

        public CreditMemo.CreditMemoBuilder paymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public CreditMemo.CreditMemoBuilder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public CreditMemo.CreditMemoBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public CreditMemo.CreditMemoBuilder appliedAmount(BigDecimal appliedAmount) {
            this.appliedAmount = appliedAmount;
            return this;
        }

        public CreditMemo.CreditMemoBuilder exchangeRate(BigDecimal exchangeRate) {
            this.exchangeRate = exchangeRate;
            return this;
        }

        public CreditMemo.CreditMemoBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public CreditMemo.CreditMemoBuilder applyInvoiceList(List<CreditMemoItem> applyInvoiceList) {
            this.applyInvoiceList = applyInvoiceList;
            return this;
        }

        public CreditMemo.CreditMemoBuilder referenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public CreditMemo build() {
            return new CreditMemo(customer, paymentDate, channel, amount, appliedAmount, exchangeRate, currency, applyInvoiceList, referenceNumber);
        }

        public String toString() {
            return "CreditMemo.CreditMemoBuilder(customer=" + this.customer + ", paymentDate=" + this.paymentDate + ", channel=" + this.channel + ", amount=" + this.amount + ", appliedAmount=" + this.appliedAmount + ", exchangeRate=" + this.exchangeRate + ", currency=" + this.currency + ", applyInvoiceList=" + this.applyInvoiceList + ", referenceNumber=" + this.referenceNumber + ")";
        }
    }
}
