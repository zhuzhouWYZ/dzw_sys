package com.accp.dao.ydh;

import java.util.List;

import com.accp.pojo.ydh.MechanicStatus;

public interface MechanicStatusMapper {
    int deleteByPrimaryKey(Integer mcstatusid);

    int insert(MechanicStatus record);

    int insertSelective(MechanicStatus record);
/**
 * ²éÑ¯¼¼¹¤×´Ì¬
 * @return
 */
   List< MechanicStatus> selectByPrimaryKey();

    int updateByPrimaryKeySelective(MechanicStatus record);

    int updateByPrimaryKey(MechanicStatus record);
}