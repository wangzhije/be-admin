现在是 Vibe Coding 的时代，想自己搭建项目变得越来越方便。

## 项目技术栈（企业主流选型）
| 技术 | 版本 / 说明 |
| --- | --- |
| >开发框架 | >Spring Boot 3.2.5 |
| >权限框架 | >Spring Security 6 |
| >ORM 框架 | >MyBatis-Plus 3.5.8 |
| >数据库 | >MySQL 8.0 |
| >工具库 | >Hutool、Lombok |
| >接口规范 | >RESTful 企业级标准 |
| >构建工具 | >Maven 3.6+ |


## 项目结构（标准企业级分层）

```
admin-start/
├── src/main/java/com/admin/
│   ├── AdminStartApplication.java        # 启动类
│   ├── config/                           # 配置类（核心注释区）
│   │   ├── SecurityConfig.java           # 权限安全配置
│   │   ├── MyBatisPlusConfig.java        # MyBatis-Plus配置
│   │   └── CorsConfig.java                # 跨域配置
│   ├── controller/                       # 控制器（接口层）
│   │   ├── LoginController.java
│   │   ├── UserController.java
│   │   ├── RoleController.java
│   │   └── MenuController.java
│   ├── entity/                           # 实体类
│   │   ├── User.java
│   │   ├── Role.java
│   │   ├── Menu.java
│   │   └── UserRole.java
│   ├── mapper/                           # 数据访问层
│   ├── service/                          # 业务逻辑层
│   │   ├── impl/                          # 实现类
│   └── common/                           # 公共模块
│       ├── Result.java                   # 统一返回结果
│       ├── exception/                    # 全局异常
│       └── util/                         # 工具类
├── src/main/resources/
│   ├── application.yml                    # 核心配置文件
│   └── mapper/                           # MyBatis XML文件
└── pom.xml                                # 依赖配置
```

## 项目核心功能清单
1. RBAC 完整权限：用户 ↔ 角色 ↔ 菜单 三级权限模型
2. 登录认证：JWT 无状态认证、密码加密、安全校验
3. 用户管理：增删改查、状态控制、分配角色
4. 角色管理：增删改查、权限分配
5. 菜单管理：树形菜单、权限标识、接口权限控制
6. 企业接口规范：统一返回值、RESTful 风格、全局异常
7. 基础配置：跨域、MyBatis-Plus、Security、日志
