package com.yaypay.api.dto.external_contact;

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
public class ExternalContactRequest extends EntityRequest {
    private ExternalContact externalContact;
    private Integration integration;

    @java.beans.ConstructorProperties({"externalContact", "integration"})
    ExternalContactRequest(ExternalContact externalContact, Integration integration) {
        this.externalContact = externalContact;
        this.integration = integration;
    }

    public static ExternalContactRequestBuilder builder() {
        return new ExternalContactRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return externalContact;
    }

    public ExternalContact getExternalContact() {
        return this.externalContact;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class ExternalContactRequestBuilder {
        private ExternalContact externalContact;
        private Integration integration;

        ExternalContactRequestBuilder() {
        }

        public ExternalContactRequest.ExternalContactRequestBuilder externalContact(ExternalContact externalContact) {
            this.externalContact = externalContact;
            return this;
        }

        public ExternalContactRequest.ExternalContactRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public ExternalContactRequest build() {
            return new ExternalContactRequest(externalContact, integration);
        }

        public String toString() {
            return "ExternalContactRequest.ExternalContactRequestBuilder(externalContact=" + this.externalContact + ", integration=" + this.integration + ")";
        }
    }
}
