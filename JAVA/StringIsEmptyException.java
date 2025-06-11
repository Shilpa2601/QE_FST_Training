package Activity;

public class StringIsEmptyException extends Exception {
  private String message;
  
  public StringIsEmptyException(String message) {
	  this.message = message;
  }
  
  @Override
  public String getMessage() {
	  return "The Error happens because : "+ this.message;
	  }
}
