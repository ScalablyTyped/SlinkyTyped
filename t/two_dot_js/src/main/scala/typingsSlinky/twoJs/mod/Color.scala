package typingsSlinky.twoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.twoJs.mod.LinearGradient
  - typingsSlinky.twoJs.mod.RadialGradient
*/
trait Color extends js.Object

object Color {
  @scala.inline
  implicit def apply(value: LinearGradient): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: RadialGradient): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: String): Color = value.asInstanceOf[Color]
}

