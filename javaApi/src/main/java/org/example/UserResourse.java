package org.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/users")
public class UserResourse {
    private static Map<String, User> users = new HashMap<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("id")String id) {
        return users.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUser(User user) {
        users.put(user.getId(), user);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUser(@PathParam("id") String id, User user) {
        if (users.containsKey(id)) {
            users.put(id, user);
            return Response.status(Response.Status.OK).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
    @DELETE
    @Path("/{id}")
    public Response deleteUser(@PathParam("id") String id) {
        if (users.containsKey(id)) {
            users.remove(id);
            return Response.status(Response.Status.OK).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
