package com.learning.protect;

public class ClassWithinASamePackage {

    public String sayHello() {
        TestSampleProtected testSampleProtected = new TestSampleProtected();
        testSampleProtected.sayHello();
        return testSampleProtected.sayHello();
    }

}
