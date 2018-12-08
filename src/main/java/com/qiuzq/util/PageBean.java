package com.qiuzq.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 分页工具类
 *
 * author 邱海军
 * DATA 2018 - 5 - 11 20:05
 */
public class PageBean {

    /**
     * 页码
     */
    private int page = 1;
    /**
     * 页大小(每页多少条数据)
     */
    private int rows = 10;
    /**
     * 总数
     */
    private int total = 0;

    /**
     * 是否分页
     */
    private boolean pagination = true;

    /**
     * 根目录 + 地址
     */
    private String url;
    private Map<String, String[]> parameterMap;

    public PageBean() {
        super();
    }

    /**
     * 初始化JavaBean
     *
     * @param request
     */
    public void setRequest(HttpServletRequest request) {
        String page = request.getParameter("page");
        String rows = request.getParameter("rows");
        String pagination = request.getParameter("pagination");
        this.setPage(page);
        this.setRows(rows);
        this.setPagination(pagination);

        this.url = request.getContextPath() + request.getServletPath();
        /*
            通过getParameterMap获取表单请求的name与value
         */
        this.parameterMap = request.getParameterMap();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String[]> getParameterMap() {
        return parameterMap;
    }

    public void setParameterMap(Map<String, String[]> parameterMap) {
        this.parameterMap = parameterMap;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPage(String page) {
        if (page != null && !"".equals(page.trim())) {
            this.page = Integer.valueOf(page);
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setRows(String rows) {
        if (null != rows && !"".equals(rows.trim())) {
            this.rows = Integer.valueOf(rows);
        }
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotal(Long total) {
        this.total = total.intValue();
    }

    public void setTotal(String total) {
        this.total = Integer.valueOf(total);
    }

    public boolean isPagination() {
        return pagination;
    }

    public void setPagination(boolean pagination) {
        this.pagination = pagination;
    }

    public void setPagination(String pagination) {
        if (null != pagination && !"".equals(pagination.trim())) {
            this.pagination = Boolean.valueOf(pagination);
        }
    }

    /**
     * 获得起始记录下标
     *
     * @return
     */
    public int getStartIndex() {
        return (this.page - 1) * rows;
    }

    /**
     * 获取最大页码
     *
     * @return
     */
    public int getPageMax() {
        int max = this.total / this.rows;
        if (this.total % this.rows != 0) {
            max++;
        }
        return max;
    }

    /**
     * 上一页
     *
     * @return
     */
    public int getPreviousPage() {
        int previousPage = this.page - 1;
        if (previousPage < 1) {
            previousPage = 1;
        }
        return previousPage;
    }

    /**
     * 下一页
     *
     * @return
     */
    public int getPageNext() {
        int pageNext = this.page + 1;
        if (pageNext > this.getPageMax()) {
            pageNext = this.getPageMax();
        }
        return pageNext;
    }

    public String toString() {
        return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", pagination=" + pagination + "]";
    }

}
