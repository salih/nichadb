package org.sorenle.partitioner;

import org.sorenle.node.NichaNode;

public interface PartitionLocator {

    NichaNode getPartitionByHash(long key);

}
