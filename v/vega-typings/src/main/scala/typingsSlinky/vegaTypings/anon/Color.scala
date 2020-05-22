package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.ColorHCL
import typingsSlinky.vegaTypings.encodeMod.ColorHSL
import typingsSlinky.vegaTypings.encodeMod.ColorLAB
import typingsSlinky.vegaTypings.encodeMod.ColorRGB
import typingsSlinky.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends _ColorValueRef {
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL
}

object Color {
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

