package com.accp.action.ydh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ydh.Ydhbiz;
import com.accp.pojo.ydh.FieldStatus;
import com.accp.pojo.ydh.FieldVehicle;
import com.accp.pojo.ydh.Mechanic;
import com.accp.pojo.ydh.MechanicStar;
import com.accp.pojo.ydh.MechanicStatus;
import com.accp.pojo.ydh.Mechanicteam;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/c/rei")
@CrossOrigin
public class YdhAction {
	@Resource
	private Ydhbiz biz;
	/**
	 * 查询所有班组
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("queryallmechan/{pageNum}/{pageSize}/{tname}")
	public PageInfo<Mechanicteam> queryallmechan(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable String tname){
		if(tname.equals("null")) {
			tname=null;
		}
		return biz.querymechanall(pageNum, pageSize,tname);
	}
	
	/**
	 * 删除班组
	 * @param tid
	 * @return
	 */
	@DeleteMapping("deletemechan/{tid}")
	public  Map<String, String> delmechan(@PathVariable Integer tid) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.removemechan(tid);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	/**
	 * 修改班组信息
	 * @param record
	 * @param tid
	 * @return
	 */
	@PutMapping("updatemechan")
	public  Map<String, String> updatemechan(@RequestBody Mechanicteam record) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.modifymechan(record);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	/**
	 * 新增班组信息
	 * @param record
	 * @return
	 */
	@PostMapping("insertmechan")
	public Map<String, String> insertmechan(@RequestBody Mechanicteam record) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.addmechan(record);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	
	/**
	 * 查询所有星级
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("queryallmestar/{pageNum}/{pageSize}")
	public PageInfo<MechanicStar> queryallmestar(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return biz.querymestarall(pageNum, pageSize);
	}
	
	/**
	 * 删除技工星级
	 * @param tid
	 * @return
	 */
	@DeleteMapping("deletemestar/{sid}")
	public Map<String, String> delmestar(@PathVariable Integer sid) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.removemestar(sid);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	/**
	 * 修改技工星级信息
	 * @param record
	 * @param tid
	 * @return
	 */
	@PutMapping("updatemestar")
	public Map<String, String> updatemechan(@RequestBody MechanicStar record) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.modifymestar(record);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	/**
	 * 新增星级信息
	 * @param record
	 * @return
	 */
	@PostMapping("insertmestar")
	public Map<String, String> insertmestar(@RequestBody MechanicStar record) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.addmestar(record);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	
	
	
	
	/**
	 * 查询所有外勤车辆
	 */
	@GetMapping("queryallfcar/{pageNum}/{pageSize}/{fstatusid}/{fvname}")
	public PageInfo<FieldVehicle> queryallmestar(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable Integer fstatusid,@PathVariable String fvname){
		if(fvname.equals("null")) {
			fvname=null;
		}
		if(fstatusid==0) {
			fstatusid=0;
		}
		return biz.queryfcarall(pageNum, pageSize, fstatusid, fvname);
	}
	/**
	 * 删除外勤车辆
	 * @param fvid
	 * @return
	 */
	@PutMapping("deletefcar/{fvid}")
	public Map<String, String> delfacar(@PathVariable Integer fvid) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.modifyfcar(fvid);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	/**
	 * 修改外勤车辆信息
	 * @param record
	 * @param tid
	 * @return
	 */
	@PutMapping("updatefcar")
	public Map<String, String> updatefcar(@RequestBody FieldVehicle record) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.modifyfcar(record);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	
	/**
	 * 新增外勤车辆
	 * @param record
	 * @return
	 */
	@PostMapping("insertfcar")
	public Map<String, String> insertfcar(@RequestBody FieldVehicle record) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.addfcar(record);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	
	
	
	/**
	 * 查询所有技工基本信息
	 */
	@GetMapping("queryallchaic/{pageNum}/{pageSize}/{mname}/{tid}")
	public PageInfo<Mechanic> queryallchaic(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable String mname,@PathVariable Integer tid){
		if(mname.equals("null")) {
			mname=null;
		}
		if(tid==0) {
			tid=0;
		}
		return biz.querychaic(pageNum, pageSize, mname,tid);
	}
	/**
	 * 技工离职
	 * @param fvid
	 * @return
	 */
	@PutMapping("deletechaic/{mid}")
	public Map<String, String> delchaic(@PathVariable Integer mid) {
		
		Map<String, String> message = new HashMap<String, String>();
		biz.modifychaic(mid);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	/**
	 * 修改技工信息
	 * @param record
	 * @param tid
	 * @return
	 */
	@PutMapping("updatechaic")
	public Map<String, String> updatechaic(@RequestBody Mechanic record) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.modifychaic(record);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	
	/**
	 * 新增技工
	 * @param record
	 * @return
	 */
	@PostMapping("insertchaic")
	public  Map<String, String> insertchaic(@RequestBody Mechanic record) {
		Map<String, String> message = new HashMap<String, String>();
		 biz.addchaic(record);
		message.put("code", "200");
		   message.put("msg", "ok");
		   return message;
	}
	/**
	 * 查询车辆状态
	 * @return
	 */
	@GetMapping("queryfsta")
	public List<FieldStatus> queryallsta(){
		return biz.queryall();
				
	}
	/**
	 * 查询技工状态
	 * @return
	 */
	@GetMapping("querymeuicsta")
	public List<MechanicStatus> querymeicsta(){
		return biz.queryictsta();
	}
	
}
