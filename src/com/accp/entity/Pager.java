package com.accp.entity;

import java.util.ArrayList;
import java.util.List;

public class Pager<T> {
    private int pagerNo;//页数
    private int pagerSize;//页面行数
    private int totalRows;//总行数
    private int totalPage;//总页数
    private List<T>data=new ArrayList<T>();

    public Pager() {
    }

    public Pager(int pagerNo, int pagerSize, int totalRows, int totalPage, List<T> data) {
        this.pagerNo = pagerNo;
        this.pagerSize = pagerSize;
        this.totalRows = totalRows;
        this.totalPage = totalPage;
        this.data = data;
    }

    public int getPagerNo() {
        return pagerNo;
    }

    public void setPagerNo(int pagerNo) {
        this.pagerNo = pagerNo;
    }

    public int getPagerSize() {
        return pagerSize;
    }

    public void setPagerSize(int pagerSize) {
        this.pagerSize = pagerSize;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
