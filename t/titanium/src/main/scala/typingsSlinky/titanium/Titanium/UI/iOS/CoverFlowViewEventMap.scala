package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverFlowViewEventMap extends ProxyEventMap {
  var change: CoverFlowViewChangeEvent = js.native
  var click: CoverFlowViewClickEvent = js.native
  var dblclick: CoverFlowViewDblclickEvent = js.native
  var doubletap: CoverFlowViewDoubletapEvent = js.native
  var keypressed: CoverFlowViewKeypressedEvent = js.native
  var longpress: CoverFlowViewLongpressEvent = js.native
  var pinch: CoverFlowViewPinchEvent = js.native
  var postlayout: CoverFlowViewPostlayoutEvent = js.native
  var singletap: CoverFlowViewSingletapEvent = js.native
  var swipe: CoverFlowViewSwipeEvent = js.native
  var touchcancel: CoverFlowViewTouchcancelEvent = js.native
  var touchend: CoverFlowViewTouchendEvent = js.native
  var touchmove: CoverFlowViewTouchmoveEvent = js.native
  var touchstart: CoverFlowViewTouchstartEvent = js.native
  var twofingertap: CoverFlowViewTwofingertapEvent = js.native
}

object CoverFlowViewEventMap {
  @scala.inline
  def apply(
    change: CoverFlowViewChangeEvent,
    click: CoverFlowViewClickEvent,
    dblclick: CoverFlowViewDblclickEvent,
    doubletap: CoverFlowViewDoubletapEvent,
    keypressed: CoverFlowViewKeypressedEvent,
    longpress: CoverFlowViewLongpressEvent,
    pinch: CoverFlowViewPinchEvent,
    postlayout: CoverFlowViewPostlayoutEvent,
    singletap: CoverFlowViewSingletapEvent,
    swipe: CoverFlowViewSwipeEvent,
    touchcancel: CoverFlowViewTouchcancelEvent,
    touchend: CoverFlowViewTouchendEvent,
    touchmove: CoverFlowViewTouchmoveEvent,
    touchstart: CoverFlowViewTouchstartEvent,
    twofingertap: CoverFlowViewTwofingertapEvent
  ): CoverFlowViewEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowViewEventMap]
  }
  @scala.inline
  implicit class CoverFlowViewEventMapOps[Self <: CoverFlowViewEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: CoverFlowViewChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: CoverFlowViewClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: CoverFlowViewDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: CoverFlowViewDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: CoverFlowViewKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: CoverFlowViewLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: CoverFlowViewPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: CoverFlowViewPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: CoverFlowViewSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: CoverFlowViewSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: CoverFlowViewTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: CoverFlowViewTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: CoverFlowViewTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: CoverFlowViewTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: CoverFlowViewTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

