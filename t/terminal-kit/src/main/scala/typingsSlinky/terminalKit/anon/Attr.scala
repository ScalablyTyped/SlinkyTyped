package typingsSlinky.terminalKit.anon

import typingsSlinky.terminalKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attr extends js.Object {
  var attr: Attributes | Double = js.native
  var char: js.UndefOr[String] = js.native
}

object Attr {
  @scala.inline
  def apply(attr: Attributes | Double): Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attr]
  }
  @scala.inline
  implicit class AttrOps[Self <: Attr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttr(value: Attributes | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("char")(js.undefined)
        ret
    }
  }
  
}

