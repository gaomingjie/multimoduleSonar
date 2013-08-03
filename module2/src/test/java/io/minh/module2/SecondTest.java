package io.minh.module2;

import org.testng.annotations.Test;

/**
 *
 * @author mnguyen
 */
public class SecondTest {

    @Test(groups = "unit")
    public void test() {
        new Second().coveredByUnitTest();
    }
}
