package com.accp.action.cjl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cjl.CjlBiz;
import com.accp.biz.xn.SyslogBiz;
import com.accp.pojo.Employee;
import com.accp.pojo.Jurisdiction;
import com.accp.pojo.Posttable;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/posts")
public class PostTableAction {
	@Autowired
	private CjlBiz biz;
	
	@Autowired
	private SyslogBiz syslogBiz;
	/**
	 * 查询全部岗位
	 * @return
	 */
	@GetMapping
	public List<Posttable> queryAllaa(){
		
		return biz.queryAllaa();
	}
	/**
	 * 分页查询全部岗位
	 * @return
	 */
	@GetMapping("{p}/{s}")
	public PageInfo<Posttable> queryAllFind(@PathVariable Integer p, @PathVariable Integer s){
		PageHelper.startPage(p, s);
		return biz.queryAllpostt();
	}
	@PostMapping("post")
	public Map<String, Object> addpost(@RequestBody Posttable posttable,HttpSession session) {
		
		Map<String, Object> message = new HashMap<String, Object>();
		PageInfo<Posttable> data=biz.queryAllpostt();
		boolean chongfu=false;
		for (int i = 0; i < data.getList().size(); i++) {
			if (posttable.getPostname().equals(data.getList().get(i).getPostname())) {
				chongfu=true;
			}
		}
		if (chongfu==false) {
			biz.addpost(posttable);
			syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "新增岗位");
			message.put("code", "200");
			message.put("msg", "ok");
			
		}else {
			message.put("code", "500");
			message.put("msg", "no");
		}
		
		return message;
	}
	@PutMapping("post")
	public Map<String, Object> updatepost(@RequestBody Posttable posttable,HttpSession session) {
		biz.modifypost(posttable);
		syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "修改岗位");
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	@DeleteMapping("post/{postid}")
	public Map<String, Object> deletePersonById(@PathVariable Integer postid,HttpSession session) {
		biz.removepost(postid);
		syslogBiz.addSyslog(((Employee) session.getAttribute("EMP")).getEmplogenid(), "删除岗位");
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	@GetMapping("juese")
	public List<Jurisdiction> queryAlljuese(){
		return biz.queryAllJuese();
	}
}
