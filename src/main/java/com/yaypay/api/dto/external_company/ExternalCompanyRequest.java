package com.yaypay.api.dto.external_company;

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
public class ExternalCompanyRequest extends EntityRequest {
    private ExternalCompany externalCompany;
    private Integration integration;

    @java.beans.ConstructorProperties({"externalCompany", "integration"})
    ExternalCompanyRequest(ExternalCompany externalCompany, Integration integration) {
        this.externalCompany = externalCompany;
        this.integration = integration;
    }

    public static ExternalCompanyRequestBuilder builder() {
        return new ExternalCompanyRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return externalCompany;
    }

    public ExternalCompany getExternalCompany() {
        return this.externalCompany;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class ExternalCompanyRequestBuilder {
        private ExternalCompany externalCompany;
        private Integration integration;

        ExternalCompanyRequestBuilder() {
        }

        public ExternalCompanyRequest.ExternalCompanyRequestBuilder externalCompany(ExternalCompany externalCompany) {
            this.externalCompany = externalCompany;
            return this;
        }

        public ExternalCompanyRequest.ExternalCompanyRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public ExternalCompanyRequest build() {
            return new ExternalCompanyRequest(externalCompany, integration);
        }

        public String toString() {
            return "ExternalCompanyRequest.ExternalCompanyRequestBuilder(externalCompany=" + this.externalCompany + ", integration=" + this.integration + ")";
        }
    }
}
