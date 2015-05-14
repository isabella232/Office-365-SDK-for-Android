/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.onenote.api.orc;

import com.microsoft.onenote.api.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.*;
import com.microsoft.services.orc.interfaces.*;
import static com.microsoft.services.orc.Helpers.*;

/**
 * The type SiteCollectionCollectionOperations
 */
public class SiteCollectionCollectionOperations extends OrcOperations{

    /**
     * Instantiates a new SiteCollectionCollectionOperations.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
    public SiteCollectionCollectionOperations(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public SiteCollectionCollectionOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public SiteCollectionCollectionOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }
 
     
    /**
     * FromUrl listenable future.
     * @param url the url 
     * @return the listenable future
     */         
    public ListenableFuture<SiteMetadata> fromUrl(String url) { 
        
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedurl = serializer.serialize(url);
		  
        
        ListenableFuture<String> future = fromUrlRaw(serializedurl);
        return transformToEntityListenableFuture(future, SiteMetadata.class, getResolver());
        
    }

     /**
     * FromUrlRaw listenable future.
     * @param url the url 
     * @return the listenable future
     */ 
    public ListenableFuture<String> fromUrlRaw(String url){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("url", url);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
            
        request.setContent(getResolver().getJsonSerializer()
                                        .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));

        
        request.getUrl().appendPathComponent("FromUrl");
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


                
}
