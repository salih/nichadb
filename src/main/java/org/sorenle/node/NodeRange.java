package org.sorenle.node;


/**
 * NodeRange stores values between LONG.MIN_VALUE and LONG.MAX_VALUE. In a clustered environment every node has
 * a token range that assigned to it. Apart from the replication scenarios node only stores and responsible from
 * the data in its range.
 * In order to make hash lookups efficient Node class must store its range in an inclusive format.
 */
public class NodeRange {

    private Long minimumRange;
    private Long maximumRange;

    public NodeRange(Long minimumRange, Long maximumRange) {
        this.minimumRange = minimumRange;
        this.maximumRange = maximumRange;
    }

    public NodeRange() {
    }

    public Long getMinimumRange() {
        return minimumRange;
    }

    public void setMinimumRange(Long minimumRange) {
        this.minimumRange = minimumRange;
    }

    public Long getMaximumRange() {
        return maximumRange;
    }

    public void setMaximumRange(Long maximumRange) {
        this.maximumRange = maximumRange;
    }
}
