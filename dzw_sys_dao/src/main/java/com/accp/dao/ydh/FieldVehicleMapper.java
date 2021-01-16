package com.accp.dao.ydh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ydh.FieldVehicle;

public interface FieldVehicleMapper {

    int deleteByPrimaryKey(Integer fvid);

    int insert(FieldVehicle record);
/**
 * �������ڳ���
 * @param record
 * @return
 */
    int insertSelective(@Param("record")FieldVehicle record);
/**
 * ��ѯ���ڳ���
 * @return
 */
    List<FieldVehicle> selectByPrimaryKey(@Param("fstatusid") Integer fstatusid,@Param("fvname") String fvname);
/**
 * �޸����ڳ�����Ϣ
 * @param record
 * @return
 */
    int updateByPrimaryKeySelective(@Param("record")FieldVehicle record);
/**
 * �߼�ɾ��
 * @param fvid
 * @return
 */
    int updateByPrimaryKey(@Param("fvid")Integer fvid);
}