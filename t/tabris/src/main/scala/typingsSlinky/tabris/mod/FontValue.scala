package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabris.mod.FontLikeObject
  - java.lang.String
  - typingsSlinky.tabris.tabrisStrings.initial
  - scala.Null
*/
trait FontValue extends js.Object

object FontValue {
  @scala.inline
  def initial: typingsSlinky.tabris.tabrisStrings.initial = "initial".asInstanceOf[typingsSlinky.tabris.tabrisStrings.initial]
  @scala.inline
  implicit def apply(value: FontLikeObject): FontValue = value.asInstanceOf[FontValue]
  @scala.inline
  implicit def apply(value: Null): FontValue = value.asInstanceOf[FontValue]
  @scala.inline
  implicit def apply(value: String): FontValue = value.asInstanceOf[FontValue]
}

