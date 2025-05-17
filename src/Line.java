public class Line implements Comparable<Line> {
    private Point start;
    private Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }
    public double getLength(){
        return Math.sqrt(Math.pow((end.getX() - start.getX()),2)+
                Math.pow((end.getY() - start.getY()), 2));
    }

    @Override
    public int compareTo(Line o) {
        return Double.compare(this.getLength(), o.getLength());
    }



}
