package com.qq.objectstyledesignexamle.ch2.p6;


/*
    eventDispatcher를 선택적으로 허용. null을 받거나 이후 변경이 가능

    - 불변성 X
    - 불완전 상태로 생성 (null 필드 존재)
 */
public class CsvImporterBefore {

    private EventDispatcher eventDispatcher;

    public CsvImporterBefore(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }

    public void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }


}
