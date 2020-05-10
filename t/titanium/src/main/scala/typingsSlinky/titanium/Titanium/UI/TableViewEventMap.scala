package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableViewEventMap extends ProxyEventMap {
  var click: TableViewClickEvent = js.native
  var dblclick: TableViewDblclickEvent = js.native
  var delete: TableViewDeleteEvent = js.native
  var doubletap: TableViewDoubletapEvent = js.native
  var dragend: TableViewDragendEvent = js.native
  var dragstart: TableViewDragstartEvent = js.native
  var focus: TableViewFocusEvent = js.native
  var indexclick: TableViewIndexclickEvent = js.native
  var keypressed: TableViewKeypressedEvent = js.native
  var longclick: TableViewLongclickEvent = js.native
  var longpress: TableViewLongpressEvent = js.native
  var move: TableViewMoveEvent = js.native
  var pinch: TableViewPinchEvent = js.native
  var postlayout: TableViewPostlayoutEvent = js.native
  var rowsselected: TableViewRowsselectedEvent = js.native
  var scroll: TableViewScrollEvent = js.native
  var scrollend: TableViewScrollendEvent = js.native
  var singletap: TableViewSingletapEvent = js.native
  var swipe: TableViewSwipeEvent = js.native
  var touchcancel: TableViewTouchcancelEvent = js.native
  var touchend: TableViewTouchendEvent = js.native
  var touchmove: TableViewTouchmoveEvent = js.native
  var touchstart: TableViewTouchstartEvent = js.native
  var twofingertap: TableViewTwofingertapEvent = js.native
}

object TableViewEventMap {
  @scala.inline
  def apply(
    click: TableViewClickEvent,
    dblclick: TableViewDblclickEvent,
    delete: TableViewDeleteEvent,
    doubletap: TableViewDoubletapEvent,
    dragend: TableViewDragendEvent,
    dragstart: TableViewDragstartEvent,
    focus: TableViewFocusEvent,
    indexclick: TableViewIndexclickEvent,
    keypressed: TableViewKeypressedEvent,
    longclick: TableViewLongclickEvent,
    longpress: TableViewLongpressEvent,
    move: TableViewMoveEvent,
    pinch: TableViewPinchEvent,
    postlayout: TableViewPostlayoutEvent,
    rowsselected: TableViewRowsselectedEvent,
    scroll: TableViewScrollEvent,
    scrollend: TableViewScrollendEvent,
    singletap: TableViewSingletapEvent,
    swipe: TableViewSwipeEvent,
    touchcancel: TableViewTouchcancelEvent,
    touchend: TableViewTouchendEvent,
    touchmove: TableViewTouchmoveEvent,
    touchstart: TableViewTouchstartEvent,
    twofingertap: TableViewTwofingertapEvent
  ): TableViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], indexclick = indexclick.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], rowsselected = rowsselected.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollend = scrollend.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewEventMap]
  }
  @scala.inline
  implicit class TableViewEventMapOps[Self <: TableViewEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: TableViewClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: TableViewDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: TableViewDeleteEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: TableViewDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragend(value: TableViewDragendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragstart(value: TableViewDragstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: TableViewFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexclick(value: TableViewIndexclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: TableViewKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: TableViewLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: TableViewLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove(value: TableViewMoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: TableViewPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: TableViewPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsselected(value: TableViewRowsselectedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsselected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: TableViewScrollEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollend(value: TableViewScrollendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: TableViewSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: TableViewSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: TableViewTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: TableViewTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: TableViewTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: TableViewTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: TableViewTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

