package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** InnerAudioContext 实例，可通过 [wx.createInnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createInnerAudioContext.html) 接口获取实例。
*
* **支持格式**
*
*
* | 格式 | iOS  | Android |
* | ---- | ---- | ------- |
* | flac | x    | √       |
* | m4a  | √    | √       |
* | ogg  | x    | √       |
* | ape  | x    | √       |
* | amr  | x    | √       |
* | wma  | x    | √       |
* | wav  | √    | √       |
* | mp3  | √    | √       |
* | mp4  | x    | √       |
* | aac  | √    | √       |
* | aiff | √    | x       |
* | caf  | √    | x       |
*
* **示例代码**
*
*
* ```js
const innerAudioContext = wx.createInnerAudioContext()
innerAudioContext.autoplay = true
innerAudioContext.src = 'http://ws.stream.qqmusic.qq.com/M500001VfvsJ21xFqb.mp3?guid=ffffffff82def4af4b12b3cd9337d5e7&uin=346897220&vkey=6292F51E1E384E061FF02C31F716658E5C81F5594D561F2E88B854E81CAAB7806D5E4F103E55D33C16F3FAC506D1AB172DE8600B37E43FAD&fromtag=46'
innerAudioContext.onPlay(() => {
  console.log('开始播放')
})
innerAudioContext.onError((res) => {
  console.log(res.errMsg)
  console.log(res.errCode)
})
``` */
@js.native
trait InnerAudioContext extends js.Object {
  
  /** 是否自动开始播放，默认为 `false` */
  var autoplay: Boolean = js.native
  
  /** 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲（只读） */
  var buffered: Double = js.native
  
  /** 当前音频的播放位置（单位 s）。只有在当前有合法的 src 时返回，时间保留小数点后 6 位（只读） */
  var currentTime: Double = js.native
  
  /** [InnerAudioContext.destroy()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.destroy.html)
    *
    * 销毁当前实例 */
  def destroy(): Unit = js.native
  
  /** 当前音频的长度（单位 s）。只有在当前有合法的 src 时返回（只读） */
  var duration: Double = js.native
  
  /** 是否循环播放，默认为 `false` */
  var loop: Boolean = js.native
  
  /** 是否遵循系统静音开关，默认为 `true`。当此参数为 `false` 时，即使用户打开了静音开关，也能继续发出声音。从 2.3.0 版本开始此参数不生效，使用 [wx.setInnerAudioOption](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.setInnerAudioOption.html) 接口统一设置。 */
  var obeyMuteSwitch: Boolean = js.native
  
  /** [InnerAudioContext.offCanplay(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.offCanplay.html)
    *
    * 取消监听音频进入可以播放状态的事件
    *
    * 最低基础库： `1.9.0` */
  def offCanplay(/** 音频进入可以播放状态的事件的回调函数 */
  callback: OffCanplayCallback): Unit = js.native
  
  /** [InnerAudioContext.offEnded(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.offEnded.html)
    *
    * 取消监听音频自然播放至结束的事件
    *
    * 最低基础库： `1.9.0` */
  def offEnded(/** 音频自然播放至结束的事件的回调函数 */
  callback: OffEndedCallback): Unit = js.native
  
  /** [InnerAudioContext.offError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.offError.html)
    *
    * 取消监听音频播放错误事件
    *
    * 最低基础库： `1.9.0` */
  def offError(/** 音频播放错误事件的回调函数 */
  callback: OffErrorCallback): Unit = js.native
  
  /** [InnerAudioContext.offPause(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.offPause.html)
    *
    * 取消监听音频暂停事件
    *
    * 最低基础库： `1.9.0` */
  def offPause(/** 音频暂停事件的回调函数 */
  callback: OffPauseCallback): Unit = js.native
  
  /** [InnerAudioContext.offPlay(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.offPlay.html)
    *
    * 取消监听音频播放事件
    *
    * 最低基础库： `1.9.0` */
  def offPlay(/** 音频播放事件的回调函数 */
  callback: OffPlayCallback): Unit = js.native
  
  /** [InnerAudioContext.offSeeked(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.offSeeked.html)
    *
    * 取消监听音频完成跳转操作的事件
    *
    * 最低基础库： `1.9.0` */
  def offSeeked(/** 音频完成跳转操作的事件的回调函数 */
  callback: OffSeekedCallback): Unit = js.native
  
  /** [InnerAudioContext.offSeeking(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.offSeeking.html)
    *
    * 取消监听音频进行跳转操作的事件
    *
    * 最低基础库： `1.9.0` */
  def offSeeking(/** 音频进行跳转操作的事件的回调函数 */
  callback: OffSeekingCallback): Unit = js.native
  
