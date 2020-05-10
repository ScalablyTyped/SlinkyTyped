package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewEventMap extends ProxyEventMap {
  var beforeload: WebViewBeforeloadEvent = js.native
  var blacklisturl: WebViewBlacklisturlEvent = js.native
  var click: WebViewClickEvent = js.native
  var dblclick: WebViewDblclickEvent = js.native
  var doubletap: WebViewDoubletapEvent = js.native
  var error: WebViewErrorEvent = js.native
  var focus: WebViewFocusEvent = js.native
  var handleurl: WebViewHandleurlEvent = js.native
  var keypressed: WebViewKeypressedEvent = js.native
  var load: WebViewLoadEvent = js.native
  var longclick: WebViewLongclickEvent = js.native
  var longpress: WebViewLongpressEvent = js.native
  var message: WebViewMessageEvent = js.native
  var onLoadResource: WebViewOnLoadResourceEvent = js.native
  var pinch: WebViewPinchEvent = js.native
  var postlayout: WebViewPostlayoutEvent = js.native
  var progress: WebViewProgressEvent = js.native
  var redirect: WebViewRedirectEvent = js.native
  var singletap: WebViewSingletapEvent = js.native
  var sslerror: WebViewSslerrorEvent = js.native
  var swipe: WebViewSwipeEvent = js.native
  var touchcancel: WebViewTouchcancelEvent = js.native
  var touchend: WebViewTouchendEvent = js.native
  var touchmove: WebViewTouchmoveEvent = js.native
  var touchstart: WebViewTouchstartEvent = js.native
  var twofingertap: WebViewTwofingertapEvent = js.native
}

object WebViewEventMap {
  @scala.inline
  def apply(
    beforeload: WebViewBeforeloadEvent,
    blacklisturl: WebViewBlacklisturlEvent,
    click: WebViewClickEvent,
    dblclick: WebViewDblclickEvent,
    doubletap: WebViewDoubletapEvent,
    error: WebViewErrorEvent,
    focus: WebViewFocusEvent,
    handleurl: WebViewHandleurlEvent,
    keypressed: WebViewKeypressedEvent,
    load: WebViewLoadEvent,
    longclick: WebViewLongclickEvent,
    longpress: WebViewLongpressEvent,
    message: WebViewMessageEvent,
    onLoadResource: WebViewOnLoadResourceEvent,
    pinch: WebViewPinchEvent,
    postlayout: WebViewPostlayoutEvent,
    progress: WebViewProgressEvent,
    redirect: WebViewRedirectEvent,
    singletap: WebViewSingletapEvent,
    sslerror: WebViewSslerrorEvent,
    swipe: WebViewSwipeEvent,
    touchcancel: WebViewTouchcancelEvent,
    touchend: WebViewTouchendEvent,
    touchmove: WebViewTouchmoveEvent,
    touchstart: WebViewTouchstartEvent,
    twofingertap: WebViewTwofingertapEvent
  ): WebViewEventMap = {
    val __obj = js.Dynamic.literal(beforeload = beforeload.asInstanceOf[js.Any], blacklisturl = blacklisturl.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], handleurl = handleurl.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onLoadResource = onLoadResource.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], sslerror = sslerror.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewEventMap]
  }
  @scala.inline
  implicit class WebViewEventMapOps[Self <: WebViewEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeload(value: WebViewBeforeloadEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlacklisturl(value: WebViewBlacklisturlEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklisturl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: WebViewClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: WebViewDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: WebViewDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: WebViewErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: WebViewFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleurl(value: WebViewHandleurlEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleurl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: WebViewKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: WebViewLoadEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: WebViewLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: WebViewLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: WebViewMessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnLoadResource(value: WebViewOnLoadResourceEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: WebViewPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: WebViewPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: WebViewProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirect(value: WebViewRedirectEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: WebViewSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSslerror(value: WebViewSslerrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: WebViewSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: WebViewTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: WebViewTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: WebViewTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: WebViewTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: WebViewTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

