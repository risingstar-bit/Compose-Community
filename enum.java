enum Size{

  // enum constants
  SMALL, MEDIUM, LARGE, EXTRALARGE;

  public String getSize() {

  // this will refer to the object SMALL
  switch(this) {
    case SMALL:
      return "small";

    case MEDIUM:
      return "medium";

    case LARGE:
      return "large";

    case EXTRALARGE:
      return "extra large";

    default:
      return null;
     }
  }

  public static void main(String[] args) {

     // call the method getSize()
     // using the object SMALL
     System.out.println("The size of Pizza I get is " + Size.SMALL.getSize());

     // call the method getSize()
     // using the object LARGE
     System.out.println("The size of Pizza I want is " + Size.LARGE.getSize());
  }
}
