package com.basic.server;

/**
 * This enum encapsulates http status codes and corresponding massages.
 *
 * @author Illia Chalyk
 */
public enum HttpResponseStatus {
    OK(200, "OK"),
    NOT_FOUND(404, "NOT FOUND");

    private int code;
    private String message;

    HttpResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
