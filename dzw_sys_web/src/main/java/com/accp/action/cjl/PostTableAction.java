package com.accp.action.cjl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.accp.pojo.Posttable;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



@RestController
@RequestMapping("/api/posts")
public class PostTableAction {
	@Autowired
	private CjlBiz biz;
	/**
	 * 查询全部岗位
	 * @return
	 */
	@GetMapping("{p}/{s}")
	public PageInfo<Posttable> queryAll(@PathVariable Integer p, @PathVariable Integer s){
		PageHelper.startPage(p, s);
		return biz.queryAllpostt();
	}
	@PostMapping("post")
	public Map<String, Object> addpost(@RequestBody Posttable posttable) {
		
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
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "500");
			message.put("msg", "no");
		}
		
		return message;
	}
	@PutMapping("post")
	public Map<String, Object> updatepost(@RequestBody Posttable posttable) {
		biz.modifypost(posttable);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	@DeleteMapping("post/{postid}")
	public Map<String, Object> deletePersonById(@PathVariable Integer postid) {
		biz.removepost(postid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

}
