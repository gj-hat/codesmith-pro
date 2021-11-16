package com.autogen.code.web.controller.dto;

import com.autogen.code.Constants;

import java.util.Objects;

/**
 * @author Ryan
 * @email liuwei412552703@163.com
 * @date 2021/11/16 18:21
 */
public class ReqPageParam<T> {

    private int current;

    private int pagesize = Constants.RECORD;

    private T data;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReqPageParam)) {
            return false;
        }
        ReqPageParam<?> that = (ReqPageParam<?>) o;
        return current == that.current &&
                pagesize == that.pagesize &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, pagesize, data);
    }
}
