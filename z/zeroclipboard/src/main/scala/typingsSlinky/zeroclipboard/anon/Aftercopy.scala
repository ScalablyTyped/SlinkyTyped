package typingsSlinky.zeroclipboard.anon

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
trait Aftercopy extends js.Object {
  var aftercopy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]] = js.native
  var beforecopy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]] = js.native
  var copy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]] = js.native
  var destroy: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]] = js.native
  var error: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]] = js.native
  var ready: js.UndefOr[EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]] = js.native
}

object Aftercopy {
  @scala.inline
  def apply(): Aftercopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aftercopy]
  }
  @scala.inline
  implicit class AftercopyOps[Self <: Aftercopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAftercopyFunction1(value: ZeroClipboardAfterCopyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aftercopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAftercopy(value: EventListenerOrEventListenerObject[ZeroClipboardAfterCopyEvent]): Self = {
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
    def withBeforecopyFunction1(value: ZeroClipboardBeforeCopyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforecopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforecopy(value: EventListenerOrEventListenerObject[ZeroClipboardBeforeCopyEvent]): Self = {
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
    def withCopyFunction1(value: ZeroClipboardCopyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopy(value: EventListenerOrEventListenerObject[ZeroClipboardCopyEvent]): Self = {
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
    def withDestroyFunction1(value: ZeroClipboardDestroyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: EventListenerOrEventListenerObject[ZeroClipboardDestroyEvent]): Self = {
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
    def withErrorFunction1(value: ZeroClipboardErrorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: EventListenerOrEventListenerObject[ZeroClipboardErrorEvent]): Self = {
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
    def withReadyFunction1(value: ZeroClipboardReadyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReady(value: EventListenerOrEventListenerObject[ZeroClipboardReadyEvent]): Self = {
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

