package name.neuhalfen.projects.crypto.bouncycastle.openpgp;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class BouncyGPGTest {

    @Test
    public void decrypt_notNull() throws Exception {
        assertNotNull(BouncyGPG.decryptAndVerifyStream());
    }

    @Test
    public void encryptToStream_notNull() throws Exception {
        assertNotNull(BouncyGPG.encryptToStream());
    }

}