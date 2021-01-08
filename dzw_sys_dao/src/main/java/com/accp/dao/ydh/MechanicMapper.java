package com.accp.dao.ydh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ydh.Mechanic;

public interface MechanicMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Mechanic record);
/**
 * 新增技工
 * @param record
 * @return
 */
    int insertSelective(@Param("record")Mechanic record);
/**
 * 查询技工信息
 * @return
 */
    List<Mechanic> selectByPrimaryKey(@Param("mname")String mname,@Param("tid")Integer tid);
/**
 * 修改技工信息
 * @param record
 * @return
 */
    int updateByPrimaryKeySelective(@Param("record")Mechanic record);
/**
 * 删除技工
 * @param mid
 * @param mcstatusid
 * @return
 */
    int updateByPrimaryKey(@Param("mid")Integer mid);
}