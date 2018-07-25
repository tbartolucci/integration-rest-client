package com.yaypay.api.dto.content;

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
public class ContentResponse {

  private int id;

  private String awsFileName;

  private String originalFileName;

  private String bucket;

  private String createTime;

  private String updateTime;

  private Integration integration;

    @java.beans.ConstructorProperties({"id", "awsFileName", "originalFileName", "bucket", "createTime", "updateTime", "integration"})
    ContentResponse(int id, String awsFileName, String originalFileName, String bucket, String createTime, String updateTime, Integration integration) {
        this.id = id;
        this.awsFileName = awsFileName;
        this.originalFileName = originalFileName;
        this.bucket = bucket;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.integration = integration;
    }

    public static ContentResponseBuilder builder() {
        return new ContentResponseBuilder();
    }

    public int getId() {
        return this.id;
    }

    public String getAwsFileName() {
        return this.awsFileName;
    }

    public String getOriginalFileName() {
        return this.originalFileName;
    }

    public String getBucket() {
        return this.bucket;
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

    public static class ContentResponseBuilder {
        private int id;
        private String awsFileName;
        private String originalFileName;
        private String bucket;
        private String createTime;
        private String updateTime;
        private Integration integration;

        ContentResponseBuilder() {
        }

        public ContentResponse.ContentResponseBuilder id(int id) {
            this.id = id;
            return this;
        }

        public ContentResponse.ContentResponseBuilder awsFileName(String awsFileName) {
            this.awsFileName = awsFileName;
            return this;
        }

        public ContentResponse.ContentResponseBuilder originalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }

        public ContentResponse.ContentResponseBuilder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        public ContentResponse.ContentResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public ContentResponse.ContentResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ContentResponse.ContentResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public ContentResponse build() {
            return new ContentResponse(id, awsFileName, originalFileName, bucket, createTime, updateTime, integration);
        }

        public String toString() {
            return "ContentResponse.ContentResponseBuilder(id=" + this.id + ", awsFileName=" + this.awsFileName + ", originalFileName=" + this.originalFileName + ", bucket=" + this.bucket + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", integration=" + this.integration + ")";
        }
    }
}
