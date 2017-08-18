package org.sorenle.cluster;

public class EmptyClusterException extends RuntimeException {

    public EmptyClusterException(String message) {
        super(message);
    }
}
