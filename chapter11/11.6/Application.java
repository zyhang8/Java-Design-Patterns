public class Application{
    public static void main(String args[]){
        UseSet useSet=new UseSet();
        useSet.addStudent(new Student("001","����",76.89));
        useSet.addStudent(new Student("002","����",88.89));
        useSet.addStudent(new Student("003","����",58.12));
        useSet.addStudent(new Student("004","����",66.55));
        useSet.addStudent(new Student("005","����",92.57));
        String n="003";
        System.out.println("����ѧ��Ϊ"+n+"��ѧ��:");
        useSet.lookStudent(n);
        System.out.println("��ѧ�����ɼ�����:");
        useSet.printStudentsByScore();
    }
}