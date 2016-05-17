package lesson.lesson_07.range;

/**
 * Created by admin on 17.05.2016.
 */
public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if (from < to) {
            this.from = from;
            this.to = to;
        } else {
            this.from = to;
            this.to = from;
        }
    }

    public double calcLength(){
        return to - from;
    }

    public boolean isInside(double point){
        return point >= from && point <= to;
    }

}
