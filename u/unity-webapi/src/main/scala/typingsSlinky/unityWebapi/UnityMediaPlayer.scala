package typingsSlinky.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnityMediaPlayer extends js.Object {
  def getPlaybackstate(response: js.Function): js.Any = js.native
  def onNext(onNextCallback: js.Function): js.Any = js.native
  def onPlayPause(onPlayPauseCallback: js.Function): js.Any = js.native
  def onPrevious(onPreviousCallback: js.Function): js.Any = js.native
  def setCanGoNext(cangonext: Boolean): js.Any = js.native
  def setCanGoPrev(cangoprev: Boolean): js.Any = js.native
  def setCanPause(canpause: Boolean): js.Any = js.native
  def setCanPlay(canplay: Boolean): js.Any = js.native
  def setPlaybackstate(state: UnityPlaybackState): js.Any = js.native
  def setTrack(trackMetadata: UnityTrackMetadata): js.Any = js.native
}

object UnityMediaPlayer {
  @scala.inline
  def apply(
    getPlaybackstate: js.Function => js.Any,
    onNext: js.Function => js.Any,
    onPlayPause: js.Function => js.Any,
    onPrevious: js.Function => js.Any,
    setCanGoNext: Boolean => js.Any,
    setCanGoPrev: Boolean => js.Any,
    setCanPause: Boolean => js.Any,
    setCanPlay: Boolean => js.Any,
    setPlaybackstate: UnityPlaybackState => js.Any,
    setTrack: UnityTrackMetadata => js.Any
  ): UnityMediaPlayer = {
    val __obj = js.Dynamic.literal(getPlaybackstate = js.Any.fromFunction1(getPlaybackstate), onNext = js.Any.fromFunction1(onNext), onPlayPause = js.Any.fromFunction1(onPlayPause), onPrevious = js.Any.fromFunction1(onPrevious), setCanGoNext = js.Any.fromFunction1(setCanGoNext), setCanGoPrev = js.Any.fromFunction1(setCanGoPrev), setCanPause = js.Any.fromFunction1(setCanPause), setCanPlay = js.Any.fromFunction1(setCanPlay), setPlaybackstate = js.Any.fromFunction1(setPlaybackstate), setTrack = js.Any.fromFunction1(setTrack))
    __obj.asInstanceOf[UnityMediaPlayer]
  }
  @scala.inline
  implicit class UnityMediaPlayerOps[Self <: UnityMediaPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPlaybackstate(value: js.Function => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlaybackstate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNext(value: js.Function => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPlayPause(value: js.Function => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPrevious(value: js.Function => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevious")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCanGoNext(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCanGoNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCanGoPrev(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCanGoPrev")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCanPause(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCanPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCanPlay(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCanPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPlaybackstate(value: UnityPlaybackState => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPlaybackstate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTrack(value: UnityTrackMetadata => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTrack")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

