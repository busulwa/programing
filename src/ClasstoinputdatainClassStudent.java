public class ClasstoinputdatainClassStudent {


    public static void main(String[] args) {


        ClassStudent student1 = new ClassStudent();
        student1.setFirstname("baker");
        student1.setLastname("busulwa");


        ClassStudent student2 = new ClassStudent();
        student2.setFirstname("jay");
        student2.setLastname("jay");


        System.out.println(student1.getFirstname() +
                " " + student1.getLastname());

    System.out.println((student2.getFirstname()+" "+ student2.getID()));

    }
}
