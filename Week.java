public class Week {

    private Day[] week = new Day[7];
    private Manager[] managers = new Manager[3];
    private Insider[] insiders = new Insider[8];
    private Driver[] drivers = new Driver[10];
    private int counter = 0;

    public Week(Manager[] managers, Insider[] insiders, Driver[] drivers){
        for(int i = 0; i < 7; i++){ this.week[i] = new Day(i); }
        this.managers = managers;
        this.insiders = insiders;
        this.drivers = drivers;
    }

    /*
        Wrapper for recursive generateSchedule() method
        Recursion : Takes an empty schedule, iterates through until
            the schedule is filled within the parameters
        If a parameter is failed, it will schedule the next employee
            instead.
        Finally, it will return a filled schedule given employee
            availability and needed hours.
     */

    public Day generateWrapper(Day[] week){
        counter++;
        return generateSchedule(week[counter]);
    }

    public Day generateSchedule(Day day){
        /*
            Base Case : All shifts are filled
            Psuedocode Algorithm :
                If : Employee has too many hours or can't work
                    schedule the next employee
                If : The schedule doesn't work, set all of those
                    employees to be unable to work those shifts
         */

        //Base Case
        if(day.isFilled()){
            return generateWrapper(this.week);
        }
        else{
            //Fill managers
            for(Shift shift : week[counter].getmShifts()){
                for(Manager manager : this.managers){
                    if(manager.getHours() < manager.getMaxHours() && shift.getEmp() == null){
                        shift.setEmp(manager.getID());
                    }
                }
            }
            //Fill insiders
            for(Shift shift : week[counter].getiShifts()){
                for(Insider insider : this.insiders){
                    if(insider.getHours() < insider.getMaxHours() && shift.getEmp() == null){
                        shift.setEmp(insider.getID());
                    }
                }
            }
            //Fill drivers
            for(Shift shift : week[counter].getdShifts()){
                for(Driver driver : this.drivers){
                    if(driver.getHours() < driver.getMaxHours() && shift.getEmp() == null){
                        shift.setEmp(driver.getID());
                    }
                }
            }
        }

        return generateWrapper(this.week);
    }

    public Day[] getWeek(){ return this.week;}
    public Manager[] getManagers(){return this.managers;}
    public Insider[] getInsiders(){return this.insiders;}
    public Driver[] getDrivers(){return this.drivers;}
}
