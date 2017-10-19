package com.cn.moin.Dao;

import com.cn.moin.pojo.DrMember;

public interface DrMemberMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(DrMember record);

    int insertSelective(DrMember record);

    DrMember selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(DrMember record);

    int updateByPrimaryKey(DrMember record);
}