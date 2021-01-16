package com.accp.dao.cjl;

import java.util.List;

import com.accp.pojo.Jurisdiction;
import com.accp.pojo.Posttable;

public interface PosttableMapper {
    int deleteByPrimaryKey(Integer postid);

    int insert(Posttable record);

    int insertSelective(Posttable record);

    List<Posttable> selectByPrimaryKey();

    int updateByPrimaryKeySelective(Posttable record);

    int updateByPrimaryKey(Posttable record);
    List<Posttable> queryAll();
    List<Jurisdiction> queryAlljuese();
}