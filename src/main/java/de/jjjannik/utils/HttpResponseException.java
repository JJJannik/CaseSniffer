package de.jjjannik.utils;

import lombok.Getter;

@Getter
public class HttpResponseException extends RuntimeException {

    private final int statusCode;
    private final String reasonPhrase;

    public HttpResponseException(final int statusCode, final String reasonPhrase) {
        super("Status code: %d, Reason phrase: %s".formatted(statusCode, reasonPhrase ==  null ? "null" : reasonPhrase));
        this.statusCode = statusCode;
        this.reasonPhrase = reasonPhrase;
    }
}