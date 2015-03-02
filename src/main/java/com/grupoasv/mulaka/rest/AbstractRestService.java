package com.grupoasv.mulaka.rest;

//import com.grupoasv.backend.mule.services.quota.OverQuotaLimitException;
//import com.grupoasv.backend.mule.services.quota.ServiceQuotaChecker;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

public abstract class AbstractRestService {
    protected String _corsHeaders;
//    protected ServiceQuotaChecker checker = null;

    protected Response makeCORS(Response.ResponseBuilder req) {
        ResponseBuilder rb = req
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE, PUT")
                .header("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, Authentication")
                .header("Access-Control-Allow-Credentials", "true");

        return rb.build();
    }

    protected Response ok(String str) {
        ResponseBuilder responseBuilder;

//        try {
//            if (checker != null) {
//                checker.check();
//            }

            responseBuilder = Response.ok(str);
//        } catch (OverQuotaLimitException e) {
//            responseBuilder = Response
//                    .status(403)
//                    .type("application/json")
//                    .entity(e.getMessage());
//        }
//
        return makeCORS(responseBuilder);
    }

    protected Response error(String error) {
        return makeCORS(Response.serverError().entity(error));
    }

    @OPTIONS
    public Response corsMyResource(@HeaderParam("Access-Control-Request-Headers") String requestH) {
        _corsHeaders = requestH;
        return makeCORS(Response.ok("OK"));
    }

//    public void setChecker(ServiceQuotaChecker checker) {
//        this.checker = checker;
//    }
}
