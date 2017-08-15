package org.sorenle.partitioner;

import org.sorenle.node.NichaNode;

public interface Partitioner {

    NichaNode getPartitionByKey(int key);

    NichaNode getPartitionByKey(long key);

    NichaNode getPartitionByKey(String key);

    NichaNode getPartitionByKey(double key);

    NichaNode getPartitionByKey(char key);

    NichaNode getPartitionByKey(short key);

    NichaNode getPartitionByKey(byte[] key);

    NichaNode getPartitionByKey(byte key);


    long getHash(int key);

    long getHash(long key);

    long getHash(String key);

    long getHash(double key);

    long getHash(char key);

    long getHash(short key);

    long getHash(byte[] key);

    long getHash(byte key);

}
