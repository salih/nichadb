package org.sorenle.partitioner;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import org.sorenle.node.NichaNode;

public class Murmur3Partitioner implements Partitioner{
    private HashFunction hashFunction;
    private Hasher hasher;

    //Only create object via builder
    private Murmur3Partitioner(){
        hasher = hashFunction.newHasher();}


    @Override
    public NichaNode getPartitionByKey(int key) {
        return null;
    }

    @Override
    public NichaNode getPartitionByKey(long key) {
        return null;
    }

    @Override
    public NichaNode getPartitionByKey(String key) {
        return null;
    }

    @Override
    public NichaNode getPartitionByKey(double key) {
        return null;
    }

    @Override
    public NichaNode getPartitionByKey(char key) {
        return null;
    }

    @Override
    public NichaNode getPartitionByKey(short key) {
        return null;
    }

    @Override
    public NichaNode getPartitionByKey(byte[] key) {
        return null;
    }

    @Override
    public NichaNode getPartitionByKey(byte key) {
        return null;
    }

    @Override
    public long getHash(int key) {
        return 0;
    }

    @Override
    public long getHash(long key) {
        return 0;
    }

    @Override
    public long getHash(String key) {
        return 0;
    }

    @Override
    public long getHash(double key) {
        return 0;
    }

    @Override
    public long getHash(char key) {
        return 0;
    }

    @Override
    public long getHash(short key) {
        return 0;
    }

    @Override
    public long getHash(byte[] key) {
        return 0;
    }

    @Override
    public long getHash(byte key) {
        return 0;
    }
}
