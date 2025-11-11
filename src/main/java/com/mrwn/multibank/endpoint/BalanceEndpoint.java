package com.mrwn.multibank.endpoint;

import com.mrwn.multibank.service.BalanceService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1/{bankId}/balance/account")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class BalanceEndpoint {

    @Inject
    BalanceService balanceService;

    @GET
    @Path("/{accountId}")
    public String getBalance(@PathParam("accountId") String accountId) {
        return balanceService.getBalance(accountId);
    }
}
