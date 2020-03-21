package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.encodeMod.ColorHCL
import typingsSlinky.vegaTypings.encodeMod.ColorHSL
import typingsSlinky.vegaTypings.encodeMod.ColorLAB
import typingsSlinky.vegaTypings.encodeMod.ColorRGB
import typingsSlinky.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends _ColorValueRef {
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL
}

object AnonColor {
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColor]
  }
}

