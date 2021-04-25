public class Circus {

    private String name;
    private String address;
    private float ticketPrice;
    private String nameOfPerformance;
    private int ageLimit;
    private int duration;
    private String contactNumber;
    private String circusStatus;

    private static int performanceCounter = 0;

    protected int amountOfSeats;
    protected int performancePerYear;

    public Circus(){
    }

    public Circus(String name,String address,String contactNumber,String circusStatus){
        setValues(name,address,0,"",0,0,contactNumber,circusStatus,
                0,0);
        performanceCounter += 1;
    }

    public Circus(String name,String address,float ticketPrice,String nameOfPerformance,int ageLimit,
                  int duration, String contactNumber,String circusStatus,
                  int amountOfSeats,int performancePerYear){
        setValues(name,address,ticketPrice,nameOfPerformance,ageLimit,duration,contactNumber,circusStatus,
                amountOfSeats,performancePerYear);
        performanceCounter += 1;
    }

    //setters||getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getNameOfPerformance() {
        return nameOfPerformance;
    }

    public void setNameOfPerformance(String nameOfPerformance) {
        this.nameOfPerformance = nameOfPerformance;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCircusStatus() {
        return circusStatus;
    }

    public void setCircusStatus(String circusStatus) {
        this.circusStatus = circusStatus;
    }

    //methods

    public void setValues(String name,String address,float ticketPrice,String nameOfPerformance,int ageLimit,
                          int duration, String contactNumber,String circusStatus,
                          int amountOfSeats,int performancePerYear) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.circusStatus = circusStatus;
        this.ticketPrice = ticketPrice;
        this.nameOfPerformance = nameOfPerformance;
        this.ageLimit = ageLimit;
        this.duration = duration;
        this.amountOfSeats = amountOfSeats;
        this.performancePerYear = performancePerYear;
    }

    public void resetValues(String name,String address,float ticketPrice,String nameOfPerformance,int ageLimit,
                            int duration, String contactNumber,String circusStatus,
                            int amountOfSeats,int performancePerYear){
        setValues(name,address,ticketPrice,nameOfPerformance,ageLimit,duration,contactNumber,circusStatus,
                amountOfSeats,performancePerYear);
    }

    public static void printStaticPerformanceCounter(){
        System.out.println(performanceCounter);
    }

    public void printPerformanceCounter(){
        System.out.println(performanceCounter);
    }

    @Override
    public String toString(){
        return  "=================================================================================" + "\n" +
                "Circus Name: " + name + "\n" +
                "Performance Name: " + nameOfPerformance + "\n" +
                "Performance duration: " + duration + " min." + "\n"+
                "Ticket price: " + ticketPrice + "$" + "\n" +
                "Age limitation: " + ageLimit + "+" + "\n" +
                "Contacts: " + address + ", " + "+38 " + contactNumber + "\n" +
                "Status: |Now is " + circusStatus + "|\n" +
                "=================================================================================" + "\n" +
                "Circus info:\n" + "Seats around the arena: " + amountOfSeats + "\n" +
                "Performance per year:" + performancePerYear;
    }

    public static void main(String... args){
        Circus circus = new Circus();
        Circus circus1 = new Circus("Shapito","13 Avenue","093 333 93 32",
                "Open");
        Circus circus2 = new Circus("Lvivskiy","Horodotska 34", 239,"Lion",
                3,130,"073-213-32-12","Open",450,13);

        System.out.println(circus2.toString());
        circus.resetValues("Kharkivskii","str. Address 34", 199, "Luxury",
                6, 120, "069-312-32-21", "Close", 340,
                19);
        System.out.println(circus.toString());

        circus1.printPerformanceCounter();
    }

}
