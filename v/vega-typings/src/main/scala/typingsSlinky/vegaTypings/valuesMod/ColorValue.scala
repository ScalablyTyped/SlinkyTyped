package typingsSlinky.vegaTypings.valuesMod

import typingsSlinky.vegaTypings.colorMod.Color
import typingsSlinky.vegaTypings.encodeMod.ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - typingsSlinky.vegaTypings.colorMod.Color
  - typingsSlinky.vegaTypings.encodeMod.ColorValueRef
*/
trait ColorValue extends js.Object

object ColorValue {
  @scala.inline
  implicit def apply(value: Color): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: ColorValueRef): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: Null): ColorValue = value.asInstanceOf[ColorValue]
}

