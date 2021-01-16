package com.accp.dao.ydh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ydh.RepairBill;

public interface RepairBillMapper {
    int deleteByPrimaryKey(Integer repairbillid);

    int insert(RepairBill record);

    int insertSelective(RepairBill record);
/**
 * 查询已经完工的维修单
 * @param servicestatusid
 * @return
 */
    List<RepairBill> selectByPrimaryKey(@Param("servicestatusid") Integer servicestatusid);

    int updateByPrimaryKeySelective(RepairBill record);

    int updateByPrimaryKey(RepairBill record);
}