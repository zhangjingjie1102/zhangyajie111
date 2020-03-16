package com.zhangjingjie.dao;

import java.util.List;

import com.zhangjingjie.domain.Category;
import com.zhangjingjie.domain.Channel;

public interface ChannelMapper {
	
	List<Channel> selects(Channel channel);
	
	Category findById(Integer id);
}
