package com.accp.dao.ydh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ydh.Mechanic;

public interface MechanicMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Mechanic record);
/**
 * ��������
 * @param record
 * @return
 */
    int insertSelective(@Param("record")Mechanic record);
/**
 * ��ѯ������Ϣ
 * @return
 */
    List<Mechanic> selectByPrimaryKey(@Param("mname")String mname,@Param("tid")Integer tid);
/**
 * �޸ļ�����Ϣ
 * @param record
 * @return
 */
    int updateByPrimaryKeySelective(@Param("record")Mechanic record);
/**
 * ɾ������
 * @param mid
 * @param mcstatusid
 * @return
 */
    int updateByPrimaryKey(@Param("mid")Integer mid);
}