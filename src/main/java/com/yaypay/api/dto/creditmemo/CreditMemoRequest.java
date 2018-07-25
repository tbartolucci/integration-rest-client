package com.yaypay.api.dto.creditmemo;

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
public class CreditMemoRequest extends EntityRequest {
    private CreditMemo creditMemo;
    private Integration integration;

    @java.beans.ConstructorProperties({"creditMemo", "integration"})
    CreditMemoRequest(CreditMemo creditMemo, Integration integration) {
        this.creditMemo = creditMemo;
        this.integration = integration;
    }

    public static CreditMemoRequestBuilder builder() {
        return new CreditMemoRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return creditMemo;
    }

    public CreditMemo getCreditMemo() {
        return this.creditMemo;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class CreditMemoRequestBuilder {
        private CreditMemo creditMemo;
        private Integration integration;

        CreditMemoRequestBuilder() {
        }

        public CreditMemoRequest.CreditMemoRequestBuilder creditMemo(CreditMemo creditMemo) {
            this.creditMemo = creditMemo;
            return this;
        }

        public CreditMemoRequest.CreditMemoRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public CreditMemoRequest build() {
            return new CreditMemoRequest(creditMemo, integration);
        }

        public String toString() {
            return "CreditMemoRequest.CreditMemoRequestBuilder(creditMemo=" + this.creditMemo + ", integration=" + this.integration + ")";
        }
    }
}
