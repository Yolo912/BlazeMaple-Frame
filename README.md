
# BlazeMaple-Frame
一款轻量级快速开发框架，涵盖平时业务开发的常用场景,用户可根据自身情况选择组件来进行使用。采取组件化开发模式。
比如用户需要redis，则选择redis组件，需要websocket，则引入websocket组件，用户自身不需要再开发什么，只需要按照组件规则进行使用即可。

## 内置项目模块
### BlazeMaple-core
* ape-common-job：分布式任务调度组件
* ape-common-log：日志组件，提供日志切面自动记录及异步日志提升性能
* ape-common-mybatisplus：采用Mybatisplus作为与数据库交互
* ape-common-redis：缓存组件，提供基于redis的操作封装，redis分布式锁，guava的cache工具类
* ape-common-starter：启动类组件，与启动类相关的功能，放到此组件处
* ape-common-swagger：swagger组件
* ape-common-tool：常用的工具类组件
* ape-common-web：web组件，提供统一异常处理，web模块转换，统一返回值
* ape-common-websocket：websocket组件，提供一套带鉴权的websocket
### BlazeMaple-dependencies
该模块为一个父pom模块，提供项目整体的maven包的锁定及规范，统一升级，统一引入。