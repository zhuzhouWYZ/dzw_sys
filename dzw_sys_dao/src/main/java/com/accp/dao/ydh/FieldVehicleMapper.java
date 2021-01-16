package com.accp.dao.ydh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ydh.FieldVehicle;

public interface FieldVehicleMapper {

    int deleteByPrimaryKey(Integer fvid);

    int insert(FieldVehicle record);
/**
 * 新增外勤车辆
 * @param record
 * @return
 */
    int insertSelective(@Param("record")FieldVehicle record);
/**
 * 查询外勤车辆
 * @return
 */
    List<FieldVehicle> selectByPrimaryKey(@Param("fstatusid") Integer fstatusid,@Param("fvname") String fvname);
/**
 * 修改外勤车辆信息
 * @param record
 * @return
 */
    int updateByPrimaryKeySelective(@Param("record")FieldVehicle record);
/**
 * 逻辑删除
 * @param fvid
 * @return
 */
    int updateByPrimaryKey(@Param("fvid")Integer fvid);
}