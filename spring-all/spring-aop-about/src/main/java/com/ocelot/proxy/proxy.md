
## 代理中涉及的类

JDK dynamic proxy
java.lang.reflect.InvocationHandler
java.lang.reflect.Method
java.lang.reflect.Proxy
CGLIB proxy
net.sf.cglib.proxy.MethodInterceptor
net.sf.cglib.proxy.Enhancer
net.sf.cglib.proxy.MethodProxy

## JDK dynamic proxy
- 被代理的对象必须实现了一个接口:
因为Proxy.newProxyInstance中需要参数delegate.getClass().getInterfaces()

public class ProxyFactory implements InvocationHandler{

    private Object delegate; // 被代理的对象

    public Object bind(Object delegate){
        this.delegate = delegate;
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceUtil.startPerformance();
        Object result = null;
        try{
            result = method.invoke(delegate, args);
        } catch(Exception e){
        }
        PerformanceUtil.endPerformance();
        return result;
    }
}

## CGLIB proxy
public class CglibProxyFactory implements MethodInterceptor{

    private Object delegate;

    public Object bind(Object delegate){
        this.delegate = delegate;

        Enhancer hancer = new Enhancer();
        // 设置父类
        hancer.setSuperclass(delegate.getClass());
        // 回调
        hancer.setCallback(this);
        return hancer.create();
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        PerformanceUtil.startPerformance();
        Object o = methodProxy.invoke(this.delegate, args);
        PerformanceUtil.endPerformance();
        return o;
    }
}