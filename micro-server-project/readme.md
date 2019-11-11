## 微服务模板使用说明
- ### 模板改造步骤
1. 修改父工程pom中：groupId、artifactId、name、description
2. 修改各工程报名
3. 修改各工程pom中的：parent.artifactId、parent.groupId、name、description
4. 修改各工程package
5. 修改project-login与platform-blog工程中对应的common依赖pom
6. 修改project-login工程中LoginApplication上@EnableFeignClients的basePackages的值
