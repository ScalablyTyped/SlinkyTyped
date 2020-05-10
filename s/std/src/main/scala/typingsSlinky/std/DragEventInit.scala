package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEventInit extends MouseEventInit {
  var dataTransfer: js.UndefOr[org.scalajs.dom.raw.DataTransfer | Null] = js.native
}

object DragEventInit {
  @scala.inline
  def apply(): DragEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragEventInit]
  }
  @scala.inline
  implicit class DragEventInitOps[Self <: DragEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataTransfer(value: org.scalajs.dom.raw.DataTransfer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTransfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTransfer")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTransferNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTransfer")(null)
        ret
    }
  }
  
}

