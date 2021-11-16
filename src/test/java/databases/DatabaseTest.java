package databases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database db;
    @BeforeEach
    void setUp() {
        db = new Database();
    }

    @Test
    void getUserData() {
        assertTrue(db.getUserData().equals("hello"));
    }

    @Test
    void getStaticData() {
        assertTrue(db.getStaticData().equals("hello2"));
    }
}