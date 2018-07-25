package com.yaypay.api.dto.creditmemo;

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
public class CreditMemoItem {
    private Integration applyEntity;
    private BigDecimal amount;
    private String paymentDate;

    @java.beans.ConstructorProperties({"applyEntity", "amount", "paymentDate"})
    CreditMemoItem(Integration applyEntity, BigDecimal amount, String paymentDate) {
        this.applyEntity = applyEntity;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public static CreditMemoItemBuilder builder() {
        return new CreditMemoItemBuilder();
    }

    public Integration getApplyEntity() {
        return this.applyEntity;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getPaymentDate() {
        return this.paymentDate;
    }

    public static class CreditMemoItemBuilder {
        private Integration applyEntity;
        private BigDecimal amount;
        private String paymentDate;

        CreditMemoItemBuilder() {
        }

        public CreditMemoItem.CreditMemoItemBuilder applyEntity(Integration applyEntity) {
            this.applyEntity = applyEntity;
            return this;
        }

        public CreditMemoItem.CreditMemoItemBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public CreditMemoItem.CreditMemoItemBuilder paymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public CreditMemoItem build() {
            return new CreditMemoItem(applyEntity, amount, paymentDate);
        }

        public String toString() {
            return "CreditMemoItem.CreditMemoItemBuilder(applyEntity=" + this.applyEntity + ", amount=" + this.amount + ", paymentDate=" + this.paymentDate + ")";
        }
    }
}
