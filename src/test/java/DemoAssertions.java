import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DemoAssertions
{
    @Test
    void standardAssertions(){
        assertEquals(2,2);
        assertEquals(4,4,"This assertion message will never be displayed");
        assertEquals(4,5,"This assertion message will always be displayed");
    }
}

