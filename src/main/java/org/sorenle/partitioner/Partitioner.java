package org.sorenle.partitioner;

public interface Partitioner {

    long getHash(int key);

    long getHash(long key);

    long getHash(String key);

    long getHash(double key);

    long getHash(char key);

    long getHash(short key);

    long getHash(byte[] key);

    long getHash(byte key);

}
