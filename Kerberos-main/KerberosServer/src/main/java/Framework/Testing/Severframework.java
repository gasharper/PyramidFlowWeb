package Framework.Testing;

public class Severframework {
    /*
    两个成员：
    1 线程池
    2 方法集

    n个方法
    0 Main函数
    1 初始化
        -加载配置文件
        -线程池初始化
        -主线程进入监听状态
        -方法集初始化 #！因为在Sever初始化的过程中要发送信息，所以要先准备好通信的东西
    2 写日志的函数
    3 唯一一个入口函数

     */

    /*
    只存在一种任务：收任务

    线程池中的线程有三种：监听线程、工作线程、日志线程

    监听线程：监听端口，如有请求就发布收任务到任务队列

    工作线程：处理任务表中的任务，当队列为空工作进程进
    入休眠状态，当任务队列的长度由0变为非零会唤醒休眠
    状态的工作进程。

    #！日志线程：不断写日志。（日志应该什么时候写？）

    配置：写在一个类中，所有的配置参数都是static类型
    的常量。配置中包含的内容：①线程池的大小以及配置方
    法；②本程序应该绑定AS、TGS、Sever中的哪一个

    初始化：初始化应该包括配置线程池，配置方法集
     */

    /*
    成员包括：线程池、任务队列、方法集
    任务队列：
    方法集：AS、TGS、Sever有一个共同的基类，在初始化
    的时候为方法集创建一个正确的实体。
     */

    /*
    私有方法包括：加载配置、线程池初始化、
    公有方法包括：添加一条发任务
     */


    /*
    技术上目前未知的问题：
    #？Java事件怎么用？
    #？怎么使用事件唤醒休眠的进程？
    #？进程池怎么实现？进程池里面的进程能不能更换当前的任务？
    #？方法集怎么和Communication绑定？
    #？主线程执行什么任务，怎么让主线程执行任务？
     */
}
