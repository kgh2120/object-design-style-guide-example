package com.qq.objectstyledesignexamle.ch2.p3;

public class FileCacheAfter implements SampleCache {

    private final String directory;


    public FileCacheAfter(Appconfig appconfig) {
        this.directory = appconfig.getDirectory();
    }


    @Override
    public String get(String key) {
        // (중략)
        String directory1 = this.directory;
        // (중략)
        return "";
    }
}
