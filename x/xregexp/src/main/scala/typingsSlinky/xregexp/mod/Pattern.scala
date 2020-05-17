package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Valid ways os specifying a pattern to use.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.RegExp
  - java.lang.String
*/
trait Pattern extends js.Object

object Pattern {
  @scala.inline
  implicit def apply(value: js.RegExp): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: String): Pattern = value.asInstanceOf[Pattern]
}

