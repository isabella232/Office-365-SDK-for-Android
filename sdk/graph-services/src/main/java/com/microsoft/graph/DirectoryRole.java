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
package com.microsoft.graph;

/**
 * The type Directory Role.
*/
public class DirectoryRole extends DirectoryObject {

    public DirectoryRole(){
        setODataType("#Microsoft.Graph.DirectoryRole");
    }
            
    private String description;
     
    /**
    * Gets the description.
    *
    * @return the String
    */
    public String getdescription() {
        return this.description; 
    }

    /**
    * Sets the description.
    *
    * @param value the String
    */
    public void setdescription(String value) { 
        this.description = value; 
    }
            
    private String displayName;
     
    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getdisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setdisplayName(String value) { 
        this.displayName = value; 
    }
            
    private Boolean isSystem;
     
    /**
    * Gets the is System.
    *
    * @return the Boolean
    */
    public Boolean getisSystem() {
        return this.isSystem; 
    }

    /**
    * Sets the is System.
    *
    * @param value the Boolean
    */
    public void setisSystem(Boolean value) { 
        this.isSystem = value; 
    }
            
    private Boolean roleDisabled;
     
    /**
    * Gets the role Disabled.
    *
    * @return the Boolean
    */
    public Boolean getroleDisabled() {
        return this.roleDisabled; 
    }

    /**
    * Sets the role Disabled.
    *
    * @param value the Boolean
    */
    public void setroleDisabled(Boolean value) { 
        this.roleDisabled = value; 
    }
            
    private String roleTemplateId;
     
    /**
    * Gets the role Template Id.
    *
    * @return the String
    */
    public String getroleTemplateId() {
        return this.roleTemplateId; 
    }

    /**
    * Sets the role Template Id.
    *
    * @param value the String
    */
    public void setroleTemplateId(String value) { 
        this.roleTemplateId = value; 
    }
    
        
    private java.util.List<DirectoryObject> members = null;
    
    
     
    /**
    * Gets the members.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getmembers() {
        return this.members; 
    }

    /**
    * Sets the members.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setmembers(java.util.List<DirectoryObject> value) { 
        this.members = value; 
    }
    
        
    private java.util.List<DirectoryObject> memberOf = null;
    
    
     
    /**
    * Gets the member Of.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getmemberOf() {
        return this.memberOf; 
    }

    /**
    * Sets the member Of.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setmemberOf(java.util.List<DirectoryObject> value) { 
        this.memberOf = value; 
    }
    
        
    private java.util.List<DirectoryObject> owners = null;
    
    
     
    /**
    * Gets the owners.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getowners() {
        return this.owners; 
    }

    /**
    * Sets the owners.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setowners(java.util.List<DirectoryObject> value) { 
        this.owners = value; 
    }
    
        
    private java.util.List<DirectoryObject> ownedObjects = null;
    
    
     
    /**
    * Gets the owned Objects.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getownedObjects() {
        return this.ownedObjects; 
    }

    /**
    * Sets the owned Objects.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setownedObjects(java.util.List<DirectoryObject> value) { 
        this.ownedObjects = value; 
    }
}