  /** [InnerAudioContext.offStop(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.offStop.html)
    *
    * 取消监听音频停止事件
    *
    * 最低基础库： `1.9.0` */
  def offStop(/** 音频停止事件的回调函数 */
  callback: OffStopCallback): Unit = js.native
  
  /** [InnerAudioContext.offTimeUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.offTimeUpdate.html)
    *
    * 取消监听音频播放进度更新事件
    *
    * 最低基础库： `1.9.0` */
  def offTimeUpdate(/** 音频播放进度更新事件的回调函数 */
  callback: OffTimeUpdateCallback): Unit = js.native
  
  /** [InnerAudioContext.offWaiting(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.offWaiting.html)
    *
    * 取消监听音频加载中事件
    *
    * 最低基础库： `1.9.0` */
  def offWaiting(/** 音频加载中事件的回调函数 */
  callback: OffWaitingCallback): Unit = js.native
  
  /** [InnerAudioContext.onCanplay(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.onCanplay.html)
    *
    * 监听音频进入可以播放状态的事件。但不保证后面可以流畅播放 */
  def onCanplay(/** 音频进入可以播放状态的事件的回调函数 */
  callback: OnCanplayCallback): Unit = js.native
  
  /** [InnerAudioContext.onEnded(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.onEnded.html)
    *
    * 监听音频自然播放至结束的事件 */
  def onEnded(/** 音频自然播放至结束的事件的回调函数 */
  callback: OnEndedCallback): Unit = js.native
  
  /** [InnerAudioContext.onError(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.onError.html)
    *
    * 监听音频播放错误事件 */
  def onError(/** 音频播放错误事件的回调函数 */
  callback: InnerAudioContextOnErrorCallback): Unit = js.native
  
  /** [InnerAudioContext.onPause(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.onPause.html)
    *
    * 监听音频暂停事件 */
  def onPause(/** 音频暂停事件的回调函数 */
  callback: OnPauseCallback): Unit = js.native
  
  /** [InnerAudioContext.onPlay(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.onPlay.html)
    *
    * 监听音频播放事件 */
  def onPlay(/** 音频播放事件的回调函数 */
  callback: OnPlayCallback): Unit = js.native
  
  /** [InnerAudioContext.onSeeked(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.onSeeked.html)
    *
    * 监听音频完成跳转操作的事件 */
  def onSeeked(/** 音频完成跳转操作的事件的回调函数 */
  callback: OnSeekedCallback): Unit = js.native
  
  /** [InnerAudioContext.onSeeking(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.onSeeking.html)
    *
    * 监听音频进行跳转操作的事件 */
  def onSeeking(/** 音频进行跳转操作的事件的回调函数 */
  callback: OnSeekingCallback): Unit = js.native
  
  /** [InnerAudioContext.onStop(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.onStop.html)
    *
    * 监听音频停止事件 */
  def onStop(/** 音频停止事件的回调函数 */
  callback: InnerAudioContextOnStopCallback): Unit = js.native
  
  /** [InnerAudioContext.onTimeUpdate(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.onTimeUpdate.html)
    *
    * 监听音频播放进度更新事件 */
  def onTimeUpdate(/** 音频播放进度更新事件的回调函数 */
  callback: OnTimeUpdateCallback): Unit = js.native
  
