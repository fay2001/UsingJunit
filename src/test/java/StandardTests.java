import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// Standard structure of a test
// No test classes nor methods need to be public

class StandardTests {
    //Executed once for all before beginning tests execution
    @BeforeAll
    static void initAll() {
        System.out.println("BeforeAll is called");
    }

    // Executed before each test execution
    @BeforeEach
    void init() {
        System.out.println("BeforeEach is called");
    }

    @Test
    void succeedingTest() {
        System.out.println("succeedingTest is called");
    }

    // how to make a test failing
    @Test
    void failingTest() {
        System.out.println("failingTest is called");
        fail("a failing test");
    }

    // How to disable a test without removing its code
    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        System.out.println("skippedTest is called");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach is called");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll is called");
    }
}