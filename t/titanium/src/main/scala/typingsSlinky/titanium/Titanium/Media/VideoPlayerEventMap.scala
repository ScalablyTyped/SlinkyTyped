package typingsSlinky.titanium.Titanium.Media

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPlayerEventMap extends ProxyEventMap {
  var click: VideoPlayerClickEvent = js.native
  var complete: VideoPlayerCompleteEvent = js.native
  var dblclick: VideoPlayerDblclickEvent = js.native
  var doubletap: VideoPlayerDoubletapEvent = js.native
  var durationavailable: VideoPlayerDurationavailableEvent = js.native
  var error: VideoPlayerErrorEvent = js.native
  var focus: VideoPlayerFocusEvent = js.native
  var keypressed: VideoPlayerKeypressedEvent = js.native
  var load: VideoPlayerLoadEvent = js.native
  var loadstate: VideoPlayerLoadstateEvent = js.native
  var longclick: VideoPlayerLongclickEvent = js.native
  var longpress: VideoPlayerLongpressEvent = js.native
  var naturalsizeavailable: VideoPlayerNaturalsizeavailableEvent = js.native
  var pinch: VideoPlayerPinchEvent = js.native
  var playbackstate: VideoPlayerPlaybackstateEvent = js.native
  var playing: VideoPlayerPlayingEvent = js.native
  var postlayout: VideoPlayerPostlayoutEvent = js.native
  var preload: VideoPlayerPreloadEvent = js.native
  var resize: VideoPlayerResizeEvent = js.native
  var singletap: VideoPlayerSingletapEvent = js.native
  var swipe: VideoPlayerSwipeEvent = js.native
  var touchcancel: VideoPlayerTouchcancelEvent = js.native
  var touchend: VideoPlayerTouchendEvent = js.native
  var touchmove: VideoPlayerTouchmoveEvent = js.native
  var touchstart: VideoPlayerTouchstartEvent = js.native
  var twofingertap: VideoPlayerTwofingertapEvent = js.native
}

object VideoPlayerEventMap {
  @scala.inline
  def apply(
    click: VideoPlayerClickEvent,
    complete: VideoPlayerCompleteEvent,
    dblclick: VideoPlayerDblclickEvent,
    doubletap: VideoPlayerDoubletapEvent,
    durationavailable: VideoPlayerDurationavailableEvent,
    error: VideoPlayerErrorEvent,
    focus: VideoPlayerFocusEvent,
    keypressed: VideoPlayerKeypressedEvent,
    load: VideoPlayerLoadEvent,
    loadstate: VideoPlayerLoadstateEvent,
    longclick: VideoPlayerLongclickEvent,
    longpress: VideoPlayerLongpressEvent,
    naturalsizeavailable: VideoPlayerNaturalsizeavailableEvent,
    pinch: VideoPlayerPinchEvent,
    playbackstate: VideoPlayerPlaybackstateEvent,
    playing: VideoPlayerPlayingEvent,
    postlayout: VideoPlayerPostlayoutEvent,
    preload: VideoPlayerPreloadEvent,
    resize: VideoPlayerResizeEvent,
    singletap: VideoPlayerSingletapEvent,
    swipe: VideoPlayerSwipeEvent,
    touchcancel: VideoPlayerTouchcancelEvent,
    touchend: VideoPlayerTouchendEvent,
    touchmove: VideoPlayerTouchmoveEvent,
    touchstart: VideoPlayerTouchstartEvent,
    twofingertap: VideoPlayerTwofingertapEvent
  ): VideoPlayerEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], durationavailable = durationavailable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadstate = loadstate.asInstanceOf[js.Any], longclick = longclick.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], naturalsizeavailable = naturalsizeavailable.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], playbackstate = playbackstate.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerEventMap]
  }
  @scala.inline
  implicit class VideoPlayerEventMapOps[Self <: VideoPlayerEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: VideoPlayerClickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: VideoPlayerCompleteEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: VideoPlayerDblclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubletap(value: VideoPlayerDoubletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationavailable(value: VideoPlayerDurationavailableEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: VideoPlayerErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: VideoPlayerFocusEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypressed(value: VideoPlayerKeypressedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: VideoPlayerLoadEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadstate(value: VideoPlayerLoadstateEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongclick(value: VideoPlayerLongclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongpress(value: VideoPlayerLongpressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNaturalsizeavailable(value: VideoPlayerNaturalsizeavailableEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naturalsizeavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinch(value: VideoPlayerPinchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaybackstate(value: VideoPlayerPlaybackstateEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaying(value: VideoPlayerPlayingEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostlayout(value: VideoPlayerPostlayoutEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postlayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreload(value: VideoPlayerPreloadEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: VideoPlayerResizeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: VideoPlayerSingletapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: VideoPlayerSwipeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchcancel(value: VideoPlayerTouchcancelEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchend(value: VideoPlayerTouchendEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchmove(value: VideoPlayerTouchmoveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchstart(value: VideoPlayerTouchstartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwofingertap(value: VideoPlayerTwofingertapEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twofingertap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

