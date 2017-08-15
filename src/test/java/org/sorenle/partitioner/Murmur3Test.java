package org.sorenle.partitioner;
import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.nio.charset.Charset;

public class Murmur3Test {
    static Logger logger = LogManager.getLogger(MurmurHash3.class);

    @Test
    public void generateMurmurHash(){
        HashFunction hf = Hashing.murmur3_128();
        for (int i = 0; i < 10; i++) {
            HashCode hc = hf.newHasher().put(i).hash();

            logger.info(hc.padToLong());
        }

    }
}
