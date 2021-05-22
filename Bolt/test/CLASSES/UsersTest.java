package CLASSES;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class UsersTest {

    @Test
    public void A_testUsersList() {
        Users instance = new Users();
        ArrayList<Users> result = instance.UsersList();
        assertNotNull(result);

    }

    @Test
    public void B_testAddUser() {

        Users user = new Users(12, "Soma", "Soma", "user", "SomaSoma");
        Users.AddUser(user);
        Users expected = getUsersByName("Soma");
        assertNotNull(expected);

    }

    @Test
    public void C_testModifyUser() {

        Users user = new Users(getUsersByName("Soma").getId(), "Soma2", "Soma2","user", "SomaSoma");
        Users.ModifyUser(user);
        Users expected = getUsersByName("Soma2");
        assertNotNull(expected);

    }

    @Test
    public void D_testDeleteUser() {

        Users user = getUsersByName("Soma2");
        assertNotNull(user);
        Users.deleteUser(user.getId());
        Users expected = getUsersByName("Soma2");
        assertNull(expected);

    }

    private Users getUsersByName(String UNAME){
        Users user = new Users();
        ArrayList<Users> list = user.UsersList();

        for(Users c : list){
            if(c.getUsername().equals(UNAME)){
                return c;
            }
        }
        return null;

    }


}