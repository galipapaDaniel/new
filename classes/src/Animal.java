public class Animal {
   String name;
   int age;
   String nickname;
   String sound;
   String color;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                ", sound='" + sound + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Animal(String name, int age, String nickname, String sound, String color){
        this.name=name;
        this.age=age;
        this.nickname=nickname;
        this.sound=sound;
        this.color=color;


    }
}
