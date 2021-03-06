package OOP;

import java.io.PrintStream;

public class OOP {
    public static void main(String[] args) {
        s s = new s();
        s.setName("Абу");
        s.setAge(16);
        ((PrintStream) null).println("Main: Меня зовут " + s.getName() + ", и мне " + s.getAge());
    }
}
class cat{

    // зачем нужны статичекие классы
}

    class s {
        private String name;
        private int age;

        s() {
        }

        public void setName(String name) {
            if (name.equals("")) {
                ((PrintStream) null).println("Введите данные в поле для имя");
            } else {
                this.name = name;
            }
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0) {
                ((PrintStream) null).println("Введите данные в поле для возраста");
            }
        }
    }


