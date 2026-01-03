package com.qq.objectstyledesignexamle.ch2.p3;

public class FileCacheBefore implements SampleCache {

    private final Appconfig appconfig;

    public FileCacheBefore(Appconfig appconfig) {
        this.appconfig = appconfig;
    }


    @Override
    public String get(String key) {
        // (중략)
        String directory = appconfig.getDirectory();
        // (중략)
        return "";
    }
}
