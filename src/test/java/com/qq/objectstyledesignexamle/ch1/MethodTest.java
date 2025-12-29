package com.qq.objectstyledesignexamle.ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class MethodTest {


    @Test
    void 다른_인스턴스의_private_메서드를_호출할_수_있다니(){

        Method me = new Method();
        Method other = new Method();

        assertThatThrownBy(() -> me.printPrivateMethod(other));
    }


}