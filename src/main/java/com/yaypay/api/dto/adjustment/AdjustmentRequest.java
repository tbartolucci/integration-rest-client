package com.yaypay.api.dto.adjustment;

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
public class AdjustmentRequest extends EntityRequest {
    private Adjustment adjustment;
    private Integration integration;

    @java.beans.ConstructorProperties({"adjustment", "integration"})
    AdjustmentRequest(Adjustment adjustment, Integration integration) {
        this.adjustment = adjustment;
        this.integration = integration;
    }

    public static AdjustmentRequestBuilder builder() {
        return new AdjustmentRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return adjustment;
    }

    public Adjustment getAdjustment() {
        return this.adjustment;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class AdjustmentRequestBuilder {
        private Adjustment adjustment;
        private Integration integration;

        AdjustmentRequestBuilder() {
        }

        public AdjustmentRequest.AdjustmentRequestBuilder adjustment(Adjustment adjustment) {
            this.adjustment = adjustment;
            return this;
        }

        public AdjustmentRequest.AdjustmentRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public AdjustmentRequest build() {
            return new AdjustmentRequest(adjustment, integration);
        }

        public String toString() {
            return "AdjustmentRequest.AdjustmentRequestBuilder(adjustment=" + this.adjustment + ", integration=" + this.integration + ")";
        }
    }
}
