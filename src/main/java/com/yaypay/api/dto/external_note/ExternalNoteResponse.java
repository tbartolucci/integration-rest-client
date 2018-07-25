package com.yaypay.api.dto.external_note;

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

public class ExternalNoteResponse {

    private ExternalNote externalNote;

    private Long id;

    private String createTime;

    private String updateTime;

    private Integration integration;

    @java.beans.ConstructorProperties({"externalNote", "id", "createTime", "updateTime", "integration"})
    ExternalNoteResponse(ExternalNote externalNote, Long id, String createTime, String updateTime, Integration integration) {
        this.externalNote = externalNote;
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.integration = integration;
    }

    public static ExternalNoteResponseBuilder builder() {
        return new ExternalNoteResponseBuilder();
    }

    public ExternalNote getExternalNote() {
        return this.externalNote;
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

    public static class ExternalNoteResponseBuilder {
        private ExternalNote externalNote;
        private Long id;
        private String createTime;
        private String updateTime;
        private Integration integration;

        ExternalNoteResponseBuilder() {
        }

        public ExternalNoteResponse.ExternalNoteResponseBuilder externalNote(ExternalNote externalNote) {
            this.externalNote = externalNote;
            return this;
        }

        public ExternalNoteResponse.ExternalNoteResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ExternalNoteResponse.ExternalNoteResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public ExternalNoteResponse.ExternalNoteResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ExternalNoteResponse.ExternalNoteResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public ExternalNoteResponse build() {
            return new ExternalNoteResponse(externalNote, id, createTime, updateTime, integration);
        }

        public String toString() {
            return "ExternalNoteResponse.ExternalNoteResponseBuilder(externalNote=" + this.externalNote + ", id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", integration=" + this.integration + ")";
        }
    }
}
