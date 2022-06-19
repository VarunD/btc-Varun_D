package Equals;

public class Customer 
{
	int customerId;
	String name;
	String email;
	Address address;
	
    public Customer(int customerId, String name, String email, Address address) 
    {

    }

    @Override
    public boolean equals(Object other) 
    {
    	Customer customer = (Customer)other;
        	
    	return  this.customerId==customer.customerId
    			&&this.name.equals(customer.name)
    			&&this.email.equals(customer.email)&&this.address.equals(customer.address);
    }

    public int getCustomerId() {
        return -1;
    }

    public void setCustomerId(int customerId) {

    }

    public String getName() {
        return "";
    }

    public void setName(String name) {

    }

    public String getEmail() {
        return "";
    }

    public void setEmail(String email) {

    }

    public Address getAddress() {
        return null;
    }

    public void setAddress(Address address) {

    }
}
