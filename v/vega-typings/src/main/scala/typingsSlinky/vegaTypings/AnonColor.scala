package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.encodeMod.ColorHCL
import typingsSlinky.vegaTypings.encodeMod.ColorHSL
import typingsSlinky.vegaTypings.encodeMod.ColorLAB
import typingsSlinky.vegaTypings.encodeMod.ColorRGB
import typingsSlinky.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColor extends _ColorValueRef {
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL = js.native
}

object AnonColor {
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
  @scala.inline
  implicit class AnonColorOps[Self <: AnonColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

