package replitTasks;

public class Task113JavaMethods {
    /*
    Step1: Create a method that will accept with 2 parameters of integer type
    Step2: Write the logic in that method in println statement to print hours and minutes
    Step3: Call the method
     */
    void parameters(int hours, int minutes){
        System.out.println(hours+":"+minutes);
    }

    public static void main(String[] args) {
        Task113JavaMethods num=new Task113JavaMethods();
        num.parameters(11,30);
    }
}
