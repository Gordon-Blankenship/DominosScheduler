abstract class Employee {
    String name;
    char pos;
    int id;
    double hours;
    double maxHours;

    @Override
    public String toString(){
        String msg = "Name : " + this.name + "\n"
                    + "Position : " + this.pos + "\n"
                    + "EmpID : " + this.id + "\n"
                    + "Hours : " + this.hours + "\n";
        return msg;
    }

    public String getName(){ return this.name; }
    public char getPos(){ return this.pos; }
    public double getHours(){ return this.hours; }
    public double getMaxHours(){ return this.hours; }
    public int getID(){ return this.id; }

    public void setName(String name){ this.name = name; }
    public void setPos(char pos){ this.pos = pos; }
    public void setHours(double hours){ this.hours = hours;}


}
