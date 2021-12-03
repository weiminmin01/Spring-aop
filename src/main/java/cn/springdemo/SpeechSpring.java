package cn.springdemo;

public class SpeechSpring {

    private  String Name;
    private  String Speech;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSpeech() {
        return Speech;
    }

    public void setSpeech(String speech) {
        Speech = speech;
    }

    public SpeechSpring() {
    }

    /*public SpeechSpring(String name, String speech) {
        Name = name;
        Speech = speech;
    }*/

    public  void  print(){
        System.out.println(Name+"说："+Speech);

    }


}
