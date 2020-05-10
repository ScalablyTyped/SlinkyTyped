package typingsSlinky.titanium.Titanium.UI.Android

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerLayoutEventMap extends ProxyEventMap {
  var change: DrawerLayoutChangeEvent = js.native
  var click: DrawerLayoutClickEvent = js.native
  var close: DrawerLayoutCloseEvent = js.native
  var dblclick: DrawerLayoutDblclickEvent = js.native
  var doubletap: DrawerLayoutDoubletapEvent = js.native
  var focus: DrawerLayoutFocusEvent = js.native
  var keypressed: DrawerLayoutKeypressedEvent = js.native
  var longclick: DrawerLayoutLongclickEvent = js.native
  var longpress: DrawerLayoutLongpressEvent = js.native
  var open: DrawerLayoutOpenEvent = js.native
  var pinch: DrawerLayoutPinchEvent = js.native
  var postlayout: DrawerLayoutPostlayoutEvent = js.native
  var singletap: DrawerLayoutSingletapEvent = js.native
  var slide: DrawerLayoutSlideEvent = js.native
  var swipe: DrawerLayoutSwipeEvent = js.native
  var touchcancel: DrawerLayoutTouchcancelEvent = js.native
  var touchend: DrawerLayoutTouchendEvent = js.native
  var touchmove: DrawerLayoutTouchmoveEvent = js.native
  var touchstart: DrawerLayoutTouchstartEvent = js.native
  var twofingertap: DrawerLayoutTwofingertapEvent = js.native
}

object DrawerLayoutEventMap {
  @scala.inline
  def apply(
    change: DrawerLayoutChangeEvent,
    click: DrawerLayoutClickEvent,
    close: DrawerLayoutCloseEvent,
    dblclick: DrawerLayoutDblclickEvent,
    doubletap: DrawerLayoutDoubletapEvent,
    focus: DrawerLayoutFocusEvent,
    keypressed: DrawerLayoutKeypressedEvent,
    longclick: DrawerLayoutLongclickEvent,
    longpress: DrawerLayoutLongpressEvent,
    open: DrawerLayoutOpenEvent,
    pinch: DrawerLayoutPinchEvent,
    postlayout: DrawerLayoutPostlayoutEvent,
    singletap: DrawerLayoutSingletapEvent,
    slide: DrawerLayoutSlideEvent,
    swipe: DrawerLayoutSwipeEvent,
    touchcancel: DrawerLayoutTouchcancelEvent,
    touchend: DrawerLayoutTouchendEvent,
    touchmove: DrawerLayoutTouchmoveEvent,
    touchstart: DrawerLayoutTouchstartEvent,
    twofingertap: DrawerLayoutTwofingertapEvent
  ): DrawerLayoutEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], slide = slide.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutEventMap]
  }
  @scala.inline
  implicit class DrawerLayoutEventMapOps[Self <: DrawerLayoutEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: DrawerLayoutChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: DrawerLayoutClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: DrawerLayoutCloseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: DrawerLayoutDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: DrawerLayoutDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: DrawerLayoutFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: DrawerLayoutKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: DrawerLayoutLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: DrawerLayoutLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: DrawerLayoutOpenEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: DrawerLayoutPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: DrawerLayoutPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: DrawerLayoutSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlide(value: DrawerLayoutSlideEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: DrawerLayoutSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: DrawerLayoutTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: DrawerLayoutTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: DrawerLayoutTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: DrawerLayoutTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: DrawerLayoutTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

