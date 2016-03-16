public class Customer {
    private String name;
    private String addr;
    private Date birth;
    public int type;
    
    public Customer(String name, String addr, int month, int day, int year, int type) {
        this.name = name;
        this.addr = addr;
        Date birth = new Date(day, month, year);
        this.type = type;
    }
    
}