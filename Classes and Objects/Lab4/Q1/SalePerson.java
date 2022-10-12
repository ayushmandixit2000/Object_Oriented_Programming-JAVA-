

public class SalePerson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson (String firstName, String lastName, int totalSales){
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString(){
        return this.lastName + ", " + this.firstName + " : " + this.totalSales;
    }

    public boolean equals(Object o){
        if (this.getClass() == o.getClass()){
            SalePerson s = (SalePerson) o;
            return this.firstName == s.getFirstName() && this.lastName == s.getLastName();
        }

        else{
            return false;
        }
    }

    public int compareTo (Object o) {
		if (this.getClass() == o.getClass()) {
			SalePerson s = (SalePerson) o;
			if (this.totalSales == s.getTotalSales()) {
				return this.lastName.compareTo(s.getLastName()) < 0 ? 1:-1;
			} else {
				return this.totalSales - s.getTotalSales();
			}
		}
		return 0;
	}

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public int getTotalSales()
    {
        return this.totalSales;
    }


}
