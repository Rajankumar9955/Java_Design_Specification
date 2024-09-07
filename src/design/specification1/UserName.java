package design.specification1;

public class UserName {
  private String firstname;
  private String lastname;

  public String getFirstname()
  {
      return firstname;
  }
  public void setFirstname(String firstname)
  {
      this.firstname=firstname;
  }
  public String getLastname()
  {
      return lastname;
  }
  public void setLastname(String lastname)
  {
      this.lastname=lastname;
  }
  public String FULLNAME()
  {
      String response=null;
      response=firstname+" "+lastname;
      return response;
  }
}
