package typingsSlinky.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameBuffer extends js.Object {
  var frameBuffer: js.typedarray.ArrayBuffer = js.native
  var isLastFrame: Boolean = js.native
}

object FrameBuffer {
  @scala.inline
  def apply(frameBuffer: js.typedarray.ArrayBuffer, isLastFrame: Boolean): FrameBuffer = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameBuffer]
  }
  @scala.inline
  implicit class FrameBufferOps[Self <: FrameBuffer] (val x: Self) extends AnyVal {
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

