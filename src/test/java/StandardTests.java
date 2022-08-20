import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.*;

// Standard structure of a test
// No test classes nor methods need to be public
// Usage of @DisplayName for user friendly test name in report

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
    @DisplayName("A simple test that is always valid :-)")
    void succeedingTest() {
        System.out.println("succeedingTest is called");
    }

    // how to make a test failing
    @Test
    @DisplayName("A simple test that always fails :-)")
    void failingTest() {
        System.out.println("failingTest is called");
        fail("a failing test");
    }

    // How to disable a test without removing its code
    @Test
    @DisplayName("A simple test which is omitted by configuration")
    @Disabled("for demonstration purposes") // Disable can also be declared at class level to fully disable all tests from the class
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