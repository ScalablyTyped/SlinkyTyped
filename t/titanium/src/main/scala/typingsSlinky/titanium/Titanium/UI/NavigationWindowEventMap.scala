package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationWindowEventMap extends ProxyEventMap {
  var androidback: NavigationWindowAndroidbackEvent = js.native
  var androidcamera: NavigationWindowAndroidcameraEvent = js.native
  var androidfocus: NavigationWindowAndroidfocusEvent = js.native
  var androidsearch: NavigationWindowAndroidsearchEvent = js.native
  var androidvoldown: NavigationWindowAndroidvoldownEvent = js.native
  var androidvolup: NavigationWindowAndroidvolupEvent = js.native
  var blur: NavigationWindowBlurEvent = js.native
  var click: NavigationWindowClickEvent = js.native
  var close: NavigationWindowCloseEvent = js.native
  var dblclick: NavigationWindowDblclickEvent = js.native
  var doubletap: NavigationWindowDoubletapEvent = js.native
  var focus: NavigationWindowFocusEvent = js.native
  var keypressed: NavigationWindowKeypressedEvent = js.native
  var longclick: NavigationWindowLongclickEvent = js.native
  var longpress: NavigationWindowLongpressEvent = js.native
  var open: NavigationWindowOpenEvent = js.native
  var pinch: NavigationWindowPinchEvent = js.native
  var postlayout: NavigationWindowPostlayoutEvent = js.native
  var singletap: NavigationWindowSingletapEvent = js.native
  var swipe: NavigationWindowSwipeEvent = js.native
  var touchcancel: NavigationWindowTouchcancelEvent = js.native
  var touchend: NavigationWindowTouchendEvent = js.native
  var touchmove: NavigationWindowTouchmoveEvent = js.native
  var touchstart: NavigationWindowTouchstartEvent = js.native
  var twofingertap: NavigationWindowTwofingertapEvent = js.native
}

object NavigationWindowEventMap {
  @scala.inline
  def apply(
    androidback: NavigationWindowAndroidbackEvent,
    androidcamera: NavigationWindowAndroidcameraEvent,
    androidfocus: NavigationWindowAndroidfocusEvent,
    androidsearch: NavigationWindowAndroidsearchEvent,
    androidvoldown: NavigationWindowAndroidvoldownEvent,
    androidvolup: NavigationWindowAndroidvolupEvent,
    blur: NavigationWindowBlurEvent,
    click: NavigationWindowClickEvent,
    close: NavigationWindowCloseEvent,
    dblclick: NavigationWindowDblclickEvent,
    doubletap: NavigationWindowDoubletapEvent,
    focus: NavigationWindowFocusEvent,
    keypressed: NavigationWindowKeypressedEvent,
    longclick: NavigationWindowLongclickEvent,
    longpress: NavigationWindowLongpressEvent,
    open: NavigationWindowOpenEvent,
    pinch: NavigationWindowPinchEvent,
    postlayout: NavigationWindowPostlayoutEvent,
    singletap: NavigationWindowSingletapEvent,
    swipe: NavigationWindowSwipeEvent,
    touchcancel: NavigationWindowTouchcancelEvent,
    touchend: NavigationWindowTouchendEvent,
    touchmove: NavigationWindowTouchmoveEvent,
    touchstart: NavigationWindowTouchstartEvent,
    twofingertap: NavigationWindowTwofingertapEvent
  ): NavigationWindowEventMap = {
    val __obj = js.Dynamic.literal(androidback = androidback.asInstanceOf[js.Any], androidcamera = androidcamera.asInstanceOf[js.Any], androidfocus = androidfocus.asInstanceOf[js.Any], androidsearch = androidsearch.asInstanceOf[js.Any], androidvoldown = androidvoldown.asInstanceOf[js.Any], androidvolup = androidvolup.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationWindowEventMap]
  }
  @scala.inline
  implicit class NavigationWindowEventMapOps[Self <: NavigationWindowEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidback(value: NavigationWindowAndroidbackEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidcamera(value: NavigationWindowAndroidcameraEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidcamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidfocus(value: NavigationWindowAndroidfocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidsearch(value: NavigationWindowAndroidsearchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidsearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidvoldown(value: NavigationWindowAndroidvoldownEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidvoldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidvolup(value: NavigationWindowAndroidvolupEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidvolup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlur(value: NavigationWindowBlurEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: NavigationWindowClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: NavigationWindowCloseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: NavigationWindowDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: NavigationWindowDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: NavigationWindowFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: NavigationWindowKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: NavigationWindowLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: NavigationWindowLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: NavigationWindowOpenEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: NavigationWindowPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: NavigationWindowPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: NavigationWindowSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: NavigationWindowSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: NavigationWindowTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: NavigationWindowTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: NavigationWindowTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: NavigationWindowTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: NavigationWindowTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

