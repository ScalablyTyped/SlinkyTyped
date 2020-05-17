package typingsSlinky.seneca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.seneca.mod.MinimalPattern
*/
trait Pattern extends js.Object

object Pattern {
  @scala.inline
  implicit def apply(value: MinimalPattern): Pattern = value.asInstanceOf[Pattern]
  @scala.inline
  implicit def apply(value: String): Pattern = value.asInstanceOf[Pattern]
}