  /** [InnerAudioContext.onWaiting(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.onWaiting.html)
    *
    * 监听音频加载中事件。当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(/** 音频加载中事件的回调函数 */
  callback: OnWaitingCallback): Unit = js.native
  
  /** [InnerAudioContext.pause()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.pause.html)
    *
    * 暂停。暂停后的音频再播放会从暂停处开始播放 */
  def pause(): Unit = js.native
  
  /** 当前是是否暂停或停止状态（只读） */
  var paused: Boolean = js.native
  
  /** [InnerAudioContext.play()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.play.html)
    *
    * 播放 */
  def play(): Unit = js.native
  
  /** 播放速度。范围 0.5-2.0，默认为 1。（Android 需要 6 及以上版本）
    *
    * 最低基础库： `2.11.0` */
  var playbackRate: Double = js.native
  
  /** [InnerAudioContext.seek(number position)](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.seek.html)
    *
    * 跳转到指定位置 */
  def seek(/** 跳转的时间，单位 s。精确到小数点后 3 位，即支持 ms 级别精确度 */
  position: Double): Unit = js.native
  
  /** 音频资源的地址，用于直接播放。[2.2.3](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 开始支持云文件ID */
  var src: String = js.native
  
  /** 开始播放的位置（单位：s），默认为 0 */
  var startTime: Double = js.native
  
  /** [InnerAudioContext.stop()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.stop.html)
    *
    * 停止。停止后的音频再播放会从头开始播放。 */
  def stop(): Unit = js.native
  
  /** 音量。范围 0~1。默认为 1
    *
    * 最低基础库： `1.9.90` */
  var volume: Double = js.native
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
    offCanplay: OffCanplayCallback => Unit,
    offEnded: OffEndedCallback => Unit,
    offError: OffErrorCallback => Unit,
    offPause: OffPauseCallback => Unit,
    offPlay: OffPlayCallback => Unit,
    offSeeked: OffSeekedCallback => Unit,
    offSeeking: OffSeekingCallback => Unit,
    offStop: OffStopCallback => Unit,
    offTimeUpdate: OffTimeUpdateCallback => Unit,
    offWaiting: OffWaitingCallback => Unit,
    onCanplay: OnCanplayCallback => Unit,
    onEnded: OnEndedCallback => Unit,
    onError: InnerAudioContextOnErrorCallback => Unit,
    onPause: OnPauseCallback => Unit,
    onPlay: OnPlayCallback => Unit,
    onSeeked: OnSeekedCallback => Unit,
    onSeeking: OnSeekingCallback => Unit,
    onStop: InnerAudioContextOnStopCallback => Unit,
    onTimeUpdate: OnTimeUpdateCallback => Unit,
    onWaiting: OnWaitingCallback => Unit,
    pause: () => Unit,
    paused: Boolean,
    play: () => Unit,
    playbackRate: Double,
    seek: Double => Unit,
    src: String,
    startTime: Double,
    stop: () => Unit,
    volume: Double
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), duration = duration.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], obeyMuteSwitch = obeyMuteSwitch.asInstanceOf[js.Any], offCanplay = js.Any.fromFunction1(offCanplay), offEnded = js.Any.fromFunction1(offEnded), offError = js.Any.fromFunction1(offError), offPause = js.Any.fromFunction1(offPause), offPlay = js.Any.fromFunction1(offPlay), offSeeked = js.Any.fromFunction1(offSeeked), offSeeking = js.Any.fromFunction1(offSeeking), offStop = js.Any.fromFunction1(offStop), offTimeUpdate = js.Any.fromFunction1(offTimeUpdate), offWaiting = js.Any.fromFunction1(offWaiting), onCanplay = js.Any.fromFunction1(onCanplay), onEnded = js.Any.fromFunction1(onEnded), onError = js.Any.fromFunction1(onError), onPause = js.Any.fromFunction1(onPause), onPlay = js.Any.fromFunction1(onPlay), onSeeked = js.Any.fromFunction1(onSeeked), onSeeking = js.Any.fromFunction1(onSeeking), onStop = js.Any.fromFunction1(onStop), onTimeUpdate = js.Any.fromFunction1(onTimeUpdate), onWaiting = js.Any.fromFunction1(onWaiting), pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), playbackRate = playbackRate.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), src = src.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerAudioContext]
  }
  
  @scala.inline
  implicit class InnerAudioContextOps[Self <: InnerAudioContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffered(value: Double): Self = this.set("buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObeyMuteSwitch(value: Boolean): Self = this.set("obeyMuteSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffCanplay(value: OffCanplayCallback => Unit): Self = this.set("offCanplay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffEnded(value: OffEndedCallback => Unit): Self = this.set("offEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffError(value: OffErrorCallback => Unit): Self = this.set("offError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffPause(value: OffPauseCallback => Unit): Self = this.set("offPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffPlay(value: OffPlayCallback => Unit): Self = this.set("offPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffSeeked(value: OffSeekedCallback => Unit): Self = this.set("offSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffSeeking(value: OffSeekingCallback => Unit): Self = this.set("offSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffStop(value: OffStopCallback => Unit): Self = this.set("offStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffTimeUpdate(value: OffTimeUpdateCallback => Unit): Self = this.set("offTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffWaiting(value: OffWaitingCallback => Unit): Self = this.set("offWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanplay(value: OnCanplayCallback => Unit): Self = this.set("onCanplay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEnded(value: OnEndedCallback => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnError(value: InnerAudioContextOnErrorCallback => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPause(value: OnPauseCallback => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlay(value: OnPlayCallback => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeeked(value: OnSeekedCallback => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeeking(value: OnSeekingCallback => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStop(value: InnerAudioContextOnStopCallback => Unit): Self = this.set("onStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeUpdate(value: OnTimeUpdateCallback => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWaiting(value: OnWaitingCallback => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
