package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollableViewEventMap extends ProxyEventMap {
  var click: ScrollableViewClickEvent = js.native
  var dblclick: ScrollableViewDblclickEvent = js.native
  var doubletap: ScrollableViewDoubletapEvent = js.native
  var dragend: ScrollableViewDragendEvent = js.native
  var focus: ScrollableViewFocusEvent = js.native
  var keypressed: ScrollableViewKeypressedEvent = js.native
  var longclick: ScrollableViewLongclickEvent = js.native
  var longpress: ScrollableViewLongpressEvent = js.native
  var pinch: ScrollableViewPinchEvent = js.native
  var postlayout: ScrollableViewPostlayoutEvent = js.native
  var scroll: ScrollableViewScrollEvent = js.native
  var scrollend: ScrollableViewScrollendEvent = js.native
  var singletap: ScrollableViewSingletapEvent = js.native
  var swipe: ScrollableViewSwipeEvent = js.native
  var touchcancel: ScrollableViewTouchcancelEvent = js.native
  var touchend: ScrollableViewTouchendEvent = js.native
  var touchmove: ScrollableViewTouchmoveEvent = js.native
  var touchstart: ScrollableViewTouchstartEvent = js.native
  var twofingertap: ScrollableViewTwofingertapEvent = js.native
}

object ScrollableViewEventMap {
  @scala.inline
  def apply(
    click: ScrollableViewClickEvent,
    dblclick: ScrollableViewDblclickEvent,
    doubletap: ScrollableViewDoubletapEvent,
    dragend: ScrollableViewDragendEvent,
    focus: ScrollableViewFocusEvent,
    keypressed: ScrollableViewKeypressedEvent,
    longclick: ScrollableViewLongclickEvent,
    longpress: ScrollableViewLongpressEvent,
    pinch: ScrollableViewPinchEvent,
    postlayout: ScrollableViewPostlayoutEvent,
    scroll: ScrollableViewScrollEvent,
    scrollend: ScrollableViewScrollendEvent,
    singletap: ScrollableViewSingletapEvent,
    swipe: ScrollableViewSwipeEvent,
    touchcancel: ScrollableViewTouchcancelEvent,
    touchend: ScrollableViewTouchendEvent,
    touchmove: ScrollableViewTouchmoveEvent,
    touchstart: ScrollableViewTouchstartEvent,
    twofingertap: ScrollableViewTwofingertapEvent
  ): ScrollableViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollend = scrollend.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewEventMap]
  }
  @scala.inline
  implicit class ScrollableViewEventMapOps[Self <: ScrollableViewEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: ScrollableViewClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: ScrollableViewDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: ScrollableViewDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragend(value: ScrollableViewDragendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: ScrollableViewFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: ScrollableViewKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: ScrollableViewLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: ScrollableViewLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: ScrollableViewPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: ScrollableViewPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: ScrollableViewScrollEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollend(value: ScrollableViewScrollendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: ScrollableViewSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: ScrollableViewSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: ScrollableViewTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: ScrollableViewTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: ScrollableViewTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: ScrollableViewTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: ScrollableViewTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

