package typingsSlinky.titanium.Titanium.UI.Android

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressIndicatorEventMap extends ProxyEventMap {
  var cancel: ProgressIndicatorCancelEvent = js.native
  var click: ProgressIndicatorClickEvent = js.native
  var dblclick: ProgressIndicatorDblclickEvent = js.native
  var doubletap: ProgressIndicatorDoubletapEvent = js.native
  var focus: ProgressIndicatorFocusEvent = js.native
  var keypressed: ProgressIndicatorKeypressedEvent = js.native
  var longclick: ProgressIndicatorLongclickEvent = js.native
  var longpress: ProgressIndicatorLongpressEvent = js.native
  var pinch: ProgressIndicatorPinchEvent = js.native
  var postlayout: ProgressIndicatorPostlayoutEvent = js.native
  var singletap: ProgressIndicatorSingletapEvent = js.native
  var swipe: ProgressIndicatorSwipeEvent = js.native
  var touchcancel: ProgressIndicatorTouchcancelEvent = js.native
  var touchend: ProgressIndicatorTouchendEvent = js.native
  var touchmove: ProgressIndicatorTouchmoveEvent = js.native
  var touchstart: ProgressIndicatorTouchstartEvent = js.native
  var twofingertap: ProgressIndicatorTwofingertapEvent = js.native
}

object ProgressIndicatorEventMap {
  @scala.inline
  def apply(
    cancel: ProgressIndicatorCancelEvent,
    click: ProgressIndicatorClickEvent,
    dblclick: ProgressIndicatorDblclickEvent,
    doubletap: ProgressIndicatorDoubletapEvent,
    focus: ProgressIndicatorFocusEvent,
    keypressed: ProgressIndicatorKeypressedEvent,
    longclick: ProgressIndicatorLongclickEvent,
    longpress: ProgressIndicatorLongpressEvent,
    pinch: ProgressIndicatorPinchEvent,
    postlayout: ProgressIndicatorPostlayoutEvent,
    singletap: ProgressIndicatorSingletapEvent,
    swipe: ProgressIndicatorSwipeEvent,
    touchcancel: ProgressIndicatorTouchcancelEvent,
    touchend: ProgressIndicatorTouchendEvent,
    touchmove: ProgressIndicatorTouchmoveEvent,
    touchstart: ProgressIndicatorTouchstartEvent,
    twofingertap: ProgressIndicatorTwofingertapEvent
  ): ProgressIndicatorEventMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressIndicatorEventMap]
  }
  @scala.inline
  implicit class ProgressIndicatorEventMapOps[Self <: ProgressIndicatorEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: ProgressIndicatorCancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: ProgressIndicatorClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: ProgressIndicatorDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: ProgressIndicatorDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: ProgressIndicatorFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: ProgressIndicatorKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: ProgressIndicatorLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: ProgressIndicatorLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: ProgressIndicatorPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: ProgressIndicatorPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: ProgressIndicatorSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: ProgressIndicatorSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: ProgressIndicatorTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: ProgressIndicatorTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: ProgressIndicatorTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: ProgressIndicatorTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: ProgressIndicatorTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

