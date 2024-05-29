package com.feiyun.xxljobdemo.mapper;

import com.feiyun.xxljobdemo.entities.UserMobilePlan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * TODO
 *
 * @author feiyun
 * @date 2024/5/29 11:25
 * @explain
 */
public interface UserMobilePlanMapper {

    @Select("select * from t_user_mobile_plan where mod(id,#{shardingTotal})=#{shardingIndex}")
    List<UserMobilePlan> selectByMod(@Param("shardingIndex") Integer shardingIndex,@Param("shardingTotal")Integer shardingTotal);



    @Select("select * from t_user_mobile_plan")
    List<UserMobilePlan> selectAll();
}
