/**
 * Maven:一个项目管理工具，将项目开发和管理过程抽象成一个项目对象模型（POM）
 *      作用：
 *      ①项目构建：提供标准的，跨平台的自动化项目构建方式
 *      ②依赖管理：方便快捷的管理项目依赖的资源（jar包），避免资源间的版本冲突问题
 *      ③统一开发结构：提供标准的、统一的项目结构
 *
 * 仓库：用于存储资源，包含各种jar包
 *      ①本地仓库：自己电脑上存储资源的仓库，连接远程仓库获取资源
 *      ②远程仓库：非本机电脑上的仓库，为本地仓库提供资源
 *          ①中央仓库：Maven团队维护，存储着所有资源的仓库
 *          ②私服：部门/公司范围内存储资源的仓库，从中央仓库中获取资源
 *
 * 坐标：Maven中的坐标用于描述仓库中资源的位置
        Maven坐标的组成：
            ①groupId:定义当前Maven项目隶属组织名称（通常是域名反写，例如：org.mybatis）
            ②artifactId:定义当前Maven项目名称（通常是模块名称，例如CRM,SMS）
            ③version:定义当前项目版本号

 *  Maven项目构建命令：
        ①mvn compile 编译 将编译完成的文件放入target文件夹
        ②mvn clean 清理 将编译后的文件删除
        ③mvn test 测试 生成测试编译文件和测试报告
        ④mvn package 打包 将源程序打包
        ⑤mvn install 安装到本地仓库 将打包文件放至groupId所指定的目录下，artifactId又决定一层目录，version又决定一层目录

    利用原型创建项目：
        ①使用原型创建java项目(模板搜索quickstart)
        ②利用原型创建web项目(模板搜索webapp)
 */
package com.hao;

public class Demo {
    public String say(String name){
        System.out.println("hello " + name);
        return "hello " + name;
    }
}
