package com.xhustore.domain;

public class PageBean<T> {
    private long pageSize;
    private long currentPage;
    private long totalPages;
    private long totalRows;
    private T data;
    private long startIndex;
    private long start;
    private long end;

    public PageBean(int mPageSize, int mCurrentPage, long mTotalRows) {
        this.pageSize = mPageSize;
        this.currentPage = mCurrentPage;
        this.totalRows = mTotalRows;
        if (totalRows % pageSize == 0) {
            this.totalPages = totalRows / pageSize;
        } else {
            this.totalPages = totalRows / pageSize + 1;
        }
        if (currentPage < 1) {
            currentPage = 1;
        }
        if (currentPage > totalPages) {
            currentPage = totalPages;
        }
        this.startIndex = (currentPage - 1) * pageSize;// 第一页总0开始，第二页从pageSize开始
        this.start = 1;
        this.end = 5;
        if (totalPages < 5) {
            this.end = totalPages;
        } else {
            this.start = currentPage - 2;
            this.end = currentPage + 2;
            if (start < 0) {
                this.start = 1;
                this.end = 5;
            }
            if (end > totalPages) {
                this.start = totalPages - 4;
                this.end = totalPages;
            }
        }
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(long totalRows) {
        this.totalRows = totalRows;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(long startIndex) {
        this.startIndex = startIndex;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

}
