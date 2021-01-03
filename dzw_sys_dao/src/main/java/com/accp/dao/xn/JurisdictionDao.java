package com.accp.dao.xn;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Jurisdiction;

public interface JurisdictionDao {

	List<Jurisdiction> queryAlljJurisdictions();
	
	Integer addJurisdiction(@Param("jurisdiction") Jurisdiction jurisdiction);
	
	
}
