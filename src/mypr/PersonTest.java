package mypr;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
        System.out.println("开始调试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("调试结束");
    }

    @Test
    void testToString() {
        System.out.println("测试tostring方法");
    }

    @Test
    void getName() {
        System.out.println("测试getname方法");
    }

    @Test
    void setName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }
}