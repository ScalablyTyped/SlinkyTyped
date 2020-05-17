package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabris.mod.ColorLikeObject
  - typingsSlinky.tabris.mod.ColorArray
  - java.lang.String
  - typingsSlinky.tabris.tabrisStrings.initial
  - scala.Null
*/
trait ColorValue extends js.Object

object ColorValue {
  @scala.inline
  def initial: typingsSlinky.tabris.tabrisStrings.initial = "initial".asInstanceOf[typingsSlinky.tabris.tabrisStrings.initial]
  @scala.inline
  implicit def apply(value: ColorArray): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: ColorLikeObject): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: Null): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: String): ColorValue = value.asInstanceOf[ColorValue]
}

