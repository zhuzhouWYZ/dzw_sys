package com.accp.action.xn;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.xn.QxconnectBiz;
import com.accp.biz.xn.SyslogBiz;
import com.accp.pojo.Employee;

@RestController
@RequestMapping("api/qx")
public class QxconnectAction {

	@Autowired
	private QxconnectBiz qxconnectBiz;
	
	@Autowired
	private SyslogBiz syslogBiz;
	
	@RequestMapping("/updateQx/{jid}")
	public Map<String, String> uddateQx(@RequestBody String[] fids,@PathVariable String jid,HttpSession session){
		Map<String, String> message = new HashMap<String, String>();
		qxconnectBiz.addQxByList(fids, jid);
		syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "修改角色权限");
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
