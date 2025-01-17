package com.example.userservicetest;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class UserTest {

    private User user;
    private static final String TEST_ID = "123";
    private static final String TEST_NAME = "John Doe";
    private static final String TEST_STATUS = "Active";

    @BeforeEach
    void setUp() {
        // Initialize a user object before each test
        user = new User(TEST_ID, TEST_NAME, TEST_STATUS);
    }

    @Test
    void testDefaultConstructor() {
        // Test the default constructor
        User emptyUser = new User();
        assertNotNull(emptyUser);
        assertNull(emptyUser.getId());
        assertNull(emptyUser.getName());
        assertNull(emptyUser.getStatus());
    }

    @Test
    void testParameterizedConstructor() {
        // Test the parameterized constructor
        assertNotNull(user);
        assertEquals(TEST_ID, user.getId());
        assertEquals(TEST_NAME, user.getName());
        assertEquals(TEST_STATUS, user.getStatus());
    }

    @Test
    void testSetAndGetId() {
        // Test id setter and getter
        String newId = "456";
        user.setId(newId);
        assertEquals(newId, user.getId());
    }

    @Test
    void testSetAndGetName() {
        // Test name setter and getter
        String newName = "Jane Doe";
        user.setName(newName);
        assertEquals(newName, user.getName());
    }

    @Test
    void testSetAndGetStatus() {
        // Test status setter and getter
        String newStatus = "Inactive";
        user.setStatus(newStatus);
        assertEquals(newStatus, user.getStatus());
    }

    @Test
    void testSetNullValues() {
        // Test setting null values
        user.setId(null);
        user.setName(null);
        user.setStatus(null);

        assertNull(user.getId());
        assertNull(user.getName());
        assertNull(user.getStatus());
    }

    @Test
    void testEmptyStringValues() {
        // Test setting empty string values
        user.setId("");
        user.setName("");
        user.setStatus("");

        assertEquals("", user.getId());
        assertEquals("", user.getName());
        assertEquals("", user.getStatus());
    }
}
