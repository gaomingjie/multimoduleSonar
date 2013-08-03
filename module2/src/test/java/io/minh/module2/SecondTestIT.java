package io.minh.module2;

import org.testng.annotations.Test;

/**
 *
 * @author mnguyen
 */
public class SecondTestIT {

    @Test(groups = "int")
    public void test() {
        new Second().coveredByIntegrationTest();
    }
}
