/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information. 
 ******************************************************************************/
package com.microsoft.simple_exchange_sample;

/**
 * this class holds the service constants to connect to Office 365 Outlook services
 * please note that the sample assume that all of this constants will work for all services, which
 * may not be the case
 *
 * fill in the values according to your subscription
 */
public class ServiceConstants {
    public static final String AUTHORITY_URL = "";
    public static final String RESOURCE_ID = "";
    public static final String REDIRECT_URL = "";
    public static final String CLIENT_ID = "";
    public static final String ENCRYPTION_KEY = "EncryptionKey";
    // it is generally the case for O365 services that the endpoint ID is the concatenation
    // RESOURCE_ID and the api version. Please check against your actual deployment
    public static final String ENDPOINT_ID = RESOURCE_ID + "/api/v1.0";
}