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
public class ExternalNote {
    private String title;
    private String body;
    private Integration externalCompany;
    private Integration externalUser;

    @java.beans.ConstructorProperties({"title", "body", "externalCompany", "externalUser"})
    ExternalNote(String title, String body, Integration externalCompany, Integration externalUser) {
        this.title = title;
        this.body = body;
        this.externalCompany = externalCompany;
        this.externalUser = externalUser;
    }

    public static ExternalNoteBuilder builder() {
        return new ExternalNoteBuilder();
    }

    public String getTitle() {
        return this.title;
    }

    public String getBody() {
        return this.body;
    }

    public Integration getExternalCompany() {
        return this.externalCompany;
    }

    public Integration getExternalUser() {
        return this.externalUser;
    }

    public static class ExternalNoteBuilder {
        private String title;
        private String body;
        private Integration externalCompany;
        private Integration externalUser;

        ExternalNoteBuilder() {
        }

        public ExternalNote.ExternalNoteBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ExternalNote.ExternalNoteBuilder body(String body) {
            this.body = body;
            return this;
        }

        public ExternalNote.ExternalNoteBuilder externalCompany(Integration externalCompany) {
            this.externalCompany = externalCompany;
            return this;
        }

        public ExternalNote.ExternalNoteBuilder externalUser(Integration externalUser) {
            this.externalUser = externalUser;
            return this;
        }

        public ExternalNote build() {
            return new ExternalNote(title, body, externalCompany, externalUser);
        }

        public String toString() {
            return "ExternalNote.ExternalNoteBuilder(title=" + this.title + ", body=" + this.body + ", externalCompany=" + this.externalCompany + ", externalUser=" + this.externalUser + ")";
        }
    }
}
