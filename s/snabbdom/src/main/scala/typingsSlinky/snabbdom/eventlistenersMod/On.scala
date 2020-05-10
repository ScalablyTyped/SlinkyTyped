package typingsSlinky.snabbdom.eventlistenersMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.std.EventListener
import typingsSlinky.std.Event_
import typingsSlinky.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ N in keyof std.HTMLElementEventMap ]:? (ev : std.HTMLElementEventMap[N]): void} & {[event: string] : std.EventListener} */
@js.native
trait On extends /* event */ StringDictionary[EventListener] {
  var abort: js.UndefOr[js.Function1[/* ev */ UIEvent, Unit]] = js.native
  var animationcancel: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.native
  var animationend: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.native
  var animationiteration: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.native
  var animationstart: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.native
  var auxclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var blur: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.native
  var cancel: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var canplay: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var canplaythrough: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var change: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var click: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var close: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var contextmenu: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var copy: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.native
  var cuechange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var cut: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.native
  var dblclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var drag: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var dragend: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var dragenter: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var dragexit: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var dragleave: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var dragover: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var dragstart: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var drop: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var durationchange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var emptied: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var ended: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* ev */ ErrorEvent, Unit]] = js.native
  var focus: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.native
  var focusin: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.native
  var focusout: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.native
  var fullscreenchange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var fullscreenerror: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var gotpointercapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var input: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var invalid: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var keydown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.native
  var keypress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.native
  var keyup: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.native
  var load: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var loadeddata: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var loadedmetadata: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var loadstart: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var lostpointercapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var mousedown: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mouseenter: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mouseleave: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mousemove: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mouseout: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mouseover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mouseup: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var paste: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.native
  var pause: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var play: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var playing: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var pointercancel: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerdown: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerenter: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerleave: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointermove: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerout: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerover: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerup: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var progress: js.UndefOr[js.Function1[/* ev */ ProgressEvent, Unit]] = js.native
  var ratechange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var reset: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var resize: js.UndefOr[js.Function1[/* ev */ UIEvent, Unit]] = js.native
  var scroll: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var securitypolicyviolation: js.UndefOr[js.Function1[/* ev */ SecurityPolicyViolationEvent, Unit]] = js.native
  var seeked: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var seeking: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var select: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var selectionchange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var selectstart: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var stalled: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var submit: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var suspend: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var timeupdate: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var toggle: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var touchcancel: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.native
  var touchend: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.native
  var touchmove: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.native
  var touchstart: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.native
  var transitioncancel: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.native
  var transitionend: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.native
  var transitionrun: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.native
  var transitionstart: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.native
  var volumechange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var waiting: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.native
  var wheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, Unit]] = js.native
}

