package StopWatch;
import java.util.Date;
import java.util.Calendar;

public class StopWatch {
    private Date startTime, endTime;

    public StopWatch() {
    }

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }
    public Date start() {
        return this.startTime = Calendar.getInstance().getTime();
    }

    public Date stop() {
        return this.endTime = Calendar.getInstance().getTime();
    }

    //
    public int getElapsedTime() {
        int m = this.startTime.getSeconds();
        int n = this.endTime.getSeconds();
        return n - m;
    }

}
