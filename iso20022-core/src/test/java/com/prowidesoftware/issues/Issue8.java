package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.MxSeev03100209;
import com.prowidesoftware.swift.model.mx.dic.CorporateActionNotificationType1Code;
import com.prowidesoftware.swift.model.mx.dic.SafekeepingAccountIdentification1Code;
import com.prowidesoftware.swift.utils.Lib;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * https://github.com/prowide/prowide-iso20022/issues/8
 */
public class Issue8 {

    /**
     * Fails because of the namespace in SplmtryData
     */
    @Test
    public void testSplmtryData() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111.txt");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
    }

    private void assertMessage(MxSeev03100209 mx) {
        assertNotNull(mx);
        assertNotNull(mx.getAppHdr());
        assertEquals("XXXXXXXXXXX", mx.getAppHdr().from());
        assertEquals("XXXXXXXXXXX", mx.getAppHdr().to());
        assertEquals("1111111111111111", mx.getAppHdr().reference());
        assertNotNull(mx.getCorpActnNtfctn());
        assertEquals(CorporateActionNotificationType1Code.REPL, mx.getCorpActnNtfctn().getNtfctnGnlInf().getNtfctnTp());
        assertEquals("111111111", mx.getCorpActnNtfctn().getCorpActnGnlInf().getCorpActnEvtId());
        assertEquals(SafekeepingAccountIdentification1Code.GENR, mx.getCorpActnNtfctn().getAcctDtls().getForAllAccts().getIdCd());
    }

    @Test
    public void testNoSplmtryData() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111-SplmtryData_none.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
    }

    @Test
    public void testSplmtryDataCDATA() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111-SplmtryData_CDATA.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
    }

    @Test
    public void testSplmtryDataEmpty() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111-SplmtryData_empty.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
    }

    @Test
    public void testSplmtryDataSimple() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111-SplmtryData_simple.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
    }

}
