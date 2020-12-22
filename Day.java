public class Day {

    private String name;
    private Shift[] mShifts = new Shift[2];
    private Shift[] iShifts = new Shift[8];
    private Shift[] dShifts = new Shift[10];

    public Day(int num){
        switch (num) {
            case 0 -> {
                //Day name
                this.name = "Monday";

                //Manager Shifts
                this.mShifts[0] = new Shift(930, 1630);
                this.mShifts[1] = new Shift(1600, 0);

                //Insider Shifts
                this.iShifts[0] = new Shift(1100, 1600);
                this.iShifts[1] = new Shift(1600, 2100);
                this.iShifts[2] = new Shift(1700, 2200);

                //Driver Shifts
                this.dShifts[0] = new Shift(1000, 1800);
                this.dShifts[1] = new Shift(1500, 2000);
                this.dShifts[2] = new Shift(1600, 2200);
                this.dShifts[3] = new Shift(1700, 2100);
                this.dShifts[4] = new Shift(1700, 0);

            }
            case 1 -> {
                this.name = "Tuesday";

                //Manager Shifts
                this.mShifts[0] = new Shift(930, 1630);
                this.mShifts[1] = new Shift(1600, 0);

                //Insider Shifts
                this.iShifts[0] = new Shift(1100, 1600);
                this.iShifts[1] = new Shift(1600, 2100);
                this.iShifts[2] = new Shift(1700, 2200);

                //Driver Shifts
                this.dShifts[0] = new Shift(1000, 1800);
                this.dShifts[1] = new Shift(1500, 2000);
                this.dShifts[2] = new Shift(1600, 2200);
                this.dShifts[3] = new Shift(1700, 2100);
                this.dShifts[4] = new Shift(1700, 0);
            }
            case 2 -> {
                this.name = "Wednesday";

                //Manager Shifts
                this.mShifts[0] = new Shift(930, 1630);
                this.mShifts[1] = new Shift(1600, 0);

                //Insider Shifts
                this.iShifts[0] = new Shift(1100, 1600);
                this.iShifts[1] = new Shift(1600, 2100);
                this.iShifts[2] = new Shift(1700, 2200);

                //Driver Shifts
                this.dShifts[0] = new Shift(1000, 1800);
                this.dShifts[1] = new Shift(1500, 2000);
                this.dShifts[2] = new Shift(1600, 2200);
                this.dShifts[3] = new Shift(1700, 2100);
                this.dShifts[4] = new Shift(1700, 0);
            }
            case 3 -> {
                this.name = "Thursday";

                //Manager Shifts
                this.mShifts[0] = new Shift(930, 1630);
                this.mShifts[1] = new Shift(1600, 0);

                //Insider Shifts
                this.iShifts[0] = new Shift(1100, 1600);
                this.iShifts[1] = new Shift(1600, 2100);
                this.iShifts[2] = new Shift(1700, 2200);

                //Driver Shifts
                this.dShifts[0] = new Shift(1000, 1800);
                this.dShifts[1] = new Shift(1500, 2000);
                this.dShifts[2] = new Shift(1600, 2200);
                this.dShifts[3] = new Shift(1700, 2100);
                this.dShifts[4] = new Shift(1700, 0);
            }
            case 4 -> {
                this.name = "Friday";

                //Manager Shifts
                this.mShifts[0] = new Shift(930, 1630);
                this.mShifts[1] = new Shift(1600, 0);

                //Insider Shifts
                this.iShifts[0] = new Shift(1100, 1600);
                this.iShifts[1] = new Shift(1600, 2100);
                this.iShifts[2] = new Shift(1700, 2200);

                //Driver Shifts
                this.dShifts[0] = new Shift(1000, 1800);
                this.dShifts[1] = new Shift(1500, 2000);
                this.dShifts[2] = new Shift(1600, 2200);
                this.dShifts[3] = new Shift(1700, 2100);
                this.dShifts[4] = new Shift(1700, 0);
            }
            case 5 -> {
                this.name = "Saturday";

                //Manager Shifts
                this.mShifts[0] = new Shift(930, 1630);
                this.mShifts[1] = new Shift(1600, 0);

                //Insider Shifts
                this.iShifts[0] = new Shift(1100, 1600);
                this.iShifts[1] = new Shift(1600, 2100);
                this.iShifts[2] = new Shift(1700, 2200);

                //Driver Shifts
                this.dShifts[0] = new Shift(1000, 1800);
                this.dShifts[1] = new Shift(1500, 2000);
                this.dShifts[2] = new Shift(1600, 2200);
                this.dShifts[3] = new Shift(1700, 2100);
                this.dShifts[4] = new Shift(1700, 0);
            }
            case 6 -> {
                this.name = "Sunday";

                //Manager Shifts
                this.mShifts[0] = new Shift(930, 1630);
                this.mShifts[1] = new Shift(1600, 0);

                //Insider Shifts
                this.iShifts[0] = new Shift(1100, 1600);
                this.iShifts[1] = new Shift(1600, 2100);
                this.iShifts[2] = new Shift(1700, 2200);

                //Driver Shifts
                this.dShifts[0] = new Shift(1000, 1800);
                this.dShifts[1] = new Shift(1500, 2000);
                this.dShifts[2] = new Shift(1600, 2200);
                this.dShifts[3] = new Shift(1700, 2100);
                this.dShifts[4] = new Shift(1700, 0);
            }
            default -> {
                System.out.println("Day not in range, provide number from 0 to 6.");
            }

        }
    }

    public String getName(){ return this.name; }

    public double shiftLength(double start, double end){
        double shiftLen = (end - start) / 1000;
        return shiftLen;
    }

    public boolean isFilled(){
        boolean dayState = true;

        for(Shift shift : this.mShifts){
            if(shift.getEmp() == null){
                dayState = false;
                break;
            }
        }
        for(Shift shift : this.iShifts){
            if(shift.getEmp() == null){
                dayState = false;
                break;
            }
        }
        for(Shift shift : this.dShifts){
            if(shift.getEmp() == null){
                dayState = false;
                break;
            }
        }

        return dayState;
    }

    public Shift[] getmShifts(){ return this.mShifts;}
    public Shift[] getiShifts(){ return this.iShifts;}
    public Shift[] getdShifts(){ return this.dShifts;}
}