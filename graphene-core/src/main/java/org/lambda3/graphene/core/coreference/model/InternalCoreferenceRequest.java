package org.lambda3.graphene.core.coreference.model;

/*-
 * ==========================License-Start=============================
 * InternalCoreferenceRequest.java - Graphene Core - Lambda^3 - 2017
 * Graphene
 * %%
 * Copyright (C) 2017 Lambda^3
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * ==========================License-End===============================
 */


import java.util.Collections;
import java.util.List;

public class InternalCoreferenceRequest {
    private String text;
    private String uri;
    private List<Link> links;

    public InternalCoreferenceRequest(String text) {
        this(text, "");
    }

    public InternalCoreferenceRequest(String text, String uri) {
        this(text, uri, Collections.emptyList());
    }

    public InternalCoreferenceRequest(String text, String uri, List<Link> links) {
        this.text = text;
        this.uri = uri;
        this.links = links;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
