package com.zhangjingjie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangjingjie.dao.ChannelMapper;
import com.zhangjingjie.domain.Channel;
import com.zhangjingjie.service.ChannelService;
@Service
public class ChannelServiceImpl implements ChannelService {
	
	@Autowired
	private ChannelMapper mapper;

	@Override
	public PageInfo<Channel> selects(Channel channel, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Channel> selects = mapper.selects(channel);
		return new PageInfo<Channel>(selects);
		
		
	}


}
