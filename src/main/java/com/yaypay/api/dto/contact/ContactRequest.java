package com.yaypay.api.dto.contact;

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
public class ContactRequest extends EntityRequest {
    private Contact contact;
    private Integration integration;

    @java.beans.ConstructorProperties({"contact", "integration"})
    ContactRequest(Contact contact, Integration integration) {
        this.contact = contact;
        this.integration = integration;
    }

    public static ContactRequestBuilder builder() {
        return new ContactRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return contact;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class ContactRequestBuilder {
        private Contact contact;
        private Integration integration;

        ContactRequestBuilder() {
        }

        public ContactRequest.ContactRequestBuilder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public ContactRequest.ContactRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public ContactRequest build() {
            return new ContactRequest(contact, integration);
        }

        public String toString() {
            return "ContactRequest.ContactRequestBuilder(contact=" + this.contact + ", integration=" + this.integration + ")";
        }
    }
}
