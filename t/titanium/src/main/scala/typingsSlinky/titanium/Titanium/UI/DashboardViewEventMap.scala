package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardViewEventMap extends ProxyEventMap {
  var click: DashboardViewClickEvent = js.native
  var commit: DashboardViewCommitEvent = js.native
  var dblclick: DashboardViewDblclickEvent = js.native
  var delete: DashboardViewDeleteEvent = js.native
  var doubletap: DashboardViewDoubletapEvent = js.native
  var dragend: DashboardViewDragendEvent = js.native
  var dragstart: DashboardViewDragstartEvent = js.native
  var edit: DashboardViewEditEvent = js.native
  var keypressed: DashboardViewKeypressedEvent = js.native
  var longpress: DashboardViewLongpressEvent = js.native
  var move: DashboardViewMoveEvent = js.native
  var pagechanged: DashboardViewPagechangedEvent = js.native
  var pinch: DashboardViewPinchEvent = js.native
  var postlayout: DashboardViewPostlayoutEvent = js.native
  var singletap: DashboardViewSingletapEvent = js.native
  var swipe: DashboardViewSwipeEvent = js.native
  var touchcancel: DashboardViewTouchcancelEvent = js.native
  var touchend: DashboardViewTouchendEvent = js.native
  var touchmove: DashboardViewTouchmoveEvent = js.native
  var touchstart: DashboardViewTouchstartEvent = js.native
  var twofingertap: DashboardViewTwofingertapEvent = js.native
}

object DashboardViewEventMap {
  @scala.inline
  def apply(
    click: DashboardViewClickEvent,
    commit: DashboardViewCommitEvent,
    dblclick: DashboardViewDblclickEvent,
    delete: DashboardViewDeleteEvent,
    doubletap: DashboardViewDoubletapEvent,
    dragend: DashboardViewDragendEvent,
    dragstart: DashboardViewDragstartEvent,
    edit: DashboardViewEditEvent,
    keypressed: DashboardViewKeypressedEvent,
    longpress: DashboardViewLongpressEvent,
    move: DashboardViewMoveEvent,
    pagechanged: DashboardViewPagechangedEvent,
    pinch: DashboardViewPinchEvent,
    postlayout: DashboardViewPostlayoutEvent,
    singletap: DashboardViewSingletapEvent,
    swipe: DashboardViewSwipeEvent,
    touchcancel: DashboardViewTouchcancelEvent,
    touchend: DashboardViewTouchendEvent,
    touchmove: DashboardViewTouchmoveEvent,
    touchstart: DashboardViewTouchstartEvent,
    twofingertap: DashboardViewTwofingertapEvent
  ): DashboardViewEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], pagechanged = pagechanged.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewEventMap]
  }
  @scala.inline
  implicit class DashboardViewEventMapOps[Self <: DashboardViewEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: DashboardViewClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: DashboardViewCommitEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: DashboardViewDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: DashboardViewDeleteEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: DashboardViewDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragend(value: DashboardViewDragendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragstart(value: DashboardViewDragstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit(value: DashboardViewEditEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: DashboardViewKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: DashboardViewLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMove(value: DashboardViewMoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagechanged(value: DashboardViewPagechangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagechanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: DashboardViewPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: DashboardViewPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: DashboardViewSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: DashboardViewSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: DashboardViewTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: DashboardViewTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: DashboardViewTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: DashboardViewTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: DashboardViewTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

