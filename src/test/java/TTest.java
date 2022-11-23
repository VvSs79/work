import org.junit.jupiter.api.Assertions;

class TTest {

    @org.junit.jupiter.api.Test
    void chet() {
        Assertions.assertTrue(T.chet(4));
    }

    @org.junit.jupiter.api.Test
    void chet2() {
        Assertions.assertFalse(T.chet(5));
    }
}