object On {
  @scala.inline
  def apply(): On = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[On]
  }
  @scala.inline
  implicit class OnOps[Self <: On] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: /* ev */ UIEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationcancel(value: /* ev */ AnimationEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationcancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnimationcancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationcancel")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationend(value: /* ev */ AnimationEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnimationend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationend")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationiteration(value: /* ev */ AnimationEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationiteration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnimationiteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationiteration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationstart(value: /* ev */ AnimationEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnimationstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationstart")(js.undefined)
        ret
    }
    @scala.inline
    def withAuxclick(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAuxclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxclick")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: /* ev */ FocusEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCanplay(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canplay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canplay")(js.undefined)
        ret
    }
    @scala.inline
    def withCanplaythrough(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canplaythrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanplaythrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canplaythrough")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withContextmenu(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: /* ev */ ClipboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withCuechange(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cuechange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCuechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cuechange")(js.undefined)
        ret
    }
    @scala.inline
    def withCut(value: /* ev */ ClipboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(js.undefined)
        ret
    }
    @scala.inline
    def withDblclick(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: /* ev */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragend(value: /* ev */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.undefined)
        ret
    }
    @scala.inline
    def withDragenter(value: /* ev */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragenter")(js.undefined)
        ret
    }
    @scala.inline
    def withDragexit(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragexit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragexit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragexit")(js.undefined)
        ret
    }
    @scala.inline
    def withDragleave(value: /* ev */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragleave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragleave")(js.undefined)
        ret
    }
    @scala.inline
    def withDragover(value: /* ev */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragover")(js.undefined)
        ret
    }
    @scala.inline
    def withDragstart(value: /* ev */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: /* ev */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationchange(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationchange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDurationchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationchange")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptied(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptied")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEmptied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptied")(js.undefined)
        ret
    }
    @scala.inline
    def withEnded(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* ev */ ErrorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: /* ev */ FocusEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusin(value: /* ev */ FocusEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusin")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusout(value: /* ev */ FocusEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusout")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenchange(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenchange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFullscreenchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenchange")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenerror(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFullscreenerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenerror")(js.undefined)
        ret
    }
    @scala.inline
    def withGotpointercapture(value: /* ev */ PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotpointercapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGotpointercapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotpointercapture")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalid(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.undefined)
        ret
    }
    @scala.inline
    def withKeydown(value: /* ev */ KeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withKeypress(value: /* ev */ KeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyup(value: /* ev */ KeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadeddata(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadeddata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadeddata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadeddata")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadedmetadata(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedmetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadedmetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedmetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadstart(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadstart")(js.undefined)
        ret
    }
    @scala.inline
    def withLostpointercapture(value: /* ev */ PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lostpointercapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLostpointercapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lostpointercapture")(js.undefined)
        ret
    }
    @scala.inline
    def withMousedown(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseenter(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseleave(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(js.undefined)
        ret
    }
    @scala.inline
    def withMousemove(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseout(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseover(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseup(value: /* ev */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: /* ev */ ClipboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withPlay(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaying(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playing")(js.undefined)
        ret
    }
    @scala.inline
    def withPointercancel(value: /* ev */ PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointercancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointercancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointercancel")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerdown(value: /* ev */ PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerdown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointerdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerdown")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerenter(value: /* ev */ PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointerenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerenter")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerleave(value: /* ev */ PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerleave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointerleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerleave")(js.undefined)
        ret
    }
    @scala.inline
    def withPointermove(value: /* ev */ PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointermove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointermove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointermove")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerout(value: /* ev */ PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointerout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerout")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerover(value: /* ev */ PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointerover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerover")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerup(value: /* ev */ PointerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPointerup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerup")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: /* ev */ ProgressEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withRatechange(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratechange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRatechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratechange")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: /* ev */ UIEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSecuritypolicyviolation(value: /* ev */ SecurityPolicyViolationEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securitypolicyviolation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSecuritypolicyviolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securitypolicyviolation")(js.undefined)
        ret
    }
    @scala.inline
    def withSeeked(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSeeked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeked")(js.undefined)
        ret
    }
    @scala.inline
    def withSeeking(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSeeking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeking")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionchange(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionchange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectionchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionchange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectstart(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectstart")(js.undefined)
        ret
    }
    @scala.inline
    def withStalled(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stalled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stalled")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmit(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspend(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuspend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspend")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeupdate(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeupdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTimeupdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeupdate")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchcancel(value: /* ev */ TouchEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTouchcancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchend(value: /* ev */ TouchEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTouchend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchmove(value: /* ev */ TouchEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTouchmove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchstart(value: /* ev */ TouchEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTouchstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitioncancel(value: /* ev */ TransitionEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitioncancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransitioncancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitioncancel")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionend(value: /* ev */ TransitionEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransitionend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionend")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionrun(value: /* ev */ TransitionEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionrun")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransitionrun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionrun")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionstart(value: /* ev */ TransitionEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransitionstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionstart")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumechange(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumechange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVolumechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumechange")(js.undefined)
        ret
    }
    @scala.inline
    def withWaiting(value: /* ev */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(js.undefined)
        ret
    }
    @scala.inline
    def withWheel(value: /* ev */ WheelEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(js.undefined)
        ret
    }
  }
  
}

