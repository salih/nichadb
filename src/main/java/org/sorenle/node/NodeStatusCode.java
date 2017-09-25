package org.sorenle.node;

public enum NodeStatusCode {

    UP_AND_JOINED("UP_AND_JOINED"),
    UP("UP"),
    DOWN("DOWN");

    private String status;

    NodeStatusCode(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
