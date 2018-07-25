package com.yaypay.api.dto.transaction;

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
public class UploadTransactionDTO {
    private Long id;

    @java.beans.ConstructorProperties({"id"})
    UploadTransactionDTO(Long id) {
        this.id = id;
    }

    public static UploadTransactionDTOBuilder builder() {
        return new UploadTransactionDTOBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public static class UploadTransactionDTOBuilder {
        private Long id;

        UploadTransactionDTOBuilder() {
        }

        public UploadTransactionDTO.UploadTransactionDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UploadTransactionDTO build() {
            return new UploadTransactionDTO(id);
        }

        public String toString() {
            return "UploadTransactionDTO.UploadTransactionDTOBuilder(id=" + this.id + ")";
        }
    }
}
