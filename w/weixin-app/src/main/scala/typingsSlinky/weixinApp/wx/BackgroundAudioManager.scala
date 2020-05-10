package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundAudioManager extends js.Object {
  /** 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲。 是 */
  var buffered: Double = js.native
  /** 封面图url，用于做原生音频播放器背景图。原生音频播放器中的分享功能，分享出去的卡片配图及背景也将使用该图。 */
  var coverImgUrl: String = js.native
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回 */
  val currentTime: Double = js.native
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返回 */
  val duration: Double = js.native
  /** 专辑名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var epname: String = js.native
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放 */
  val paused: Boolean = js.native
  /** 歌手名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var singer: String = js.native
  /** 音频的数据源，默认为空字符串，当设置了新的 src 时，会自动开始播放 ，目前支持的格式有 m4a, aac, mp3, wav */
  var src: String = js.native
  /** 音频开始播放的位置（单位：s） */
  var startTime: Double = js.native
  /** 音频标题，用于做原生音频播放器音频标题。原生音频播放器中的分享功能，分享出去的卡片标题，也将使用该值。 */
  var title: String = js.native
  /** 页面链接，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var webUrl: String = js.native
  /** 背景音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 背景音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 背景音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 用户在系统音乐播放面板点击下一曲事件（iOS only） */
  def onNext(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 背景音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 背景音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 用户在系统音乐播放面板点击上一曲事件（iOS only） */
  def onPrev(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 背景音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit = js.native
  /** 背景音频播放进度更新事件 */
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

object BackgroundAudioManager {
  @scala.inline
  def apply(
    buffered: Double,
    coverImgUrl: String,
    currentTime: Double,
    duration: Double,
    epname: String,
    onCanplay: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onEnded: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onError: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onNext: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onPause: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onPlay: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onPrev: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onStop: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onTimeUpdate: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onWaiting: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    pause: () => Unit,
    paused: Boolean,
    play: () => Unit,
    seek: Double => Unit,
    singer: String,
    src: String,
    startTime: Double,
    stop: () => Unit,
    title: String,
    webUrl: String
  ): BackgroundAudioManager = {
    val __obj = js.Dynamic.literal(buffered = buffered.asInstanceOf[js.Any], coverImgUrl = coverImgUrl.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], epname = epname.asInstanceOf[js.Any], onCanplay = js.Any.fromFunction1(onCanplay), onEnded = js.Any.fromFunction1(onEnded), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onPause = js.Any.fromFunction1(onPause), onPlay = js.Any.fromFunction1(onPlay), onPrev = js.Any.fromFunction1(onPrev), onStop = js.Any.fromFunction1(onStop), onTimeUpdate = js.Any.fromFunction1(onTimeUpdate), onWaiting = js.Any.fromFunction1(onWaiting), pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), singer = singer.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), title = title.asInstanceOf[js.Any], webUrl = webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioManager]
  }
  @scala.inline
  implicit class BackgroundAudioManagerOps[Self <: BackgroundAudioManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverImgUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverImgUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epname")(value.asInstanceOf[js.Any])
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
    def withOnNext(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction1(value))
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
    def withOnPrev(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(js.Any.fromFunction1(value))
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
    def withSinger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singer")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

