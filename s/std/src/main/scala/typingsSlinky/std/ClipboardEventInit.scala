package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipboardEventInit extends EventInit {
  var clipboardData: js.UndefOr[org.scalajs.dom.raw.DataTransfer | Null] = js.native
}

object ClipboardEventInit {
  @scala.inline
  def apply(): ClipboardEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipboardEventInit]
  }
  @scala.inline
  implicit class ClipboardEventInitOps[Self <: org.scalajs.dom.raw.ClipboardEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipboardData(value: org.scalajs.dom.raw.DataTransfer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardData")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardData")(null)
        ret
    }
  }
  
}

