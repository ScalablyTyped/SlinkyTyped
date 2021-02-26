package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`down-mirrored`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`left-mirrored`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`right-mirrored`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`up-mirrored`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.down
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.left
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.right
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVideoInfoSuccessCallbackResult extends StObject {
  
  /** 视频码率，单位 kbps */
  var bitrate: Double = js.native
  
  /** 视频长度 */
  var duration: Double = js.native
  
  var errMsg: String = js.native
  
  /** 视频帧率 */
  var fps: Double = js.native
  
  /** 视频的长，单位 px */
  var height: Double = js.native
  
  /** 画面方向
    *
    * 可选值：
    * - 'up': 默认;
    * - 'down': 180度旋转;
    * - 'left': 逆时针旋转90度;
    * - 'right': 顺时针旋转90度;
    * - 'up-mirrored': 同up，但水平翻转;
    * - 'down-mirrored': 同down，但水平翻转;
    * - 'left-mirrored': 同left，但垂直翻转;
    * - 'right-mirrored': 同right，但垂直翻转; */
  var orientation: up | down | left | right | `up-mirrored` | `down-mirrored` | `left-mirrored` | `right-mirrored` = js.native
  
  /** 视频大小，单位 kB */
  var size: Double = js.native
  
  /** 视频格式 */
  var `type`: String = js.native
  
  /** 视频的宽，单位 px */
  var width: Double = js.native
}
object GetVideoInfoSuccessCallbackResult {
  
  @scala.inline
  def apply(
    bitrate: Double,
    duration: Double,
    errMsg: String,
    fps: Double,
    height: Double,
    orientation: up | down | left | right | `up-mirrored` | `down-mirrored` | `left-mirrored` | `right-mirrored`,
    size: Double,
    `type`: String,
    width: Double
  ): GetVideoInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVideoInfoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetVideoInfoSuccessCallbackResultMutableBuilder[Self <: GetVideoInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(
      value: up | down | left | right | `up-mirrored` | `down-mirrored` | `left-mirrored` | `right-mirrored`
    ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
