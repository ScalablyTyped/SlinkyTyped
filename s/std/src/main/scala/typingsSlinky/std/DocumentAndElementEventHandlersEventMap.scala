package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAndElementEventHandlersEventMap extends js.Object {
  var copy: org.scalajs.dom.raw.ClipboardEvent = js.native
  var cut: org.scalajs.dom.raw.ClipboardEvent = js.native
  var paste: org.scalajs.dom.raw.ClipboardEvent = js.native
}

object DocumentAndElementEventHandlersEventMap {
  @scala.inline
  def apply(
    copy: org.scalajs.dom.raw.ClipboardEvent,
    cut: org.scalajs.dom.raw.ClipboardEvent,
    paste: org.scalajs.dom.raw.ClipboardEvent
  ): DocumentAndElementEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAndElementEventHandlersEventMap]
  }
  @scala.inline
  implicit class DocumentAndElementEventHandlersEventMapOps[Self <: DocumentAndElementEventHandlersEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: org.scalajs.dom.raw.ClipboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCut(value: org.scalajs.dom.raw.ClipboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaste(value: org.scalajs.dom.raw.ClipboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

