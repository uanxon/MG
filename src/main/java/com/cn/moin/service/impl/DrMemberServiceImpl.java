package com.cn.moin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.moin.Dao.DrMemberMapper;
import com.cn.moin.pojo.DrMember;
import com.cn.moin.service.DrMemberService;
@Service
public class DrMemberServiceImpl implements DrMemberService {
	@Autowired DrMemberMapper drMemberMapper;
	public DrMember getDrMember() {
		
		return drMemberMapper.selectByPrimaryKey(16);
	}

}
