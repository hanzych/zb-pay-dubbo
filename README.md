

:confused: **或许你在网上看过一些资料，了解一些分布式事务的解决办法，然而，一切还只是停留在理论阶段。** 

:confused: **或许你知道可以通过可靠消息、TCC、最大努力通知等方案来解决分布式事务问题，然而，一切还只是停留在理论阶段。** 

:confused: **或许你能说出来可以通过一些开源的技术来实现分布式事务，然而，一切还只是停留在理论阶段。** 


---

#### > 电商下单支付流程图
###### &nbsp;&nbsp;&nbsp;从图中可以清晰看到，分布式服务的环境下，分布式事务问题显得尤为突出。


![电商购物支付流程中的分布式事务问题分析](https://gitee.com/uploads/images/2017/1020/001517_8fac1a97_341760.png "电商购物支付流程中的分布式事务问题分析.png")


#### > 项目业务功能说明
    以【商城下单支付】为核心功能，业务流转过程中会涉及到各系统之间的服务调用，比如：支付通知、商户通知、订单服务、积分服务、会计服务等。
    
    每个服务之间都是独立的进程，具有可独立部署、业务解耦、扩展性强的特点。

    最终，你将会知道如何解决分布式事务的问题。。

#### > 常见的分布式事务解决方案：
>     1. 可靠消息最终一致性（异步确保型）

>     2. 最大努力通知（定期校对）

>     3. TCC（两阶段型、补偿型）

  以上3种分布式事务的解决方案，将会在项目中通过代码完整的展现。


#### > 项目技术选型
    - 项目主要采用Dubbo作为服务治理框架

    - 采用SpringBoot作为微服务开发框架。服务之间可独立部署、业务解耦、扩展性好。

    - 项目整体框架为Spring、SpringMVC、Mybtais、Mysql、Zookeeper、ActiveMQ、Dubbo、JSP、Dwz(富客户端)等。

#### > 项目功能模块划分
###### 通过模拟真实业务场景，最终通过代码来实现和解决分布式事务，故需要对业务进行拆分，不同的服务拥有属于自己的DB库。

##### 项目功能模块以及系统服务架构划分如下：
`01. 在线商城系统`

`02. 支付网关系统`

`03. 银行支付通知(模拟通知回调)`

`04. 订单服务`

`05. 积分服务`

`06. 会计原始凭证记账服务`

`07. 账户服务`

`08. 商户通知服务`

`09. 可靠消息服务`

`10. TCC服务`

`11. 消息状态确认子系统`

`12. 消息恢复子系统`

`13. 消息管理子系统`

`14. BOSS系统`

`15. (后续更新)`

#### > 最新动态
    目前处于开发阶段，还未完成，敬请期待。

#### > 项目部署相关文档(陆续更新)
> 为了更加贴近实际企业项目的部署，特写了一份Jenkins项目自动化构建部署的教程，方便大家学习。

 **_Jenkins项目自动化构建部署教程_** ：[https://gitee.com/zhoubang85/zb-pay-dubbo/attach_files](https://gitee.com/zhoubang85/zb-pay-dubbo/attach_files)

#### > 项目结构图
![项目Maven结构图-IDEA工具下的效果](https://gitee.com/uploads/images/2017/1019/133402_70df580c_341760.jpeg "01.jpg")

#### > 第三方jar说明
##### 1、将项目拉取到本地之后，可能会出现tcc-transaction相关的jar文件找不到的情况，如下图所示：

![tcc-transaction框架](https://gitee.com/uploads/images/2017/1020/123216_c32f8ae9_341760.jpeg "01.jpg")

&nbsp;&nbsp;原因是因为tcc-transaction框架是github上开源的框架，并非maven中央仓库。

&nbsp;&nbsp;tcc-transaction框架地址：[https://github.com/changmingxie/tcc-transaction](https://github.com/changmingxie/tcc-transaction)

&nbsp;&nbsp;我已经打包好了，可以到[https://gitee.com/zhoubang85/zb-pay-dubbo/attach_files](https://gitee.com/zhoubang85/zb-pay-dubbo/attach_files)中下载，导入到本地maven仓库即可。
