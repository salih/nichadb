package org.sorenle.node;

import java.net.InetAddress;

public class NichaNode {

    private InetAddress ip;
    private int port;
    private NodeStatus status;
    private NodeRange range;

    public InetAddress getIp() {
        return ip;
    }

    public void setIp(InetAddress ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public NodeStatus getStatus() {
        return status;
    }

    public void setStatus(NodeStatus status) {
        this.status = status;
    }

    public Long getMinimumRange() {
        return range.getMinimumRange();
    }

    public Long getMaximumRange() {
        return range.getMaximumRange();
    }


}
