package typingsSlinky.typeFest.packageJsonMod.PackageJson

import typingsSlinky.typeFest.anon.Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.typeFest.anon.Email
*/
trait Person extends js.Object

object Person {
  @scala.inline
  implicit def apply(value: Email): Person = value.asInstanceOf[Person]
  @scala.inline
  implicit def apply(value: String): Person = value.asInstanceOf[Person]
}

