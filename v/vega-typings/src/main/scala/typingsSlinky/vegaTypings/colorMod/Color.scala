package typingsSlinky.vegaTypings.colorMod

import typingsSlinky.vegaTypings.valuesMod.ColorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.colorMod.ColorName
  - typingsSlinky.vegaTypings.colorMod.HexColor
  - java.lang.String
*/
trait Color extends ColorValue

object Color {
  @scala.inline
  implicit def apply(value: HexColor | String): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: ColorName): Color = value.asInstanceOf[Color]
}

