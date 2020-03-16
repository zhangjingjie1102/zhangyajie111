package com.zhangjingjie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zhangjingjie.domain.Channel;
import com.zhangjingjie.service.ChannelService;

@Controller
public class ChannelController {
	//哈哈哈哈哈哈
	//啊实打实大苏打
	///啊实打实大苏打
	
	@Autowired
	private ChannelService service;
	
	
	@RequestMapping("select")
	public String select(Channel channel,Model m,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "5")Integer pageSize) {
		
		PageInfo<Channel> info = service.selects(channel,pageNum,pageSize);
		m.addAttribute("info", info);
		return null;
	}
}
