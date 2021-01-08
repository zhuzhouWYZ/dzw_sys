package com.accp.dao.ydh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ydh.MechanicStar;

public interface MechanicStarMapper {
	/**
	 * ɾ�������Ǽ�
	 * @param sid
	 * @return
	 */
    int deleteByPrimaryKey(@Param("sid")Integer sid);

    int insert(MechanicStar record);
/**
 * ���������Ǽ�
 * @param record
 * @return
 */
    int insertSelective(@Param("record")MechanicStar record);
/**
 * ��ѯ���м����Ǽ�
 * @param sid
 * @return
 */
    List<MechanicStar> selectByPrimaryKey();
/**
 * �޸ļ����Ǽ���Ϣ
 * @param record
 * @return
 */
    int updateByPrimaryKeySelective(@Param("record") MechanicStar record);

    int updateByPrimaryKey(MechanicStar record);
}