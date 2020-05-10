package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withFrameBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLastFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLastFrame")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

