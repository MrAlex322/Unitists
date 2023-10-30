package Lesson_3.Pr_3;

import static org.junit.Assert.*;
import org.junit.Test;

public class UserRepositoryTest {

    @Test
    public void testLogoutNonAdminUsers() {
        UserRepository userRepository = new UserRepository();
        
        User adminUser = new User("admin", "adminPassword", true);
        User regularUser1 = new User("user1", "user1Password", false);
        User regularUser2 = new User("user2", "user2Password", false);

        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        adminUser.isAuthenticate = true;
        regularUser1.isAuthenticate = true;
        regularUser2.isAuthenticate = true;

        userRepository.logoutNonAdminUsers();

        assertTrue(adminUser.isAuthenticate);
        assertFalse(regularUser1.isAuthenticate);
        assertFalse(regularUser2.isAuthenticate);
    }
}

