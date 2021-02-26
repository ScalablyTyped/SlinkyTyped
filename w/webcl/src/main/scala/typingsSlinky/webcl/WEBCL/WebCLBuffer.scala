package typingsSlinky.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.6.1
@js.native
trait WebCLBuffer extends WebCLMemoryObject {
  
  def createSubBuffer(memFlags: MemFlagsBits, origin: Double, sizeInBytes: Double): WebCLBuffer = js.native
}
object WebCLBuffer {
  
  @scala.inline
  def apply(
    createSubBuffer: (MemFlagsBits, Double, Double) => WebCLBuffer,
    getInfo: MemInfo => js.Any,
    release: () => Unit
  ): WebCLBuffer = {
    val __obj = js.Dynamic.literal(createSubBuffer = js.Any.fromFunction3(createSubBuffer), getInfo = js.Any.fromFunction1(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLBuffer]
  }
  
  @scala.inline
  implicit class WebCLBufferMutableBuilder[Self <: WebCLBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateSubBuffer(value: (MemFlagsBits, Double, Double) => WebCLBuffer): Self = StObject.set(x, "createSubBuffer", js.Any.fromFunction3(value))
  }
}
