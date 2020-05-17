package typingsSlinky.shellQuote.mod

import typingsSlinky.shellQuote.anon.Comment
import typingsSlinky.shellQuote.anon.Op
import typingsSlinky.shellQuote.anon.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.shellQuote.anon.Op
  - typingsSlinky.shellQuote.anon.Pattern
  - typingsSlinky.shellQuote.anon.Comment
*/
trait ParseEntry extends js.Object

object ParseEntry {
  @scala.inline
  implicit def apply(value: Comment): ParseEntry = value.asInstanceOf[ParseEntry]
  @scala.inline
  implicit def apply(value: Op): ParseEntry = value.asInstanceOf[ParseEntry]
  @scala.inline
  implicit def apply(value: Pattern): ParseEntry = value.asInstanceOf[ParseEntry]
  @scala.inline
  implicit def apply(value: String): ParseEntry = value.asInstanceOf[ParseEntry]
}

