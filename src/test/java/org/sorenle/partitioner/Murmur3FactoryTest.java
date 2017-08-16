package org.sorenle.partitioner;

import com.google.common.hash.Hashing;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
public class Murmur3FactoryTest {


    @Test
    public void test128BitPartitioner(){
        Murmur3Partitioner murmur3Partitioner = Murmur3Factory.create128BitHasher();
        long hashExpected = Hashing.murmur3_128().newHasher().putInt(0).hash().padToLong();
        long hash = murmur3Partitioner.getHash(0);

        assertEquals(hash,hashExpected);

    }

    @Test
    public void test32BitPartitioner(){
        Murmur3Partitioner murmur3Partitioner = Murmur3Factory.create32BitHasher();
        long hashExpected = Hashing.murmur3_32().newHasher().putInt(0).hash().padToLong();
        long hash = murmur3Partitioner.getHash(0);

        assertEquals(hash,hashExpected);

    }

    @Test
    public void testSingularity(){
        Murmur3Partitioner p = Murmur3Factory.create32BitHasher();
        Murmur3Partitioner p1 = Murmur3Factory.create32BitHasher();

        assertThat(p, is(not(equalTo(p1))));

        assertFalse(p1.equals(p));


    }
}
