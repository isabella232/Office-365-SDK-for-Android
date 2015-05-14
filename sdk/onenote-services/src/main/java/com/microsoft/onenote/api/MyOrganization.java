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
package com.microsoft.onenote.api;

/**
 * The type My Organization.
*/
public class MyOrganization extends ODataBaseEntity {

    public MyOrganization(){
        setODataType("#Microsoft.OneNote.Api.MyOrganization");
    }
            
    private String id;
     
    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getid() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setid(String value) { 
        this.id = value; 
    }
    
        
    private java.util.List<SiteCollection> siteCollections = null;
    
    
     
    /**
    * Gets the site Collections.
    *
    * @return the java.util.List<SiteCollection>
    */
    public java.util.List<SiteCollection> getsiteCollections() {
        return this.siteCollections; 
    }

    /**
    * Sets the site Collections.
    *
    * @param value the java.util.List<SiteCollection>
    */
    public void setsiteCollections(java.util.List<SiteCollection> value) { 
        this.siteCollections = value; 
    }
}

