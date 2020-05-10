package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.sharedStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSSharedStyle extends js.Object {
  var _class: sharedStyle = js.native
  var name: String = js.native
  var value: SketchMSStyle = js.native
}

object SketchMSSharedStyle {
  @scala.inline
  def apply(_class: sharedStyle, name: String, value: SketchMSStyle): SketchMSSharedStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSharedStyle]
  }
  @scala.inline
  implicit class SketchMSSharedStyleOps[Self <: SketchMSSharedStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: sharedStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: SketchMSStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

