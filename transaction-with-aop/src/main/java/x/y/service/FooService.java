package x.y.service;

import x.y.entity.Foo;

/**
 * the service interface that we want to make transactional
 */
public interface FooService {

    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);

}
