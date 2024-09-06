package org.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import static org.junit.Assert.assertEquals;

public class UserResourseTest extends JerseyTest{
    @Override
    protected Application configure() {
        return new ResourceConfig(UserResourse.class);
    }
    @Test
    public void testGetUser() {
        User expectedUser = new User("1", "John", 30);
        UserResourse.users.put(expectedUser.getId(), expectedUser);

        User actualUser = target("/users/1").request(MediaType.APPLICATION_JSON).get(User.class);
        assertEquals(expectedUser, actualUser);
    }
}
