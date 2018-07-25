package com.yaypay.api.dto.core;

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
public class Integration {
    private String internalId;
    private String source;

    @java.beans.ConstructorProperties({"internalId", "source"})
    private Integration(String internalId, String source) {
        this.internalId = internalId;
        this.source = source;
    }

    public static Integration of(String internalId, String source) {
        return new Integration(internalId, source);
    }

    public static IntegrationBuilder builder() {
        return new IntegrationBuilder();
    }

    public String getInternalId() {
        return this.internalId;
    }

    public String getSource() {
        return this.source;
    }

    public static class IntegrationBuilder {
        private String internalId;
        private String source;

        IntegrationBuilder() {
        }

        public Integration.IntegrationBuilder internalId(String internalId) {
            this.internalId = internalId;
            return this;
        }

        public Integration.IntegrationBuilder source(String source) {
            this.source = source;
            return this;
        }

        public Integration build() {
            return new Integration(internalId, source);
        }

        public String toString() {
            return "Integration.IntegrationBuilder(internalId=" + this.internalId + ", source=" + this.source + ")";
        }
    }
}
