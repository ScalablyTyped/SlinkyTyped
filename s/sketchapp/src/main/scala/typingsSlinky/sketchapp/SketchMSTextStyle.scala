package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.textStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSTextStyle extends js.Object {
  var _class: textStyle = js.native
  var encodedAttributes: SketchMSAttributes = js.native
}

object SketchMSTextStyle {
  @scala.inline
  def apply(_class: textStyle, encodedAttributes: SketchMSAttributes): SketchMSTextStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], encodedAttributes = encodedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSTextStyle]
  }
  @scala.inline
  implicit class SketchMSTextStyleOps[Self <: SketchMSTextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: textStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodedAttributes(value: SketchMSAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

