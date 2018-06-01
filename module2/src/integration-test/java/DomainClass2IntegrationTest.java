import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class DomainClass2IntegrationTest {
    @Test
    @Category( MyIntegrationTest.class)
    public void testUnitIntegrationTestTwo() {
        DomainClass2 domainClass2 = new DomainClass2();
        assertEquals( 15131, domainClass2.convert2( 123));
    }
}
