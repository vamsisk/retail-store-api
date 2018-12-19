/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.retail.api;

import com.retail.api.respository.StudentRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/")
public class Endpoint {

    Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private StudentRepository repository;

    private final Service service;

    public Endpoint(Service service) {
        this.service = service;
    }

    @GET
    @Path("/hello")
    public String message() {
        logger.info("All users -> {}" + repository.findAll());
        return "Hello " + this.service.message() + " Data records" + repository.findAll();
    }

    @GET
    @Path("/version")
    public String version() {
        return "Hello! Version number is 1.5";
    }
}
