package com.zhangjingjie.service;


import com.github.pagehelper.PageInfo;
import com.zhangjingjie.domain.Channel;

public interface ChannelService {
	PageInfo<Channel> selects(Channel channel, Integer pageNum, Integer pageSize);
}	
