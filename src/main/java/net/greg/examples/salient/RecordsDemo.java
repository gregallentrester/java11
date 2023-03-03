package net.greg.examples.salient;


/**
 * https://blogs.oracle.com/javamagazine/records-come-to-java
 */
public class RecordsDemo {

  public static void main(String[] args) {
    new RecordsDemo().demo();
  }


  private RecordsDemo demo() {

    System.err.println("\n\nRequires no accessors/mutators/equals()/hashCode()\n\n");

    return this;
  }
}
