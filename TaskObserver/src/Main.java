public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Làm bài tập kiến trúc phần mềm" , "Làm bài tập 1");
        Member mb1 = new Member(1,"Huy");
        Member mb2 = new Member(2,"Khôi");
        Member mb3 = new Member(3,"Duy");

        task1.addMember(mb1);
        task1.addMember(mb1);
        task1.addMember(mb1);

        task1.setTaskName(task1,"Học Anh Văn");

    }
}