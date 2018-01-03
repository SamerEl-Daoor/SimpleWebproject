package aqarDelta;

public class Model {
	 /*
	    *the identifier of our customer
	    */
	    private int id;
	    /*
	    *firstname and lastname,username,password of our customer
	    */
	    private String first_name,last_name,username,password;
	    /*
	    *getId method : getback the id of our customer
	    */
	    

	    public int getId() {
	        return id;
	    }
	    /*
	    *setId:method to set the id
	    */
	    public void setId(int id) {
	        this.id = id;
	    }

	    /*
	    *getFirstmame:method which returns the firstname of our customer
	    */
	    public String getFirstname() {
	        return first_name;
	    }
	    /*
	    *setFirstname:method to set the firstname of our customer
	    */
	    public void setFirstname(String firstname) {
	        this.first_name = firstname;
	    }
	    /*
	    *getLastname:method returns the lastname of our customer
	    */
	    public String getLastname() {
	        return last_name;
	    }
	    /*
	    *setLastname:method which sets the last name of our customer
	    */
	    public void setLastname(String lastname) {
	        this.last_name = lastname;
	    }
	    public String getUsername(){
	    return  username;
	    }
	    public void setUsername(String username){
	    this.username=username;
	    }
	    public String getPassword(){
	    return password;
	    }
	    public void setPassword(String password){
	    this.password=password;
	    }

}
