package com.example.demo.vo.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: HomeRespVO
 * TODO:类文件简单描述
 * @Author: 小霍
 * @UpdateUser: 小霍
 * @Version: 0.0.1
 */
@Data
public class HomeRespVO {
    @ApiModelProperty(value = "用户信息")
    private UserInfoRespVO userInfoVO;

    @ApiModelProperty(value = "首页菜单导航数据") //组装侧边栏元素内含：UserInfoRespVO与list<PermissionRespNodeVO>
    private List<PermissionRespNodeVO> menus;
}
