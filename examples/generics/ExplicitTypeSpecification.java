//: generics/ExplicitTypeSpecification.java
import pets.*;
import java.util.*;
import java.util.List;
import net.mindview.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
