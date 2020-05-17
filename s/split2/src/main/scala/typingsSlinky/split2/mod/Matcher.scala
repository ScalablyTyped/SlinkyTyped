package typingsSlinky.split2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
*/
trait Matcher extends js.Object

object Matcher {
  @scala.inline
  implicit def apply(value: js.RegExp): Matcher = value.asInstanceOf[Matcher]
  @scala.inline
  implicit def apply(value: String): Matcher = value.asInstanceOf[Matcher]
}

