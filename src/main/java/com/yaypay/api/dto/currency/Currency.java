package com.yaypay.api.dto.currency;

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
public class Currency {
    private String name;
    private String isoCode;
    private BigDecimal exchangeRate;
    private Boolean primary;

    @java.beans.ConstructorProperties({"name", "isoCode", "exchangeRate", "primary"})
    Currency(String name, String isoCode, BigDecimal exchangeRate, Boolean primary) {
        this.name = name;
        this.isoCode = isoCode;
        this.exchangeRate = exchangeRate;
        this.primary = primary;
    }

    public static CurrencyBuilder builder() {
        return new CurrencyBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getIsoCode() {
        return this.isoCode;
    }

    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    public Boolean getPrimary() {
        return this.primary;
    }

    public static class CurrencyBuilder {
        private String name;
        private String isoCode;
        private BigDecimal exchangeRate;
        private Boolean primary;

        CurrencyBuilder() {
        }

        public Currency.CurrencyBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Currency.CurrencyBuilder isoCode(String isoCode) {
            this.isoCode = isoCode;
            return this;
        }

        public Currency.CurrencyBuilder exchangeRate(BigDecimal exchangeRate) {
            this.exchangeRate = exchangeRate;
            return this;
        }

        public Currency.CurrencyBuilder primary(Boolean primary) {
            this.primary = primary;
            return this;
        }

        public Currency build() {
            return new Currency(name, isoCode, exchangeRate, primary);
        }

        public String toString() {
            return "Currency.CurrencyBuilder(name=" + this.name + ", isoCode=" + this.isoCode + ", exchangeRate=" + this.exchangeRate + ", primary=" + this.primary + ")";
        }
    }
}