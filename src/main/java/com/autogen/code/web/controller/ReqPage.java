package com.autogen.code.web.controller;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/12 17:47
 */
public class ReqPage<T> {

    private int indexPage;

    private int pageSize;

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getIndexPage() {
        return indexPage;
    }

    public void setIndexPage(int indexPage) {
        this.indexPage = indexPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
