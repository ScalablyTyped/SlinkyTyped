package typingsSlinky.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameBuffer extends js.Object {
  var frameBuffer: scala.scalajs.js.typedarray.ArrayBuffer
  var isLastFrame: Boolean
}

object Anon_FrameBuffer {
  @scala.inline
  def apply(frameBuffer: scala.scalajs.js.typedarray.ArrayBuffer, isLastFrame: Boolean): Anon_FrameBuffer = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FrameBuffer]
  }
}

