# 无名小店后端

### 开发环境
jdk1.8 spring-boot2.2.4

### 使用技术及功能

使用fastjson框架，json解析速度快并且易于维护

使用Lombok对实体类的代码进行压缩

使用MultipartResolver实现文件（头像）上传功能

整合mybatis、阿里巴巴Druid连接池连接数据库，以mapper接口代替原始dao类

使用spring-security实现登录及权限验证，登录信息基于数据库认证。登录密码使用10位BCrypt加密存储，并分配不同用户的访问权限
(原先想整合oauth2+redis实现登录令牌功能，但尚未解决前端无法收到token的问题。正在学习解决)