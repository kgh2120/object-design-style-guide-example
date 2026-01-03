package com.qq.objectstyledesignexamle.ch2.p6;

public class EventDispatcherImpl implements EventDispatcher {
    @Override
    public void dispatch(String event) {
        System.out.println("Dispatch Event : " + event);
    }
}
