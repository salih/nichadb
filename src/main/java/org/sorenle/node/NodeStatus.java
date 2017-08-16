package org.sorenle.node;


public class NodeStatus {
    //TODO implement
    private NodeStatusCode joinStatus;
    private boolean onSync;

    public NodeStatus(NodeStatusCode joinStatus) {
        this.joinStatus = joinStatus;
    }

    public NodeStatus() {
    }

    public NodeStatusCode getJoinStatus() {
        return joinStatus;
    }

    public void setJoinStatus(NodeStatusCode joinStatus) {
        this.joinStatus = joinStatus;
    }

    public boolean onSync() {
        return onSync;
    }

    public void setOnSync(boolean onSync) {
        this.onSync = onSync;
    }

    public boolean hasJoined() {
        return joinStatus.equals(NodeStatusCode.UP_AND_JOINED);
    }

    public boolean isDown() {
        return joinStatus.equals(NodeStatusCode.DOWN);
    }

    public boolean isReadyToJoin() {
        return joinStatus.equals(NodeStatusCode.UP);
    }
}
