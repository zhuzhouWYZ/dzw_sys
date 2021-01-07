package com.accp.action.xn;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.xn.LoadEmpBiz;
import com.accp.pojo.Employee;

@RestController
@RequestMapping("api/loadEmp")
public class LoadEmpAction {

	@Autowired
	private LoadEmpBiz loadEmpBiz;
	
	@GetMapping("/login/{emplogenid}/{emplogepaw}")
	public Map<String, Object> loginIn(HttpSession session,@PathVariable String emplogenid,@PathVariable String emplogepaw){
		Map<String, Object> message = new HashMap<String, Object>();
		Employee emp = loadEmpBiz.loginIn(emplogenid, emplogepaw);
		if (emp!=null) {
			session.setAttribute("EMP", emp);
			message.put("EMP", emp);
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "403");
			message.put("msg", "no");
		}
		
		return message;
	}
	
	@GetMapping("/getLoginEMP")
	public Employee getEMP(HttpSession session) {
		return (Employee) (session.getAttribute("EMP"));
	}
	
	@GetMapping("/loginOut")
	public Map<String, String> loginOut(HttpSession session){
		session.removeAttribute("EMP");
		Map<String, String> message = new HashMap<String, String>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
