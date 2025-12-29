package com.qq.objectstyledesignexamle.ch1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FooTest {


    // 당연한 소리를
    @Test
    void 생성자에서_오류가_나면_뭐라고_뜰까_null이겠지() {

        Foo foo = null;
        try {
            assertThat(foo).isNull();
            foo = new Foo();

        } catch (Exception e) {
            assertThat(foo).isNull();
        }

    }
}