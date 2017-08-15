package org.sorenle.partitioner;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class Murmur3Builder {

    public Murmur3Builder() {
    }

    public static Murmur3Partitioner create128BitHasher(){
        Murmur3Partitioner murmur3Partitioner = new Murmur3Partitioner();
        murmur3Partitioner.setHashFunction(Hashing.murmur3_128());
        return murmur3Partitioner;
    }
    public static Murmur3Partitioner create32BitHasher(){
        Murmur3Partitioner murmur3Partitioner = new Murmur3Partitioner();
        murmur3Partitioner.setHashFunction(Hashing.murmur3_32());
        return murmur3Partitioner;
    }

}
