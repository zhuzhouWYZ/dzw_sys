package com.accp.dao.xn;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Employee;

public interface LoadEmpDao {

	/**
	 * µÇÂ¼
	 * @param emplogenid
	 * @param emplogepaw
	 * @return
	 */
	Employee loginIn(@Param("emplogenid")String emplogenid,@Param("emplogepaw")String emplogepaw);
}
