package com.qq.objectstyledesignexamle.ch1;

public class Method {

    public void printPrivateMethod(Method other){
        other.pvMethod();
    }

    private void pvMethod(){
        throw new IllegalArgumentException("당장 나가");
    }
}
