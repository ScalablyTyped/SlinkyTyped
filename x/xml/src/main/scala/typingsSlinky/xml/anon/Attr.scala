package typingsSlinky.xml.anon

import typingsSlinky.xml.mod.XmlAttrs
import typingsSlinky.xml.mod.XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attr extends XmlDesc {
  var _attr: XmlAttrs = js.native
}

object Attr {
  @scala.inline
  def apply(_attr: XmlAttrs): Attr = {
    val __obj = js.Dynamic.literal(_attr = _attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attr]
  }
  @scala.inline
  implicit class AttrOps[Self <: Attr] (val x: Self) extends AnyVal {
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

