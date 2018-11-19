public class Data {
              private String name;
              private int age;
              public Data(String n,int a) {
                           // TODO Auto-generated constructor stub
                           name =n;
                           age = a;
              }
              public void setAge(int age) {
                           this.age = age;
              }
              public void setName(String name) {
                           this.name = name;
              }
              public int getAge() {
                           return age;
              }
              public String getName() {
                           return name;
              }
              public void Print() {
                           System.out.print(("("+getName()));
                           System.out.print(",");
                           System.out.print(getAge());
                           System.out.print(") ");
 
              }
}