package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.rulerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSRulerData extends js.Object {
  var _class: rulerData = js.native
  var base: Double = js.native
  var guides: js.Array[_] = js.native
}

object SketchMSRulerData {
  @scala.inline
  def apply(_class: rulerData, base: Double, guides: js.Array[_]): SketchMSRulerData = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSRulerData]
  }
  @scala.inline
  implicit class SketchMSRulerDataOps[Self <: SketchMSRulerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: rulerData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuides(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guides")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

