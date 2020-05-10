package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollViewEventMap extends ProxyEventMap {
  var click: ScrollViewClickEvent = js.native
  var dblclick: ScrollViewDblclickEvent = js.native
  var doubletap: ScrollViewDoubletapEvent = js.native
  var dragEnd: ScrollView_DragEndEvent = js.native
  var dragStart: ScrollView_DragStartEvent = js.native
  var dragend: ScrollViewDragendEvent = js.native
  var dragstart: ScrollViewDragstartEvent = js.native
  var focus: ScrollViewFocusEvent = js.native
  var keypressed: ScrollViewKeypressedEvent = js.native
  var longclick: ScrollViewLongclickEvent = js.native
  var longpress: ScrollViewLongpressEvent = js.native
  var pinch: ScrollViewPinchEvent = js.native
  var postlayout: ScrollViewPostlayoutEvent = js.native
  var scale: ScrollViewScaleEvent = js.native
  var scroll: ScrollViewScrollEvent = js.native
  var singletap: ScrollViewSingletapEvent = js.native
  var swipe: ScrollViewSwipeEvent = js.native
  var touchcancel: ScrollViewTouchcancelEvent = js.native
  var touchend: ScrollViewTouchendEvent = js.native
  var touchmove: ScrollViewTouchmoveEvent = js.native
  var touchstart: ScrollViewTouchstartEvent = js.native
  var twofingertap: ScrollViewTwofingertapEvent = js.native
}

object ScrollViewEventMap {
  @scala.inline
  def apply(
    click: ScrollViewClickEvent,
    dblclick: ScrollViewDblclickEvent,
    doubletap: ScrollViewDoubletapEvent,
    dragEnd: ScrollView_DragEndEvent,
    dragStart: ScrollView_DragStartEvent,
    dragend: ScrollViewDragendEvent,
    dragstart: ScrollViewDragstartEvent,
    focus: ScrollViewFocusEvent,
    keypressed: ScrollViewKeypressedEvent,
    longclick: ScrollViewLongclickEvent,
    longpress: ScrollViewLongpressEvent,
    pinch: ScrollViewPinchEvent,
    postlayout: ScrollViewPostlayoutEvent,
    scale: ScrollViewScaleEvent,
    scroll: ScrollViewScrollEvent,
    singletap: ScrollViewSingletapEvent,
    swipe: ScrollViewSwipeEvent,
    touchcancel: ScrollViewTouchcancelEvent,
    touchend: ScrollViewTouchendEvent,
    touchmove: ScrollViewTouchmoveEvent,
    touchstart: ScrollViewTouchstartEvent,
    twofingertap: ScrollViewTwofingertapEvent
  ): ScrollViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragEnd = dragEnd.asInstanceOf[js.Any], dragStart = dragStart.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewEventMap]
  }
  @scala.inline
  implicit class ScrollViewEventMapOps[Self <: ScrollViewEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: ScrollViewClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: ScrollViewDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: ScrollViewDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragEnd(value: ScrollView_DragEndEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragStart(value: ScrollView_DragStartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: ScrollViewFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: ScrollViewKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: ScrollViewLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: ScrollViewLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: ScrollViewPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: ScrollViewPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: ScrollViewScaleEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: ScrollViewScrollEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: ScrollViewSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: ScrollViewSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: ScrollViewTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: ScrollViewTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: ScrollViewTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: ScrollViewTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: ScrollViewTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

