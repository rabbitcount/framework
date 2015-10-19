
official包下内容为zookeeper2.4官方example
网址: http://zookeeper.apache.org/doc/r3.4.6/javaExample.html

常规来说,Zookeeper应用分成两个模块:
- **维护链接**(maintain the Zookeeper connection) -> `Executor`
- **监视数据**(monitor the data in the ZooKeeper tree) -> `DataMonitor`

`Executor`还包含主线程和执行逻辑,包含少量的用户交互

