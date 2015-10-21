package com.ocelot.zookeeper.curator.framework;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class FrameWork {

    private final String zookeeperConnectionString = "bja.anocelot.cn:2181,tsa.anocelot.cn:2181,usa.anocelot.cn:2181";

    public void init(String zookeeperConnectionString){
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient(zookeeperConnectionString, retryPolicy);
        client.start();
    }
}
