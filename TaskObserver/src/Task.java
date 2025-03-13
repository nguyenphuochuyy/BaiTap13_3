import java.util.ArrayList;
import java.util.List;

public class Task {
    private String taskName;
    private String taskDescription;
    private List<Member> members;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(Task task , String newTask) {
        task.taskName = newTask;
        notifyMember();
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Task(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.members = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void notifyMember( ) {
        for (Member m : members) {
            m.update(taskName);
        }
    }
}
