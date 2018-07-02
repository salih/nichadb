package org.sorenle.node;

import org.junit.Test;
import org.sorenle.node.NodeStatus;
import org.sorenle.node.NodeStatusCode;

import static org.junit.Assert.assertTrue;

public class NodeStatusTest {

    @Test
    public void isUpandRunning() {
        NodeStatus nodeStatus = new NodeStatus(NodeStatusCode.UP_AND_JOINED);

        assertTrue(nodeStatus.hasJoined());

    }

    @Test
    public void isDown() {
        NodeStatus nodeStatus = new NodeStatus(NodeStatusCode.DOWN);
        assertTrue(nodeStatus.isDown());
    }

    @Test
    public void isReadyToJoin() {
        NodeStatus nodeStatus = new NodeStatus(NodeStatusCode.UP);
        assertTrue(nodeStatus.isReadyToJoin());
    }

    @Test
    public void joinAndFail() {
        NodeStatus nodeStatus = new NodeStatus(NodeStatusCode.UP);
        assertTrue(nodeStatus.isReadyToJoin());//UP but not joined
        nodeStatus.setJoinStatus(NodeStatusCode.UP_AND_JOINED);
        assertTrue(nodeStatus.hasJoined()); // Joined
        nodeStatus.setJoinStatus(NodeStatusCode.DOWN);// Down
        assertTrue(nodeStatus.isDown());

    }
}
