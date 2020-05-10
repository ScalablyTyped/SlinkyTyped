package typingsSlinky.xml

import typingsSlinky.xml.mod.XmlAttrs
import typingsSlinky.xml.mod._XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttr extends _XmlDesc {
  var _attr: XmlAttrs = js.native
}

object AnonAttr {
  @scala.inline
  def apply(_attr: XmlAttrs): AnonAttr = {
    val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttr]
  }
  @scala.inline
  implicit class AnonAttrOps[Self <: AnonAttr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_attr(value: XmlAttrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

