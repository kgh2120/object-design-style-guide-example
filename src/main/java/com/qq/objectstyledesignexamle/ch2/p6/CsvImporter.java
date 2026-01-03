package com.qq.objectstyledesignexamle.ch2.p6;

public class CsvImporter {

    private final EventDispatcher eventDispatcher;

    // EventDispather가 필요 없다면 Dummy를, 필요하다면 다른 것을 주입받는다.
    public CsvImporter(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }
}
