package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewEventMap extends ProxyEventMap {
  var cancelprefetch: ListViewCancelprefetchEvent = js.native
  var click: ListViewClickEvent = js.native
  var dblclick: ListViewDblclickEvent = js.native
  var delete: ListViewDeleteEvent = js.native
  var doubletap: ListViewDoubletapEvent = js.native
  var dragend: ListViewDragendEvent = js.native
  var dragstart: ListViewDragstartEvent = js.native
  var editaction: ListViewEditactionEvent = js.native
  var focus: ListViewFocusEvent = js.native
  var indexclick: ListViewIndexclickEvent = js.native
  var insert: ListViewInsertEvent = js.native
  var itemclick: ListViewItemclickEvent = js.native
  var itemsselected: ListViewItemsselectedEvent = js.native
  var keypressed: ListViewKeypressedEvent = js.native
  var longclick: ListViewLongclickEvent = js.native
  var longpress: ListViewLongpressEvent = js.native
  var marker: ListViewMarkerEvent = js.native
  var move: ListViewMoveEvent = js.native
  var noresults: ListViewNoresultsEvent = js.native
  var pinch: ListViewPinchEvent = js.native
  var postlayout: ListViewPostlayoutEvent = js.native
  var prefetch: ListViewPrefetchEvent = js.native
  var pull: ListViewPullEvent = js.native
  var pullend: ListViewPullendEvent = js.native
  var scrollend: ListViewScrollendEvent = js.native
  var scrolling: ListViewScrollingEvent = js.native
  var scrollstart: ListViewScrollstartEvent = js.native
  var singletap: ListViewSingletapEvent = js.native
  var swipe: ListViewSwipeEvent = js.native
  var touchcancel: ListViewTouchcancelEvent = js.native
  var touchend: ListViewTouchendEvent = js.native
  var touchmove: ListViewTouchmoveEvent = js.native
  var touchstart: ListViewTouchstartEvent = js.native
  var twofingertap: ListViewTwofingertapEvent = js.native
}

object ListViewEventMap {
  @scala.inline
  def apply(
    cancelprefetch: ListViewCancelprefetchEvent,
    click: ListViewClickEvent,
    dblclick: ListViewDblclickEvent,
    delete: ListViewDeleteEvent,
    doubletap: ListViewDoubletapEvent,
    dragend: ListViewDragendEvent,
    dragstart: ListViewDragstartEvent,
    editaction: ListViewEditactionEvent,
    focus: ListViewFocusEvent,
    indexclick: ListViewIndexclickEvent,
    insert: ListViewInsertEvent,
    itemclick: ListViewItemclickEvent,
    itemsselected: ListViewItemsselectedEvent,
    keypressed: ListViewKeypressedEvent,
    longclick: ListViewLongclickEvent,
    longpress: ListViewLongpressEvent,
    marker: ListViewMarkerEvent,
    move: ListViewMoveEvent,
    noresults: ListViewNoresultsEvent,
    pinch: ListViewPinchEvent,
    postlayout: ListViewPostlayoutEvent,
    prefetch: ListViewPrefetchEvent,
    pull: ListViewPullEvent,
    pullend: ListViewPullendEvent,
    scrollend: ListViewScrollendEvent,
    scrolling: ListViewScrollingEvent,
    scrollstart: ListViewScrollstartEvent,
    singletap: ListViewSingletapEvent,
    swipe: ListViewSwipeEvent,
    touchcancel: ListViewTouchcancelEvent,
    touchend: ListViewTouchendEvent,
    touchmove: ListViewTouchmoveEvent,
    touchstart: ListViewTouchstartEvent,
    twofingertap: ListViewTwofingertapEvent
  ): ListViewEventMap = {
    val __obj = js.Dynamic.literal(cancelprefetch = cancelprefetch.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], editaction = editaction.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], indexclick = indexclick.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], itemclick = itemclick.asInstanceOf[js.Any], itemsselected = itemsselected.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], noresults = noresults.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], prefetch = prefetch.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], pullend = pullend.asInstanceOf[js.Any], scrollend = scrollend.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], scrollstart = scrollstart.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewEventMap]
  }
  @scala.inline
  implicit class ListViewEventMapOps[Self <: ListViewEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelprefetch(value: ListViewCancelprefetchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelprefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: ListViewClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: ListViewDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: ListViewDeleteEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: ListViewDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragend(value: ListViewDragendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragstart(value: ListViewDragstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditaction(value: ListViewEditactionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: ListViewFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexclick(value: ListViewIndexclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsert(value: ListViewInsertEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemclick(value: ListViewItemclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemsselected(value: ListViewItemsselectedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsselected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: ListViewKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: ListViewLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: ListViewLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarker(value: ListViewMarkerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove(value: ListViewMoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoresults(value: ListViewNoresultsEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noresults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: ListViewPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: ListViewPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefetch(value: ListViewPrefetchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull(value: ListViewPullEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullend(value: ListViewPullendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollend(value: ListViewScrollendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrolling(value: ListViewScrollingEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollstart(value: ListViewScrollstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: ListViewSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: ListViewSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: ListViewTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: ListViewTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: ListViewTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: ListViewTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: ListViewTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

