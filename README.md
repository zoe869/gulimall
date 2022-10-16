# gulimall

## 第一天

### 1 安装varant

### 2 安装centos7

### 3 安装docker

#### 1 mysql容器

- 1 拉取mysql镜像
- 2 运行并挂载数据卷
- docker run -p 3306:3306 --name mysql  -v /data/mysql/log:/var/log/mysql  -v /data/mysql/data:/var/lib/mysql  -v /data/mysql/conf:/etc/mysql  -e MYSQL_ROOT_PASSWORD=root  -d mysql:5.7
- 3 mysql 配置修改

### 4 安装 redis（redis 默认开启持久化rdb）

- 1 创建redis的主机挂载目录和配置文件
  mkdir -p /data/redis/conf
  touch /data/redis/conf/redis.conf
  （不能在docker命令创建，会将redis.conf视作工作目录）

- 2 运行redis容器
  docker run -p 6379:6379 --name redis \
  -v /data/redis/data:/data \
  -v /data/redis/conf/redis.conf:/etc/redis/redis.conf \
  -d redis redis-server /etc/redis/redis.conf

### 5 开发环境统一
### 6 创建项目微服务
商品服务
仓储服务
订单服务
用户服务
优惠券服务

共同： web, openfeign
包名： com.gulimall.XXX(package name)
模块名：gulimall-xxx
组织名：com.gulimall.

- 1 github初始化一个项目
- 2 创建各个微服务

