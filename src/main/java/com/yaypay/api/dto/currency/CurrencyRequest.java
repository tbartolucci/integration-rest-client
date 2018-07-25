package com.yaypay.api.dto.currency;

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
public class CurrencyRequest extends EntityRequest {
    private Currency currency;
    private Integration integration;

    @java.beans.ConstructorProperties({"currency", "integration"})
    CurrencyRequest(Currency currency, Integration integration) {
        this.currency = currency;
        this.integration = integration;
    }

    public static CurrencyRequestBuilder builder() {
        return new CurrencyRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return currency;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class CurrencyRequestBuilder {
        private Currency currency;
        private Integration integration;

        CurrencyRequestBuilder() {
        }

        public CurrencyRequest.CurrencyRequestBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public CurrencyRequest.CurrencyRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public CurrencyRequest build() {
            return new CurrencyRequest(currency, integration);
        }

        public String toString() {
            return "CurrencyRequest.CurrencyRequestBuilder(currency=" + this.currency + ", integration=" + this.integration + ")";
        }
    }
}