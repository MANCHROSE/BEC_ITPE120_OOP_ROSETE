class Clerk extends Job {
    private String department;

    
    public Clerk(String title, double salary, String department) {
        super(title, salary); 
        this.department = department;
    }

    
    @Override
    public void displayJobInfo() {
        super.displayJobInfo();
        System.out.println("Department: " + department);
    }
}
