package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.anon.X
import typingsSlinky.sketchapp.sketchappStrings.styleBlur
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSStyleBlur extends js.Object {
  var _class: styleBlur = js.native
  var center: X = js.native
  var isEnabled: Double = js.native
  var motionAngle: Double = js.native
  var radius: Double = js.native
  var `type`: Double = js.native
}

object SketchMSStyleBlur {
  @scala.inline
  def apply(
    _class: styleBlur,
    center: X,
    isEnabled: Double,
    motionAngle: Double,
    radius: Double,
    `type`: Double
  ): SketchMSStyleBlur = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], motionAngle = motionAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBlur]
  }
  @scala.inline
  implicit class SketchMSStyleBlurOps[Self <: SketchMSStyleBlur] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: styleBlur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenter(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotionAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

