package databases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutorizationTest {
    Database db;
    Autorization aut;
    @BeforeEach
    void setUp() {
        db = new Database();
        aut = new Autorization();
    }

    @Test
    void autorize() {
        assertTrue(aut.autorize(db));
    }
}