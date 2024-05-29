package com.feiyun.xxljobdemo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * TODO
 *
 * @author feiyun
 * @date 2024/5/29 11:24
 * @explain
 */
@Getter
@Setter
@ToString

public class UserMobilePlan {

    private Long id;//主键
    private String username;//用户名
    private String nickname;//昵称
    private String phone;//手机号码
    private String info;//备注
}
