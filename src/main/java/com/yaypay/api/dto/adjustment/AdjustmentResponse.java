package com.yaypay.api.dto.adjustment;

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
public class AdjustmentResponse {

    private Adjustment adjustment;

    private Long id;

    private String createTime;

    private String updateTime;

    private Integration integration;

    @java.beans.ConstructorProperties({"adjustment", "id", "createTime", "updateTime", "integration"})
    AdjustmentResponse(Adjustment adjustment, Long id, String createTime, String updateTime, Integration integration) {
        this.adjustment = adjustment;
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.integration = integration;
    }

    public static AdjustmentResponseBuilder builder() {
        return new AdjustmentResponseBuilder();
    }

    public Adjustment getAdjustment() {
        return this.adjustment;
    }

    public Long getId() {
        return this.id;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class AdjustmentResponseBuilder {
        private Adjustment adjustment;
        private Long id;
        private String createTime;
        private String updateTime;
        private Integration integration;

        AdjustmentResponseBuilder() {
        }

        public AdjustmentResponse.AdjustmentResponseBuilder adjustment(Adjustment adjustment) {
            this.adjustment = adjustment;
            return this;
        }

        public AdjustmentResponse.AdjustmentResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public AdjustmentResponse.AdjustmentResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public AdjustmentResponse.AdjustmentResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public AdjustmentResponse.AdjustmentResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public AdjustmentResponse build() {
            return new AdjustmentResponse(adjustment, id, createTime, updateTime, integration);
        }

        public String toString() {
            return "AdjustmentResponse.AdjustmentResponseBuilder(adjustment=" + this.adjustment + ", id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", integration=" + this.integration + ")";
        }
    }
}
