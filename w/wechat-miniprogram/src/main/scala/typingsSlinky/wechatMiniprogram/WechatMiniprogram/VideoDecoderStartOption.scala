package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoDecoderStartOption extends StObject {
  
  /** 解码模式。0：按 pts 解码；1：以最快速度解码 */
  var mode: js.UndefOr[Double] = js.native
  
  /** 需要解码的视频源文件。基础库 2.13.0 以下的版本只支持本地路径。 2.13.0 开始支持 http:// 和 https:// 协议的远程路径。 */
  var source: String = js.native
}
object VideoDecoderStartOption {
  
  @scala.inline
  def apply(source: String): VideoDecoderStartOption = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDecoderStartOption]
  }
  
  @scala.inline
  implicit class VideoDecoderStartOptionMutableBuilder[Self <: VideoDecoderStartOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
