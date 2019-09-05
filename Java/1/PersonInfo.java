// André Nascimento
// GitHub: https://github.com/AndreNasci
// Linkedin: linkedin.com/in/andré-nascimento-a01095185

// PersonInfo.java
// This class is used in Note3.java archive

public class PersonInfo {

  private String name;
  private int age;
  private double coef;

  //class constructor
  public PersonInfo() {
    name = "";
    age = 0;
    coef= 0.0;
  } //end class construtor

  public void setName ( String n ) {
    name = n;
  } //end method setName

  public void setAge ( int a ) {
    age = a;
  } //end method setAge

  public void setCoef ( double c ) {
    coef = c;
  } //end method setCoef

  public String getName() {
    return name;
  } //end method getName

  public int getAge() {
    return age;
  } //end method getAge

  public double getCoef() {
    return coef;
  } //end method getCoef

} //end class PersonInfo
