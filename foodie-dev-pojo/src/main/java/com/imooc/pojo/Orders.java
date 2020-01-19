package com.imooc.pojo;

import javax.persistence.Column;
import java.util.Date;

public class Orders {
    @Column(name = "order_num")
    private Integer orderNum;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "cust_id")
    private Integer custId;

    /**
     * @return order_num
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * @param orderNum
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * @return order_date
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return cust_id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * @param custId
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }
}