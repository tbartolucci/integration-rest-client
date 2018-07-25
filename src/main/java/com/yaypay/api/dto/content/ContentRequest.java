package com.yaypay.api.dto.content;

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
public class ContentRequest extends EntityRequest {
    private Content content;
    private Integration integration;

    @java.beans.ConstructorProperties({"content", "integration"})
    private ContentRequest(Content content, Integration integration) {
        this.content = content;
        this.integration = integration;
    }

    public ContentRequest() {
    }

    public static ContentRequest of(Content content, Integration integration) {
        return new ContentRequest(content, integration);
    }

    public static ContentRequestBuilder builder() {
        return new ContentRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return content;
    }

    public Content getContent() {
        return this.content;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class ContentRequestBuilder {
        private Content content;
        private Integration integration;

        ContentRequestBuilder() {
        }

        public ContentRequest.ContentRequestBuilder content(Content content) {
            this.content = content;
            return this;
        }

        public ContentRequest.ContentRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public ContentRequest build() {
            return new ContentRequest(content, integration);
        }

        public String toString() {
            return "ContentRequest.ContentRequestBuilder(content=" + this.content + ", integration=" + this.integration + ")";
        }
    }
}
