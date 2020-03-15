#### SpringBoot整合Sharding-jdbc实现分库分表解决方案的案例

##### 项目结构:
```
 ├─src                             src源码目录
 ├─sharding-jdbc.sql               初始的建表sql语句
 ├─.gitignore                      .gitignore文件
 ├─README.md                       README.md文件
 └─pom.xml                         pom文件
```

##### 如何运行:

1. 准备两个不同的数据源: 
    如:
    
    jdbc:mysql://localhost:3306/db_myshop_0
    
    jdbc:mysql://localhost:33060/db_myshop_1

2. 分别在两个库中运行sharding-jdbc.sql建表文件

3. 修改application.yml的数据库连接配置

4. 运行测试类中的方法