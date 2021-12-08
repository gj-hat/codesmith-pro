package com.testcase.utils;

import com.autogen.code.Constants;
import com.autogen.code.utils.FileUtils;
import org.junit.Test;

/**
 * @author ：JiaGuo
 * @date ：Created in 2021/12/7 15:56
 * @description：zip的测试
 * @modified By：
 * @version: 1.0
 */
public class ZipUtilsTest {








    @Test
    public void test1() throws Exception {

        FileUtils.decompressionToZip(Constants.DOWN_PATH, Constants.DECOMPRESSION);



    }







}
