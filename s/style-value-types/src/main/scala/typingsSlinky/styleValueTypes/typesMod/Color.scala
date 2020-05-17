package typingsSlinky.styleValueTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styleValueTypes.typesMod.HSLA
  - typingsSlinky.styleValueTypes.typesMod.RGBA
*/
trait Color extends js.Object

object Color {
  @scala.inline
  implicit def apply(value: HSLA): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: RGBA): Color = value.asInstanceOf[Color]
}

