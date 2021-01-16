package com.accp.dao.ydh;

import com.accp.pojo.ydh.Rbproject;

public interface RbprojectMapper {
    int deleteByPrimaryKey(Integer rbprojectid);

    int insert(Rbproject record);

    int insertSelective(Rbproject record);

    Rbproject selectByPrimaryKey(Integer rbprojectid);

    int updateByPrimaryKeySelective(Rbproject record);

    int updateByPrimaryKey(Rbproject record);
}