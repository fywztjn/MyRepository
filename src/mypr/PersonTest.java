package mypr;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
        System.out.println("��ʼ����");
    }

    @AfterEach
    void tearDown() {
        System.out.println("���Խ���");
    }

    @Test
    void testToString() {
        System.out.println("����tostring����");
    }

    @Test
    void getName() {
        System.out.println("����getname����");
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