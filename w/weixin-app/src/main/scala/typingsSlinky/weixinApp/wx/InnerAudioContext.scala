package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InnerAudioContext extends js.Object {
  /** 是否自动开始播放，默认 false */
  var autoplay: Boolean = js.native
  /**  音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲 */
  val buffered: Double = js.native
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回，时间不取整，保留小数点后 6  */
  val currentTime: Double = js.native
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返 */
  val duration: Double = js.native
  /** 是否循环播放，默认 false */
  var loop: Boolean = js.native
  /** 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音，默认值 true */
  var obeyMuteSwitch: Boolean = js.native
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播 */
  val paused: Boolean = js.native
  /** 音频的数据链接，用于直接播放。 */
  var src: String = js.native
  /** 开始播放的位置（单位：s），默认 0 */
  var startTime: Double = js.native
  /** 销毁当前实例 */
  def destroy(): Unit = js.native
  /** 音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 音频完成 seek 操作事件 */
  def onSeeked(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 音频进行 seek 操作事件 */
  def onSeeking(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 音频播放进度更新事件 */
  def onTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 暂停 */
  def pause(): Unit = js.native
  /** 播放 */
  def play(): Unit = js.native
  /** 跳转到指定位置，单位 s */
  def seek(position: Double): Unit = js.native
  /** 停止 */
  def stop(): Unit = js.native
}

object InnerAudioContext {
  @scala.inline
  def apply(
    autoplay: Boolean,
    buffered: Double,
    currentTime: Double,
    destroy: () => Unit,
    duration: Double,
    loop: Boolean,
    obeyMuteSwitch: Boolean,
    onCanplay: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onEnded: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onError: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onPause: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onPlay: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onSeeked: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onSeeking: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onStop: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onTimeUpdate: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onWaiting: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    pause: () => Unit,
    paused: Boolean,
    play: () => Unit,
    seek: Double => Unit,
    src: String,
    startTime: Double,
    stop: () => Unit
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), duration = duration.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], obeyMuteSwitch = obeyMuteSwitch.asInstanceOf[js.Any], onCanplay = js.Any.fromFunction1(onCanplay), onEnded = js.Any.fromFunction1(onEnded), onError = js.Any.fromFunction1(onError), onPause = js.Any.fromFunction1(onPause), onPlay = js.Any.fromFunction1(onPlay), onSeeked = js.Any.fromFunction1(onSeeked), onSeeking = js.Any.fromFunction1(onSeeking), onStop = js.Any.fromFunction1(onStop), onTimeUpdate = js.Any.fromFunction1(onTimeUpdate), onWaiting = js.Any.fromFunction1(onWaiting), pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), src = src.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[InnerAudioContext]
  }
  @scala.inline
  implicit class InnerAudioContextOps[Self <: InnerAudioContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObeyMuteSwitch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obeyMuteSwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCanplay(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanplay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnEnded(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnError(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPause(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPlay(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSeeked(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSeeking(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStop(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTimeUpdate(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnWaiting(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSeek(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

