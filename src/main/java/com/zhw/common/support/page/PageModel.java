package com.zhw.common.support.page;

import java.util.List;

/**
 * Created by zhanghw on 2015/8/19.
 */
public class PageModel<E> {

    //�����
    private List<E> dataList;

    //��ѯ��¼��
    private int totalRecords;

    //ÿҳ����ҳ����
    private int pageSize;

    //�ڼ�ҳ
    private int pageNo;

    /**
     * ��ҳ��
     * @return
     */
    public int getTotalPages(){
        return (totalRecords + pageSize -1) / pageSize;
    }

    /**
     * ��ȡ��ҳ
     * @return
     */
    public int getTopPage(){
        return 1;
    }


    /**
     * ��һҳ
     * @return
     */
    public int getPreviousPageNo(){
        if(pageNo <= 1){
            return 1;
        }
        return pageNo -1;
    }

    /**
     * ��һҳ
     * @return
     */
    public int getNextPageNo() {
        if (pageNo >= getBottomPageNo()) {
            return getBottomPageNo();
        }
        return pageNo + 1;
    }

    /**
     * ȡ��βҳ
     * @return
     */
    public int getBottomPageNo() {
        return getTotalPages();
    }


    public List<E> getDataList() {
        return dataList;
    }

    public void setDataList(List<E> dataList) {
        this.dataList = dataList;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
}
