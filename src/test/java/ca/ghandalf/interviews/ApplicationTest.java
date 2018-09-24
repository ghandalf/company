package ca.ghandalf.interviews;

import ca.ghandalf.interviews.util.OsNativeCommand;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { OsNativeCommand.class })
public class ApplicationTest {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationTest.class);

    @Test
    public void contextLoads() {
        LOG.info("Spring beans initialization...");
    }
}
