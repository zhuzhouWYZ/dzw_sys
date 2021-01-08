package com.accp.dao.ydh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ydh.Mechanicteam;

public interface MechanicteamMapper {
	/**
	 * 删除班组
	 * @param tid
	 * @return
	 */
    int deleteByPrimaryKey(@Param("tid")Integer tid);

    int insert(Mechanicteam record);
    /**
     * 新增班组
     * @param record
     * @return
     */
    int insertSelective(@Param("record")Mechanicteam record);
/**
 * 查询所有
 * @param tid
 * @return
 */
    List<Mechanicteam> selectByPrimaryKey(@Param("tname")String tname);
/**
 * 修改班组
 * @param record
 * @return
 */
    int updateByPrimaryKeySelective(@Param("record")Mechanicteam record);

    int updateByPrimaryKey(Mechanicteam record);
}