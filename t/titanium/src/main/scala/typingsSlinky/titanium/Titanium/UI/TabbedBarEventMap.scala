package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabbedBarEventMap extends ProxyEventMap {
  var click: TabbedBarClickEvent = js.native
  var dblclick: TabbedBarDblclickEvent = js.native
  var doubletap: TabbedBarDoubletapEvent = js.native
  var focus: TabbedBarFocusEvent = js.native
  var keypressed: TabbedBarKeypressedEvent = js.native
  var longclick: TabbedBarLongclickEvent = js.native
  var longpress: TabbedBarLongpressEvent = js.native
  var pinch: TabbedBarPinchEvent = js.native
  var postlayout: TabbedBarPostlayoutEvent = js.native
  var singletap: TabbedBarSingletapEvent = js.native
  var swipe: TabbedBarSwipeEvent = js.native
  var touchcancel: TabbedBarTouchcancelEvent = js.native
  var touchend: TabbedBarTouchendEvent = js.native
  var touchmove: TabbedBarTouchmoveEvent = js.native
  var touchstart: TabbedBarTouchstartEvent = js.native
  var twofingertap: TabbedBarTwofingertapEvent = js.native
}

object TabbedBarEventMap {
  @scala.inline
  def apply(
    click: TabbedBarClickEvent,
    dblclick: TabbedBarDblclickEvent,
    doubletap: TabbedBarDoubletapEvent,
    focus: TabbedBarFocusEvent,
    keypressed: TabbedBarKeypressedEvent,
    longclick: TabbedBarLongclickEvent,
    longpress: TabbedBarLongpressEvent,
    pinch: TabbedBarPinchEvent,
    postlayout: TabbedBarPostlayoutEvent,
    singletap: TabbedBarSingletapEvent,
    swipe: TabbedBarSwipeEvent,
    touchcancel: TabbedBarTouchcancelEvent,
    touchend: TabbedBarTouchendEvent,
    touchmove: TabbedBarTouchmoveEvent,
    touchstart: TabbedBarTouchstartEvent,
    twofingertap: TabbedBarTwofingertapEvent
  ): TabbedBarEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedBarEventMap]
  }
  @scala.inline
  implicit class TabbedBarEventMapOps[Self <: TabbedBarEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: TabbedBarClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: TabbedBarDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: TabbedBarDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: TabbedBarFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: TabbedBarKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: TabbedBarLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: TabbedBarLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: TabbedBarPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: TabbedBarPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: TabbedBarSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: TabbedBarSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: TabbedBarTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: TabbedBarTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: TabbedBarTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: TabbedBarTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: TabbedBarTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

