package replitTasks;

public class Task136AccessModifiers {
    /*
    Please create methods with different access modifiers (one for each access modifier)
    and call them properly in main method one by one
    In each method write the logic accordingly like for private method write the logic in the println Statement as
    "This is Private Method" accordingly for rest of the methods that have different access modifiers should be a
    total of 4 outputs, please make sure they are in the same order that is printed below.
     */
    private void privateMethod(){
        System.out.println("This is Private Method");
    }
    public void publicMethod(){
        System.out.println("This is Public Method");
    }
    protected void protectedMethod(){
        System.out.println("This is Protected Method");
    }
    void defaultMethod(){
        System.out.println("This is Default Method");
    }

    public static void main(String[] args) {
        Task136AccessModifiers answer=new Task136AccessModifiers();
        answer.privateMethod();
        answer.defaultMethod();
        answer.protectedMethod();
        answer.publicMethod();
    }
}
