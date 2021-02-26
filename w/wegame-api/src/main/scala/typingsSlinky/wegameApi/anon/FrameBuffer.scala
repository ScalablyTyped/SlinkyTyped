package typingsSlinky.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameBuffer extends StObject {
  
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
  implicit class FrameBufferMutableBuilder[Self <: FrameBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "frameBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLastFrame(value: Boolean): Self = StObject.set(x, "isLastFrame", value.asInstanceOf[js.Any])
  }
}
