package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.fontDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSFontAttribute extends js.Object {
  var _class: fontDescriptor = js.native
  var attributes: AnonName = js.native
}

object SketchMSFontAttribute {
  @scala.inline
  def apply(_class: fontDescriptor, attributes: AnonName): SketchMSFontAttribute = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFontAttribute]
  }
  @scala.inline
  implicit class SketchMSFontAttributeOps[Self <: SketchMSFontAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: fontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

