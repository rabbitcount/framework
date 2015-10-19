package com.ocelot.zookeeper.play;

/**
 * User: zhenghui
 * Date: 14-3-26
 * Time: 下午8:37
 * 分布式锁实现.
 *
 * 这种实现的原理是,创建某一个任务的节点,比如 /lock/tasckname 然后获取对应的值,如果是当前的Ip,那么获得锁,如果不是,则没获得
 * .如果该节点不存在,则创建该节点,并把改节点的值设置成当前的IP
 */
public class DistributedLock01 {

    private ZKClient zkClient;


    public static final String LOCK_ROOT = "/lock";
    private String lockName;


    public DistributedLock01(String connectString, int sessionTimeout,String lockName) throws Exception {
        //先创建zk链接.
        this.createConnection(connectString,sessionTimeout);

        this.lockName = lockName;
    }

    public boolean tryLock(){
        String path = ZKUtil.contact(LOCK_ROOT,lockName);
        String localIp = NetworkUtil.getNetworkAddress();
        try {
            if(zkClient.exists(path)){
                String ownnerIp = zkClient.getData(path);
                if(localIp.equals(ownnerIp)){
                    return true;
                }
            } else {
                zkClient.createPathIfAbsent(path,false);
                if(zkClient.exists(path)){
                    String ownnerIp = zkClient.getData(path);
                    if(localIp.equals(ownnerIp)){
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    /**
     * 创建zk连接
     *
     */
    protected void createConnection(String connectString, int sessionTimeout) throws Exception {
        if(zkClient != null){
            releaseConnection();
        }
        zkClient = new ZKClient(connectString,sessionTimeout);
        zkClient.createPathIfAbsent(LOCK_ROOT,true);
    }
    /**
     * 关闭ZK连接
     */
    protected void releaseConnection() throws InterruptedException {
        if (zkClient != null) {
            zkClient.close();
        }
    }

}
