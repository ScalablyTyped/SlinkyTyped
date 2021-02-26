package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`0`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`1`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackgroundAudioPlayerStateSuccessCallbackResult extends StObject {
  
  /** 选定音频的播放位置（单位：s），只有在音乐播放中时返回 */
  var currentPosition: Double = js.native
  
  /** 歌曲数据链接，只有在音乐播放中时返回 */
  var dataUrl: String = js.native
  
  /** 音频的下载进度百分比，只有在音乐播放中时返回 */
  var downloadPercent: Double = js.native
  
  /** 选定音频的长度（单位：s），只有在音乐播放中时返回 */
  var duration: Double = js.native
  
  var errMsg: String = js.native
  
  /** 播放状态
    *
    * 可选值：
    * - 0: 暂停中;
    * - 1: 播放中;
    * - 2: 没有音乐播放; */
  var status: `0` | `1` | `2` = js.native
}
object GetBackgroundAudioPlayerStateSuccessCallbackResult {
  
  @scala.inline
  def apply(
    currentPosition: Double,
    dataUrl: String,
    downloadPercent: Double,
    duration: Double,
    errMsg: String,
    status: `0` | `1` | `2`
  ): GetBackgroundAudioPlayerStateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], dataUrl = dataUrl.asInstanceOf[js.Any], downloadPercent = downloadPercent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBackgroundAudioPlayerStateSuccessCallbackResultMutableBuilder[Self <: GetBackgroundAudioPlayerStateSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPosition(value: Double): Self = StObject.set(x, "currentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadPercent(value: Double): Self = StObject.set(x, "downloadPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `0` | `1` | `2`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
