#### SpringBoot整合Sharding-jdbc实现分库分表解决方案的案例

1. 准备两个不同的数据源: 
    如:
    
    jdbc:mysql://localhost:3306/myshop_0db_myshop_0
    
    jdbc:mysql://localhost:33060/myshop_0db_myshop_1

2. 分别在两个库中运行sharding  -jdbc.sql建表文件