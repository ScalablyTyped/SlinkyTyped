package typingsSlinky.zeroclipboard

import typingsSlinky.zeroclipboard.ZC.EventListenerOrEventListenerObject
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardAfterCopyEvent
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardBeforeCopyEvent
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardCopyEvent
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardDestroyEvent
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardErrorEvent
import typingsSlinky.zeroclipboard.ZC.ZeroClipboardReadyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBeforecopy extends js.Object {
  var aftercopy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]]] = js.native
  var beforecopy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]]] = js.native
  var copy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]]] = js.native
  var destroy: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]]] = js.native
  var error: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]]] = js.native
  var ready: js.UndefOr[js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]]] = js.native
}

object AnonBeforecopy {
  @scala.inline
  def apply(): AnonBeforecopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBeforecopy]
  }
  @scala.inline
  implicit class AnonBeforecopyOps[Self <: AnonBeforecopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAftercopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aftercopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAftercopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aftercopy")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforecopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforecopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforecopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforecopy")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: js.Array[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
  }
  
}

