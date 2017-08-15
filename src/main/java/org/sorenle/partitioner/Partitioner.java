package org.sorenle.partitioner;

import org.sorenle.node.NichaNode;

public interface Partitioner<T> {

    NichaNode getPartitionByKey(T key);

    Long getHash();
}
