package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.styleReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSStyleReflection extends js.Object {
  var _class: styleReflection = js.native
  var distance: Double = js.native
  var isEnabled: Double = js.native
  var strength: Double = js.native
}

object SketchMSStyleReflection {
  @scala.inline
  def apply(_class: styleReflection, distance: Double, isEnabled: Double, strength: Double): SketchMSStyleReflection = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleReflection]
  }
  @scala.inline
  implicit class SketchMSStyleReflectionOps[Self <: SketchMSStyleReflection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: styleReflection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

