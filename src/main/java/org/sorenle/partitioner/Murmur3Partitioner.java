package org.sorenle.partitioner;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import org.sorenle.node.NichaNode;

import java.nio.charset.Charset;

public class Murmur3Partitioner implements Partitioner{
    private HashFunction hashFunction;
    private Hasher hasher;

    //Only create object via builder
    public Murmur3Partitioner(){}

    @Override
    public long getHash(int key) {
        return hasher.putInt(key).hash().padToLong();
    }

    @Override
    public long getHash(long key) {
        return hasher.putLong(key).hash().padToLong();
    }

    @Override
    public long getHash(String key) {
        return hasher.putString(key, Charset.forName("UTF-8")).hash().padToLong();
    }

    @Override
    public long getHash(double key) {
        return hasher.putDouble(key).hash().padToLong();
    }

    @Override
    public long getHash(char key) {
        return hasher.putChar(key).hash().padToLong();
    }

    @Override
    public long getHash(short key) {
        return hasher.putShort(key).hash().padToLong();
    }

    @Override
    public long getHash(byte[] key) {
        return hasher.putBytes(key).hash().padToLong();
    }

    @Override
    public long getHash(byte key) {
        return hasher.putLong(key).hash().padToLong();

    }

    protected HashFunction getHashFunction(){
        return hashFunction;
    }
    protected void setHashFunction(HashFunction hashFunction){
        this.hashFunction = hashFunction;
        hasher = hashFunction.newHasher();
    }
}
