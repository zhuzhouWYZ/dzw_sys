package com.accp.action.ydh;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.biz.xn.Ydhbiz;
import com.accp.pojo.ydh.Mechanicteam;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/c/rei")
public class YdhAction {
	@Resource
	private Ydhbiz ydh;
	/**
	 * 查询所有班组
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("queryallmechan")
	public PageInfo<Mechanicteam> queryallmechan(Integer pageNum,Integer pageSize){
		return ydh.querymechanall(pageNum, pageSize);
	}
	
	/**
	 * 删除班组
	 * @param tid
	 * @return
	 */
	@DeleteMapping("deletemechan")
	public int delmechan(Integer tid) {
		return ydh.removemechan(tid);
	}
	/**
	 * 修改班组信息
	 * @param record
	 * @param tid
	 * @return
	 */
	@PutMapping("updatemechan")
	public int updatemechan(Mechanicteam record,int tid) {
		return ydh.modifymechan(record);
	}
	/**
	 * 新增班组信息
	 * @param record
	 * @return
	 */
	@PostMapping("insertmechan")
	public int insertmechan(Mechanicteam record) {
		return ydh.addmechan(record);
	}
}
