package com.devsuperior.dscatalog.resources.exceptions;

public class FieldMessage {

    private String fieldName;
    private String message;

    public FieldMessage() {
    }

    public FieldMessage(String fieldName, String message) {
        this.fieldName   = fieldName;
        this.message = message;
    }

    public String getfieldName() {
        return this.fieldName;
    }

    public void setfieldName(String fieldName){
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }

}
