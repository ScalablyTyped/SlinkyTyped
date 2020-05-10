package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitWindowEventMap extends ProxyEventMap {
  var blur: SplitWindowBlurEvent = js.native
  var click: SplitWindowClickEvent = js.native
  var close: SplitWindowCloseEvent = js.native
  var dblclick: SplitWindowDblclickEvent = js.native
  var doubletap: SplitWindowDoubletapEvent = js.native
  var focus: SplitWindowFocusEvent = js.native
  var keypressed: SplitWindowKeypressedEvent = js.native
  var longpress: SplitWindowLongpressEvent = js.native
  var open: SplitWindowOpenEvent = js.native
  var pinch: SplitWindowPinchEvent = js.native
  var postlayout: SplitWindowPostlayoutEvent = js.native
  var singletap: SplitWindowSingletapEvent = js.native
  var swipe: SplitWindowSwipeEvent = js.native
  var touchcancel: SplitWindowTouchcancelEvent = js.native
  var touchend: SplitWindowTouchendEvent = js.native
  var touchmove: SplitWindowTouchmoveEvent = js.native
  var touchstart: SplitWindowTouchstartEvent = js.native
  var twofingertap: SplitWindowTwofingertapEvent = js.native
}

object SplitWindowEventMap {
  @scala.inline
  def apply(
    blur: SplitWindowBlurEvent,
    click: SplitWindowClickEvent,
    close: SplitWindowCloseEvent,
    dblclick: SplitWindowDblclickEvent,
    doubletap: SplitWindowDoubletapEvent,
    focus: SplitWindowFocusEvent,
    keypressed: SplitWindowKeypressedEvent,
    longpress: SplitWindowLongpressEvent,
    open: SplitWindowOpenEvent,
    pinch: SplitWindowPinchEvent,
    postlayout: SplitWindowPostlayoutEvent,
    singletap: SplitWindowSingletapEvent,
    swipe: SplitWindowSwipeEvent,
    touchcancel: SplitWindowTouchcancelEvent,
    touchend: SplitWindowTouchendEvent,
    touchmove: SplitWindowTouchmoveEvent,
    touchstart: SplitWindowTouchstartEvent,
    twofingertap: SplitWindowTwofingertapEvent
  ): SplitWindowEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitWindowEventMap]
  }
  @scala.inline
  implicit class SplitWindowEventMapOps[Self <: SplitWindowEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: SplitWindowBlurEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: SplitWindowClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: SplitWindowCloseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: SplitWindowDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: SplitWindowDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: SplitWindowFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: SplitWindowKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: SplitWindowLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: SplitWindowOpenEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: SplitWindowPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: SplitWindowPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: SplitWindowSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: SplitWindowSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: SplitWindowTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: SplitWindowTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: SplitWindowTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: SplitWindowTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: SplitWindowTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

