package com.accp.dao.ydh;

import java.util.List;

import com.accp.pojo.ydh.FieldStatus;

public interface FieldStatusMapper {
    int deleteByPrimaryKey(Integer fstatusid);

    int insert(FieldStatus record);

    int insertSelective(FieldStatus record);
/**
 * ��ѯ����״̬
 * @return
 */
    List<FieldStatus> selectByPrimaryKey();

    int updateByPrimaryKeySelective(FieldStatus record);

    int updateByPrimaryKey(FieldStatus record);
}