package com.accp.action.xn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.xn.JurisdictionBiz;
import com.accp.pojo.Jurisdiction;

@RestController
@RequestMapping("api/jurs")
public class JurisdictionAction {

	@Autowired
	private JurisdictionBiz jurisdictionBiz;
	
	@GetMapping
	public  List<Jurisdiction> getAllJurisdictions(){
		return jurisdictionBiz.queryAllJurisdictions();
	}
	
	@RequestMapping("/jur/add")
	public Map<String, String> addJurisdiction(@RequestBody Jurisdiction jurisdiction){
		Map<String, String> message = new HashMap<String, String>();
		if(jurisdictionBiz.addJurisdiction(jurisdiction) > 0) {
			message.put("code", "200");
			message.put("msg", "新增角色成功！");
		}else {
			message.put("code", "500");
			message.put("msg", "新增角色失败！");
		}
		return message;
	}
	
	@RequestMapping("/jur/modify")
	public Map<String, String> modifyJurisdiction(@RequestBody Jurisdiction jurisdiction){
		Map<String, String> message = new HashMap<String, String>();
		if(jurisdictionBiz.modifyJurisdiction(jurisdiction) > 0) {
			message.put("code", "200");
			message.put("msg", "修改角色成功！");
		}else {
			message.put("code", "500");
			message.put("msg", "修改角色失败！");
		}
		return message;
	}
	
	@RequestMapping("/jur/remove/{jurisdictionid}")
	public Map<String, String> removeJurisdiction(@PathVariable String jurisdictionid){
		Map<String, String> message = new HashMap<String, String>();
		if(jurisdictionBiz.removeJurisdiction(jurisdictionid) > 0) {
			message.put("code", "200");
			message.put("msg", "删除角色成功！");
		}else {
			message.put("code", "500");
			message.put("msg", "删除角色失败！");
		}
		return message;
	}
	
}
