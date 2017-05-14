package person

import org.scalatest.FunSuite
import person.Person._


class PersonTest extends FunSuite {
  
  test("Create Person") {
    val person = Person("John Snow")
    assert(person.firstName == "John" && person.lastName == "Snow")
  }
  
}