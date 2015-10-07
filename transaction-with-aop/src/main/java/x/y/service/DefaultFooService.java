package x.y.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import x.y.entity.Foo;

public class DefaultFooService implements FooService {

    private static Logger LOGGER = LoggerFactory.getLogger(DefaultFooService.class);

    public Foo getFoo(String fooName) {
        throw new UnsupportedOperationException();
    }

    public Foo getFoo(String fooName, String barName) {
        throw new UnsupportedOperationException();
    }

    public void insertFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

}
