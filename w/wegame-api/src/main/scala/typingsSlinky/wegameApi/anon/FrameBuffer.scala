package typingsSlinky.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameBuffer extends js.Object {
  var frameBuffer: js.typedarray.ArrayBuffer
  var isLastFrame: Boolean
}

object FrameBuffer {
  @scala.inline
  def apply(frameBuffer: js.typedarray.ArrayBuffer, isLastFrame: Boolean): FrameBuffer = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameBuffer]
  }
}

