package com.mrwn.multibank.endpoint;

import com.mrwn.multibank.service.AccountService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1/{bankId}/account")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class AccountEndpoint {

    @Inject
    AccountService accountService;

    @GET
    @Path("/{accountId}")
    public String getAccount(@PathParam("accountId") String accountId) {
        return accountService.getAccount(accountId);
    }
}
