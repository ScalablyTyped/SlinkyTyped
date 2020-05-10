package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEventMap extends ProxyEventMap {
  var androidback: WindowAndroidbackEvent = js.native
  var androidcamera: WindowAndroidcameraEvent = js.native
  var androidfocus: WindowAndroidfocusEvent = js.native
  var androidsearch: WindowAndroidsearchEvent = js.native
  var androidvoldown: WindowAndroidvoldownEvent = js.native
  var androidvolup: WindowAndroidvolupEvent = js.native
  var blur: WindowBlurEvent = js.native
  var click: WindowClickEvent = js.native
  var close: WindowCloseEvent = js.native
  var dblclick: WindowDblclickEvent = js.native
  var doubletap: WindowDoubletapEvent = js.native
  var focus: WindowFocusEvent = js.native
  var keypressed: WindowKeypressedEvent = js.native
  var longclick: WindowLongclickEvent = js.native
  var longpress: WindowLongpressEvent = js.native
  var open: WindowOpenEvent = js.native
  var pinch: WindowPinchEvent = js.native
  var postlayout: WindowPostlayoutEvent = js.native
  var singletap: WindowSingletapEvent = js.native
  var swipe: WindowSwipeEvent = js.native
  var touchcancel: WindowTouchcancelEvent = js.native
  var touchend: WindowTouchendEvent = js.native
  var touchmove: WindowTouchmoveEvent = js.native
  var touchstart: WindowTouchstartEvent = js.native
  var twofingertap: WindowTwofingertapEvent = js.native
}

object WindowEventMap {
  @scala.inline
  def apply(
    androidback: WindowAndroidbackEvent,
    androidcamera: WindowAndroidcameraEvent,
    androidfocus: WindowAndroidfocusEvent,
    androidsearch: WindowAndroidsearchEvent,
    androidvoldown: WindowAndroidvoldownEvent,
    androidvolup: WindowAndroidvolupEvent,
    blur: WindowBlurEvent,
    click: WindowClickEvent,
    close: WindowCloseEvent,
    dblclick: WindowDblclickEvent,
    doubletap: WindowDoubletapEvent,
    focus: WindowFocusEvent,
    keypressed: WindowKeypressedEvent,
    longclick: WindowLongclickEvent,
    longpress: WindowLongpressEvent,
    open: WindowOpenEvent,
    pinch: WindowPinchEvent,
    postlayout: WindowPostlayoutEvent,
    singletap: WindowSingletapEvent,
    swipe: WindowSwipeEvent,
    touchcancel: WindowTouchcancelEvent,
    touchend: WindowTouchendEvent,
    touchmove: WindowTouchmoveEvent,
    touchstart: WindowTouchstartEvent,
    twofingertap: WindowTwofingertapEvent
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(androidback = androidback.asInstanceOf[js.Any], androidcamera = androidcamera.asInstanceOf[js.Any], androidfocus = androidfocus.asInstanceOf[js.Any], androidsearch = androidsearch.asInstanceOf[js.Any], androidvoldown = androidvoldown.asInstanceOf[js.Any], androidvolup = androidvolup.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMap]
  }
  @scala.inline
  implicit class WindowEventMapOps[Self <: WindowEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidback(value: WindowAndroidbackEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidcamera(value: WindowAndroidcameraEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidcamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidfocus(value: WindowAndroidfocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidsearch(value: WindowAndroidsearchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidsearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidvoldown(value: WindowAndroidvoldownEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidvoldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidvolup(value: WindowAndroidvolupEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidvolup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlur(value: WindowBlurEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: WindowClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: WindowCloseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: WindowDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: WindowDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: WindowFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: WindowKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: WindowLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: WindowLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: WindowOpenEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: WindowPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: WindowPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: WindowSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: WindowSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: WindowTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: WindowTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: WindowTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: WindowTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: WindowTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

