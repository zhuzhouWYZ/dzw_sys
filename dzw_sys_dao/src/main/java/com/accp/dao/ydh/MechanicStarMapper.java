package com.accp.dao.ydh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ydh.MechanicStar;

public interface MechanicStarMapper {
	/**
	 * 删除技工星级
	 * @param sid
	 * @return
	 */
    int deleteByPrimaryKey(@Param("sid")Integer sid);

    int insert(MechanicStar record);
/**
 * 新增技工星级
 * @param record
 * @return
 */
    int insertSelective(@Param("record")MechanicStar record);
/**
 * 查询所有技工星级
 * @param sid
 * @return
 */
    List<MechanicStar> selectByPrimaryKey();
/**
 * 修改技工星级信息
 * @param record
 * @return
 */
    int updateByPrimaryKeySelective(@Param("record") MechanicStar record);

    int updateByPrimaryKey(MechanicStar record);
}