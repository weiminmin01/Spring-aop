package cn.springdemo.test;

import cn.springdemo.SpeechSpring;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
    @Test
    public  void  tsxt01(){
        ClassPathXmlApplicationContext context01= new ClassPathXmlApplicationContext("context.xml");
        SpeechSpring speech  = (SpeechSpring) context01.getBean("speech");
        SpeechSpring   speech1 = (SpeechSpring) context01.getBean("speech1");
        speech.print();
        speech1.print();

    }
}
