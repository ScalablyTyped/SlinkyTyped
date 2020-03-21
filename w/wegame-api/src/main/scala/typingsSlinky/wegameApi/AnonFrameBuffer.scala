package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrameBuffer extends js.Object {
  var frameBuffer: scala.scalajs.js.typedarray.ArrayBuffer
  var isLastFrame: Boolean
}

object AnonFrameBuffer {
  @scala.inline
  def apply(frameBuffer: scala.scalajs.js.typedarray.ArrayBuffer, isLastFrame: Boolean): AnonFrameBuffer = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFrameBuffer]
  }
}

