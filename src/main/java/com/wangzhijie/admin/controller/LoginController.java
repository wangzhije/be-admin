package com.wangzhijie.admin.controller;
import com.wangzhijie.admin.common.Result;
import com.wangzhijie.admin.common.util.JwtUtil;
import com.wangzhijie.admin.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录控制器
 */
@RestController
@RequestMapping("/admin-api")
@RequiredArgsConstructor
public class LoginController {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    /**
     * 用户登录
     * @param user 用户名密码
     * @return token信息
     */
    @PostMapping("/login")
    public Result<Map<String, Object>> login(@RequestBody User user) {

//        // ====================== 【调试代码：开始】 ======================
//        System.out.println("======================================");
//        System.out.println("前端输入的用户名：" + user.getUsername());
//        System.out.println("前端输入的明文密码：" + user.getPassword());
//        // ====================== 【调试代码：结束】 ======================

        // 认证
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
        );

        // 生成token
        String token = jwtUtil.generateToken(authentication.getName());
        Map<String, Object> map = new HashMap<>();
        map.put("token", token);

        return Result.success(map);
    }
}