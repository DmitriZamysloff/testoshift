package com.dzcs.lab.testoshift;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test/{name}")
public class Service {

    @PathParam("name")
    private String name;

    @Inject
    private ServiceBean bean;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return bean.giveMe(name);
    }
}
