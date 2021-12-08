package com.autogen.code.web.service;

import com.autogen.code.web.controller.dto.RequestParameterDto;

public interface MainService {

    Boolean downZip(RequestParameterDto requestParameterDto);
    boolean handleZip(String artifactId, String packageName);
}
