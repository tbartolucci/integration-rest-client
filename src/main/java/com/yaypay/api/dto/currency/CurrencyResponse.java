package com.yaypay.api.dto.currency;

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
public class CurrencyResponse {
    private Integration integration;

    @java.beans.ConstructorProperties({"integration"})
    CurrencyResponse(Integration integration) {
        this.integration = integration;
    }

    public static CurrencyResponseBuilder builder() {
        return new CurrencyResponseBuilder();
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class CurrencyResponseBuilder {
        private Integration integration;

        CurrencyResponseBuilder() {
        }

        public CurrencyResponse.CurrencyResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public CurrencyResponse build() {
            return new CurrencyResponse(integration);
        }

        public String toString() {
            return "CurrencyResponse.CurrencyResponseBuilder(integration=" + this.integration + ")";
        }
    }
}