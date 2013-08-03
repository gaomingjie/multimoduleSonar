package io.minh.module1;

import org.testng.annotations.Test;

/**
 *
 * @author mnguyen
 */
public class FirstTest {

    @Test(groups = "unit")
    public void test() {
        new First().coveredByUnitTest();
    }
}
