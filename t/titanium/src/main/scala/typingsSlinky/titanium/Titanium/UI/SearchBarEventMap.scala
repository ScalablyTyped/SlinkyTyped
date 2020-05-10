package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarEventMap extends ProxyEventMap {
  var blur: SearchBarBlurEvent = js.native
  var bookmark: SearchBarBookmarkEvent = js.native
  var cancel: SearchBarCancelEvent = js.native
  var change: SearchBarChangeEvent = js.native
  var click: SearchBarClickEvent = js.native
  var dblclick: SearchBarDblclickEvent = js.native
  var doubletap: SearchBarDoubletapEvent = js.native
  var focus: SearchBarFocusEvent = js.native
  var keypressed: SearchBarKeypressedEvent = js.native
  var longclick: SearchBarLongclickEvent = js.native
  var longpress: SearchBarLongpressEvent = js.native
  var pinch: SearchBarPinchEvent = js.native
  var postlayout: SearchBarPostlayoutEvent = js.native
  var `return`: SearchBarReturnEvent = js.native
  var singletap: SearchBarSingletapEvent = js.native
  var swipe: SearchBarSwipeEvent = js.native
  var touchcancel: SearchBarTouchcancelEvent = js.native
  var touchend: SearchBarTouchendEvent = js.native
  var touchmove: SearchBarTouchmoveEvent = js.native
  var touchstart: SearchBarTouchstartEvent = js.native
  var twofingertap: SearchBarTwofingertapEvent = js.native
}

object SearchBarEventMap {
  @scala.inline
  def apply(
    blur: SearchBarBlurEvent,
    bookmark: SearchBarBookmarkEvent,
    cancel: SearchBarCancelEvent,
    change: SearchBarChangeEvent,
    click: SearchBarClickEvent,
    dblclick: SearchBarDblclickEvent,
    doubletap: SearchBarDoubletapEvent,
    focus: SearchBarFocusEvent,
    keypressed: SearchBarKeypressedEvent,
    longclick: SearchBarLongclickEvent,
    longpress: SearchBarLongpressEvent,
    pinch: SearchBarPinchEvent,
    postlayout: SearchBarPostlayoutEvent,
    `return`: SearchBarReturnEvent,
    singletap: SearchBarSingletapEvent,
    swipe: SearchBarSwipeEvent,
    touchcancel: SearchBarTouchcancelEvent,
    touchend: SearchBarTouchendEvent,
    touchmove: SearchBarTouchmoveEvent,
    touchstart: SearchBarTouchstartEvent,
    twofingertap: SearchBarTwofingertapEvent
  ): SearchBarEventMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], bookmark = bookmark.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarEventMap]
  }
  @scala.inline
  implicit class SearchBarEventMapOps[Self <: SearchBarEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: SearchBarBlurEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBookmark(value: SearchBarBookmarkEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: SearchBarCancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChange(value: SearchBarChangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: SearchBarClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: SearchBarDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: SearchBarDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: SearchBarFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: SearchBarKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: SearchBarLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: SearchBarLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: SearchBarPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: SearchBarPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturn(value: SearchBarReturnEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: SearchBarSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: SearchBarSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: SearchBarTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: SearchBarTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: SearchBarTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: SearchBarTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: SearchBarTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

