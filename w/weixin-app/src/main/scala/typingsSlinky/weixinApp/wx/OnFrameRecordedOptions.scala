package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnFrameRecordedOptions extends js.Object {
  
  /**  录音分片结果数据 */
  var frameBuffer: js.typedarray.ArrayBuffer = js.native
  
  /** 当前帧是否正常录音结束前的最后一帧 */
  var isLastFrame: Boolean = js.native
}
object OnFrameRecordedOptions {
  
  @scala.inline
  def apply(frameBuffer: js.typedarray.ArrayBuffer, isLastFrame: Boolean): OnFrameRecordedOptions = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFrameRecordedOptions]
  }
  
  @scala.inline
  implicit class OnFrameRecordedOptionsOps[Self <: OnFrameRecordedOptions] (val x: Self) extends AnyVal {
    
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
    def setFrameBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("frameBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLastFrame(value: Boolean): Self = this.set("isLastFrame", value.asInstanceOf[js.Any])
  }
}
