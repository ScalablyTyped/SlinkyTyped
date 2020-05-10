package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabEventMap extends ProxyEventMap {
  var click: TabClickEvent = js.native
  var dblclick: TabDblclickEvent = js.native
  var doubletap: TabDoubletapEvent = js.native
  var keypressed: TabKeypressedEvent = js.native
  var longclick: TabLongclickEvent = js.native
  var longpress: TabLongpressEvent = js.native
  var pinch: TabPinchEvent = js.native
  var postlayout: TabPostlayoutEvent = js.native
  var selected: TabSelectedEvent = js.native
  var singletap: TabSingletapEvent = js.native
  var swipe: TabSwipeEvent = js.native
  var touchcancel: TabTouchcancelEvent = js.native
  var touchend: TabTouchendEvent = js.native
  var touchmove: TabTouchmoveEvent = js.native
  var touchstart: TabTouchstartEvent = js.native
  var twofingertap: TabTwofingertapEvent = js.native
  var unselected: TabUnselectedEvent = js.native
}

object TabEventMap {
  @scala.inline
  def apply(
    click: TabClickEvent,
    dblclick: TabDblclickEvent,
    doubletap: TabDoubletapEvent,
    keypressed: TabKeypressedEvent,
    longclick: TabLongclickEvent,
    longpress: TabLongpressEvent,
    pinch: TabPinchEvent,
    postlayout: TabPostlayoutEvent,
    selected: TabSelectedEvent,
    singletap: TabSingletapEvent,
    swipe: TabSwipeEvent,
    touchcancel: TabTouchcancelEvent,
    touchend: TabTouchendEvent,
    touchmove: TabTouchmoveEvent,
    touchstart: TabTouchstartEvent,
    twofingertap: TabTwofingertapEvent,
    unselected: TabUnselectedEvent
  ): TabEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any], unselected = unselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabEventMap]
  }
  @scala.inline
  implicit class TabEventMapOps[Self <: TabEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: TabClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: TabDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: TabDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: TabKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: TabLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: TabLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: TabPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: TabPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: TabSelectedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: TabSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: TabSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: TabTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: TabTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: TabTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: TabTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: TabTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnselected(value: TabUnselectedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

