package com.accp.dao.cjl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Employee;
import com.accp.vo.EmpAndBumenAndZhiwei;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String employeeno);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String employeeno);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
    
    List<EmpAndBumenAndZhiwei> EmpVo(@Param("empname")String empname);
    
    
}