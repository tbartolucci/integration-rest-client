package com.yaypay.api.dto.content;

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

public class Content {
    private String base64Content;
    private String fileName;
    private String contentType;

    @java.beans.ConstructorProperties({"base64Content", "fileName", "contentType"})
    Content(String base64Content, String fileName, String contentType) {
        this.base64Content = base64Content;
        this.fileName = fileName;
        this.contentType = contentType;
    }

    public static ContentBuilder builder() {
        return new ContentBuilder();
    }

    public String getBase64Content() {
        return this.base64Content;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getContentType() {
        return this.contentType;
    }

    public Content setBase64Content(String base64Content) {
        this.base64Content = base64Content;
        return this;
    }

    public Content setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public Content setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public static class ContentBuilder {
        private String base64Content;
        private String fileName;
        private String contentType;

        ContentBuilder() {
        }

        public Content.ContentBuilder base64Content(String base64Content) {
            this.base64Content = base64Content;
            return this;
        }

        public Content.ContentBuilder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Content.ContentBuilder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Content build() {
            return new Content(base64Content, fileName, contentType);
        }

        public String toString() {
            return "Content.ContentBuilder(base64Content=" + this.base64Content + ", fileName=" + this.fileName + ", contentType=" + this.contentType + ")";
        }
    }
}
