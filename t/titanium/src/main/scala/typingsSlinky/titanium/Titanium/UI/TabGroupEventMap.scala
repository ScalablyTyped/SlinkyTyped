package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabGroupEventMap extends ProxyEventMap {
  var androidback: TabGroupAndroidbackEvent = js.native
  var androidcamera: TabGroupAndroidcameraEvent = js.native
  var androidfocus: TabGroupAndroidfocusEvent = js.native
  var androidsearch: TabGroupAndroidsearchEvent = js.native
  var androidvoldown: TabGroupAndroidvoldownEvent = js.native
  var androidvolup: TabGroupAndroidvolupEvent = js.native
  var blur: TabGroupBlurEvent = js.native
  var click: TabGroupClickEvent = js.native
  var close: TabGroupCloseEvent = js.native
  var dblclick: TabGroupDblclickEvent = js.native
  var doubletap: TabGroupDoubletapEvent = js.native
  var focus: TabGroupFocusEvent = js.native
  var keypressed: TabGroupKeypressedEvent = js.native
  var longclick: TabGroupLongclickEvent = js.native
  var longpress: TabGroupLongpressEvent = js.native
  var open: TabGroupOpenEvent = js.native
  var pinch: TabGroupPinchEvent = js.native
  var postlayout: TabGroupPostlayoutEvent = js.native
  var singletap: TabGroupSingletapEvent = js.native
  var swipe: TabGroupSwipeEvent = js.native
  var touchcancel: TabGroupTouchcancelEvent = js.native
  var touchend: TabGroupTouchendEvent = js.native
  var touchmove: TabGroupTouchmoveEvent = js.native
  var touchstart: TabGroupTouchstartEvent = js.native
  var twofingertap: TabGroupTwofingertapEvent = js.native
}

object TabGroupEventMap {
  @scala.inline
  def apply(
    androidback: TabGroupAndroidbackEvent,
    androidcamera: TabGroupAndroidcameraEvent,
    androidfocus: TabGroupAndroidfocusEvent,
    androidsearch: TabGroupAndroidsearchEvent,
    androidvoldown: TabGroupAndroidvoldownEvent,
    androidvolup: TabGroupAndroidvolupEvent,
    blur: TabGroupBlurEvent,
    click: TabGroupClickEvent,
    close: TabGroupCloseEvent,
    dblclick: TabGroupDblclickEvent,
    doubletap: TabGroupDoubletapEvent,
    focus: TabGroupFocusEvent,
    keypressed: TabGroupKeypressedEvent,
    longclick: TabGroupLongclickEvent,
    longpress: TabGroupLongpressEvent,
    open: TabGroupOpenEvent,
    pinch: TabGroupPinchEvent,
    postlayout: TabGroupPostlayoutEvent,
    singletap: TabGroupSingletapEvent,
    swipe: TabGroupSwipeEvent,
    touchcancel: TabGroupTouchcancelEvent,
    touchend: TabGroupTouchendEvent,
    touchmove: TabGroupTouchmoveEvent,
    touchstart: TabGroupTouchstartEvent,
    twofingertap: TabGroupTwofingertapEvent
  ): TabGroupEventMap = {
    val __obj = js.Dynamic.literal(androidback = androidback.asInstanceOf[js.Any], androidcamera = androidcamera.asInstanceOf[js.Any], androidfocus = androidfocus.asInstanceOf[js.Any], androidsearch = androidsearch.asInstanceOf[js.Any], androidvoldown = androidvoldown.asInstanceOf[js.Any], androidvolup = androidvolup.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupEventMap]
  }
  @scala.inline
  implicit class TabGroupEventMapOps[Self <: TabGroupEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidback(value: TabGroupAndroidbackEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidcamera(value: TabGroupAndroidcameraEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidcamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidfocus(value: TabGroupAndroidfocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidfocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidsearch(value: TabGroupAndroidsearchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidsearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidvoldown(value: TabGroupAndroidvoldownEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidvoldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidvolup(value: TabGroupAndroidvolupEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidvolup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlur(value: TabGroupBlurEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: TabGroupClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: TabGroupCloseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: TabGroupDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: TabGroupDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: TabGroupFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: TabGroupKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: TabGroupLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: TabGroupLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: TabGroupOpenEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: TabGroupPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: TabGroupPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: TabGroupSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: TabGroupSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: TabGroupTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: TabGroupTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: TabGroupTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: TabGroupTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: TabGroupTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

