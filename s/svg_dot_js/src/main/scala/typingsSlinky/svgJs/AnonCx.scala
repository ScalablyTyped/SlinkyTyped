package typingsSlinky.svgJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCx extends js.Object {
  var cx: Double = js.native
  var cy: Double = js.native
  var fill: String = js.native
  var `fill-opacity`: Double = js.native
  var `font-family`: String = js.native
  var `font-size`: Double = js.native
  var height: Double = js.native
  var offset: Double = js.native
  var opacity: Double = js.native
  var r: Double = js.native
  var rx: Double = js.native
  var ry: Double = js.native
  var `stop-color`: String = js.native
  var `stop-opacity`: Double = js.native
  var stroke: String = js.native
  var `stroke-linecap`: String = js.native
  var `stroke-linejoin`: String = js.native
  var `stroke-opacity`: Double = js.native
  var `stroke-width`: Double = js.native
  var `text-anchor`: String = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object AnonCx {
  @scala.inline
  def apply(
    cx: Double,
    cy: Double,
    fill: String,
    `fill-opacity`: Double,
    `font-family`: String,
    `font-size`: Double,
    height: Double,
    offset: Double,
    opacity: Double,
    r: Double,
    rx: Double,
    ry: Double,
    `stop-color`: String,
    `stop-opacity`: Double,
    stroke: String,
    `stroke-linecap`: String,
    `stroke-linejoin`: String,
    `stroke-opacity`: Double,
    `stroke-width`: Double,
    `text-anchor`: String,
    width: Double,
    x: Double,
    y: Double
  ): AnonCx = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("stop-color")(`stop-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("stop-opacity")(`stop-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-linecap")(`stroke-linecap`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-linejoin")(`stroke-linejoin`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-opacity")(`stroke-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCx]
  }
  @scala.inline
  implicit class AnonCxOps[Self <: AnonCx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFill-opacity`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFont-family`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFont-size`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStop-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStop-opacity`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStroke-linecap`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStroke-linejoin`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-linejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStroke-opacity`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStroke-width`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withText-anchor`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

