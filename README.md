# oauth2-adventure
OAuth2+JWT+SpringCloud+Nacos
- 项目构成
1. auth-common:公共模块
2. auth-server:认证服务器
3. resource-server:资源服务器
- 项目前期准备
1. 下载nacos：https://github.com/alibaba/nacos/releases
```aidl
git clone https://github.com/alibaba/nacos.git
cd nacos/
mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U  
ls -al distribution/target/
// change the $version to your actual path
cd distribution/target/nacos-server-$version/nacos/bin
```
2. 本地启动nacos（示例采用单机模式）：startup.cmd -m standalone
- 项目中遇到的问题：
1. 服务没法注册到nacos？
```aidl
分析：版本匹配问题。
spring-boot版本为【2.2.8.RELEASE】
spring-cloud版本为【Hoxton.SR4】
spring-cloud-starter-alibaba-nacos-discovery版本为【2020.0.RC1】
解决办法：采用推荐版本依赖关系，参考文档【https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E】。
spring-boot版本为【Spring Cloud 2020.0.1】
spring-cloud版本为【Hoxton.SR4】
spring-cloud-starter-alibaba-nacos-discovery版本为【2020.0.RC1】
nacos-server版本为【1.4.1】
```
