class Job {
    private String title;
    private double salary;

    
    public Job(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    
    public void displayJobInfo() {
        System.out.println("Job Title: " + title);
        System.out.println("Salary: $" + salary);
    }
}


