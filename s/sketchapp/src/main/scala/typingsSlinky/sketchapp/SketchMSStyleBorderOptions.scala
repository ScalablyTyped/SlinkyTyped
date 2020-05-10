package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.styleBorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSStyleBorderOptions extends js.Object {
  var _class: styleBorderOptions = js.native
  var dashPattern: js.Array[_] = js.native
  var isEnabled: Double = js.native
  var lineCapStyle: Double = js.native
  var lineJoinStyle: Double = js.native
}

object SketchMSStyleBorderOptions {
  @scala.inline
  def apply(
    _class: styleBorderOptions,
    dashPattern: js.Array[_],
    isEnabled: Double,
    lineCapStyle: Double,
    lineJoinStyle: Double
  ): SketchMSStyleBorderOptions = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], dashPattern = dashPattern.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lineCapStyle = lineCapStyle.asInstanceOf[js.Any], lineJoinStyle = lineJoinStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBorderOptions]
  }
  @scala.inline
  implicit class SketchMSStyleBorderOptionsOps[Self <: SketchMSStyleBorderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: styleBorderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashPattern(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineCapStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCapStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineJoinStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoinStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

