package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.border
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSBorder extends js.Object {
  var _class: border = js.native
  var color: SketchMSColor = js.native
  var fillType: SketchMSFillTypeEnum = js.native
  var isEnabled: Boolean = js.native
  var position: SketchMSBorderPositionEnum = js.native
  var thickness: Double = js.native
}

object SketchMSBorder {
  @scala.inline
  def apply(
    _class: border,
    color: SketchMSColor,
    fillType: SketchMSFillTypeEnum,
    isEnabled: Boolean,
    position: SketchMSBorderPositionEnum,
    thickness: Double
  ): SketchMSBorder = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSBorder]
  }
  @scala.inline
  implicit class SketchMSBorderOps[Self <: SketchMSBorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: SketchMSColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillType(value: SketchMSFillTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: SketchMSBorderPositionEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

