public class Shift {

    private double start;
    private double end;
    private Integer emp;

    public Shift(double start, double end){
        this.start = start;
        this.end = end;
        this.emp = null;
    }

    public void setEmp(int emp){
        this.emp = emp;
    }
    public void setStart(double start){
        this.start = start;
    }
    public void setEnd(double end){
        this.end = end;
    }

    public Integer getEmp(){
        return this.emp;
    }
    public double getStart(){
        return this.start;
    }
    public double getEnd(){
        return this.end;
    }
}
