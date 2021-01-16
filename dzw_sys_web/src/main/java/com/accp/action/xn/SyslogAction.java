package com.accp.action.xn;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.xn.SyslogBiz;
import com.accp.pojo.Syslog;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/syslogs")
public class SyslogAction {

	@Autowired
	private SyslogBiz syslogBiz;
	
	/**
	 * 查询所有系统日志
	 * @param p
	 * @param s
	 * @return
	 */
	@GetMapping("/{p}/{s}")
	public PageInfo<Syslog> getSyslogPage(@PathVariable Integer p, @PathVariable Integer s){
		return syslogBiz.queryAllSyslog(p, s);
	}
	
	@RequestMapping("/add/{user_id}/{user_action}")
	public Map<String, String> addSyslog(@PathVariable String user_id,@PathVariable String user_action){
		Map<String, String> message = new HashMap<String, String>();
		System.out.println(user_id+user_action);
		addSyslog(user_id, user_action);
		message.put("code", "200");
		return message;
	}
}
