
class Student{
    String name;
    int marks;
    boolean checkPass()
    {
        if(marks>=40) return true;
        return false;
    }
}
public class ControlFlow {

    int findMax(int a, int b, int c){
        if(a>b)
        {
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name= "Ram";
        s1.marks= 80;
        Student s2 = new Student();
        s2.name = "Sham";
        s2.marks = 30;

        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());

        ControlFlow cf = new ControlFlow();
        System.out.println(cf.findMax(10, 7, 15));

        char c = 'a';

        switch (c) {
            case 'a':
                System.out.println("Hi, I'M A");
                break;
            case 'b':
            System.out.println("Hii, I'M B");
            break;
            case 'c':
            System.out.println("Hii, I'M C");
            break;
        
            default:
                System.out.println("Hii, I'M not A, B or C");
        }
    }
}
