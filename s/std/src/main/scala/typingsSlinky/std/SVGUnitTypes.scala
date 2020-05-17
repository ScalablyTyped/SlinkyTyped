package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A commonly used set of constants used for reflecting gradientUnits, patternContentUnits and other similar attributes. */
@js.native
trait SVGUnitTypes extends js.Object {
  val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Double = js.native
  val SVG_UNIT_TYPE_UNKNOWN: Double = js.native
  val SVG_UNIT_TYPE_USERSPACEONUSE: Double = js.native
}

object SVGUnitTypes {
  @scala.inline
  def apply(
    SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Double,
    SVG_UNIT_TYPE_UNKNOWN: Double,
    SVG_UNIT_TYPE_USERSPACEONUSE: Double
  ): SVGUnitTypes = {
    val __obj = js.Dynamic.literal(SVG_UNIT_TYPE_OBJECTBOUNDINGBOX = SVG_UNIT_TYPE_OBJECTBOUNDINGBOX.asInstanceOf[js.Any], SVG_UNIT_TYPE_UNKNOWN = SVG_UNIT_TYPE_UNKNOWN.asInstanceOf[js.Any], SVG_UNIT_TYPE_USERSPACEONUSE = SVG_UNIT_TYPE_USERSPACEONUSE.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGUnitTypes]
  }
  @scala.inline
  implicit class SVGUnitTypesOps[Self <: org.scalajs.dom.raw.SVGUnitTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSVG_UNIT_TYPE_OBJECTBOUNDINGBOX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_UNIT_TYPE_OBJECTBOUNDINGBOX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_UNIT_TYPE_UNKNOWN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_UNIT_TYPE_UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_UNIT_TYPE_USERSPACEONUSE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_UNIT_TYPE_USERSPACEONUSE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

