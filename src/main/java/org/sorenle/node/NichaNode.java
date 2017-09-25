package org.sorenle.node;

import java.net.InetAddress;
import java.util.List;

/**
 * Nicha nodes are resillient and masterless. That means there are no node that have a privilige among any other node in cluster.
 * Its resillient nature makes it a highly available. There will be replication according to the configuration file.
 * If a cluster admin has chosen a strong available model then node failures can be tolerated by reading the replicated node.
 */
public class NichaNode {

    private InetAddress ip;
    private int port;
    private NodeStatus status;
    private NodeRange range;
    private List<NodeRange> replicationRange;

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

    public long getMinimumReplicationRange(){
          return replicationRange.stream().mapToLong(NodeRange::getMinimumRange).min().orElse(Long.MIN_VALUE);
    }

    public long getMaximumReplicationRange(){
        return replicationRange.stream().mapToLong(NodeRange::getMaximumRange).max().orElse(Long.MAX_VALUE);
    }




}
