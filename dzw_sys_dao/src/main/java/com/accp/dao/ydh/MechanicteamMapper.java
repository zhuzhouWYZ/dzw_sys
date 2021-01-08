package com.accp.dao.ydh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ydh.Mechanicteam;

public interface MechanicteamMapper {
	/**
	 * ɾ������
	 * @param tid
	 * @return
	 */
    int deleteByPrimaryKey(@Param("tid")Integer tid);

    int insert(Mechanicteam record);
    /**
     * ��������
     * @param record
     * @return
     */
    int insertSelective(@Param("record")Mechanicteam record);
/**
 * ��ѯ����
 * @param tid
 * @return
 */
    List<Mechanicteam> selectByPrimaryKey(@Param("tname")String tname);
/**
 * �޸İ���
 * @param record
 * @return
 */
    int updateByPrimaryKeySelective(@Param("record")Mechanicteam record);

    int updateByPrimaryKey(Mechanicteam record);
}