package com.autogen.code.web.service;

import com.autogen.code.web.controller.dto.RequestParameterDto;
import com.autogen.code.web.domain.vo.ManageLibraryUnionQueryVO;
import org.springframework.http.ResponseEntity;

import java.sql.SQLException;
import java.util.List;

public interface MainService {

    Boolean downZip(RequestParameterDto requestParameterDto);
    boolean handleZip(String artifactId, String packageName);

    Boolean analysisAndWrite(RequestParameterDto requestParameterDto, List<ManageLibraryUnionQueryVO> manageLibraryUnionQueryVOS) throws SQLException, ClassNotFoundException;


    ResponseEntity<Object> downloadZip(RequestParameterDto requestParameterDto);

}
