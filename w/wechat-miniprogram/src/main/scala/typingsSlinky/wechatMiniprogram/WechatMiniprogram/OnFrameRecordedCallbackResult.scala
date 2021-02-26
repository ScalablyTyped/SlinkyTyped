package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnFrameRecordedCallbackResult extends StObject {
  
  /** 录音分片数据 */
  var frameBuffer: js.typedarray.ArrayBuffer = js.native
  
  /** 当前帧是否正常录音结束前的最后一帧 */
  var isLastFrame: Boolean = js.native
}
object OnFrameRecordedCallbackResult {
  
  @scala.inline
  def apply(frameBuffer: js.typedarray.ArrayBuffer, isLastFrame: Boolean): OnFrameRecordedCallbackResult = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFrameRecordedCallbackResult]
  }
  
  @scala.inline
  implicit class OnFrameRecordedCallbackResultMutableBuilder[Self <: OnFrameRecordedCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "frameBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLastFrame(value: Boolean): Self = StObject.set(x, "isLastFrame", value.asInstanceOf[js.Any])
  }
}
