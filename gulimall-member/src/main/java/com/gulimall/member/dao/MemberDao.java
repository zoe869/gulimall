package com.gulimall.member.dao;

import com.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author qizhong
 * @email aitzhongqi@gmail.com
 * @date 2022-10-17 10:51:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
