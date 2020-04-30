package homework_4.task_2;

public class ExecutionQueue {
    private static String msg;

    static {
        msg = "static block";
    }

    {
        msg = "regular block";
    } // абзац
    public ExecutionQueue() {
        msg = "constructor value";
    }// абзац
    public String getMsg() {
        return msg;
    }
}
