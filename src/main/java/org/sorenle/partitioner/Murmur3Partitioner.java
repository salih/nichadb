package org.sorenle.partitioner;

import org.sorenle.node.NichaNode;

public class Murmur3Partitioner<T> implements Partitioner<T>{

    @Override
    public NichaNode getPartitionByKey(T key) {
        return null;
    }

    @Override
    public Long getHash() {
        return null;
    }
}
