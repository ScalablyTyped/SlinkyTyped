package typingsSlinky.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  style ? :{  max ? :react.react.CSSProperties,   maxLabels ? :react.react.CSSProperties,   median ? :react.react.CSSProperties,   medianLabels ? :react.react.CSSProperties,   min ? :react.react.CSSProperties,   minLabels ? :react.react.CSSProperties,   q1 ? :react.react.CSSProperties,   q1Labels ? :react.react.CSSProperties,   q3 ? :react.react.CSSProperties,   q3Labels ? :react.react.CSSProperties},   boxWidth ? :number} & victory.victory.ThemeBaseProps */
@js.native
trait stylemaxCSSPropertiesmaxL extends js.Object {
  var boxWidth: js.UndefOr[Double] = js.native
  var colorScale: js.Array[String] = js.native
  var height: Double = js.native
  var padding: js.UndefOr[Double] = js.native
  var style: js.UndefOr[AnonMax] = js.native
  var width: Double = js.native
}

object stylemaxCSSPropertiesmaxL {
  @scala.inline
  def apply(colorScale: js.Array[String], height: Double, width: Double): stylemaxCSSPropertiesmaxL = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[stylemaxCSSPropertiesmaxL]
  }
  @scala.inline
  implicit class stylemaxCSSPropertiesmaxLOps[Self <: stylemaxCSSPropertiesmaxL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorScale(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: AnonMax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

