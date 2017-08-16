package org.sorenle.partitioner;

import com.google.common.hash.Hashing;
import org.junit.Test;
import static org.junit.Assert.*;
public class Murmur3BuilderTest {


    @Test
    public void test128BitPartitioner(){
        Murmur3Partitioner murmur3Partitioner = Murmur3Builder.create128BitHasher();
        long hashExpected = Hashing.murmur3_128().newHasher().putInt(0).hash().padToLong();
        long hash = murmur3Partitioner.getHash(0);

        assertEquals(hash,hashExpected);

    }

    @Test
    public void test32BitPartitioner(){
        Murmur3Partitioner murmur3Partitioner = Murmur3Builder.create32BitHasher();
        long hashExpected = Hashing.murmur3_32().newHasher().putInt(0).hash().padToLong();
        long hash = murmur3Partitioner.getHash(0);

        assertEquals(hash,hashExpected);

    }
}
