package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allowed ArrayBuffer types for the buffer of an ArrayBufferView and related Typed Arrays.
  */
@js.native
trait ArrayBufferTypes extends StObject {
  
  var ArrayBuffer: js.typedarray.ArrayBuffer = js.native
  
  var SharedArrayBuffer: typingsSlinky.std.SharedArrayBuffer = js.native
}
object ArrayBufferTypes {
  
  @scala.inline
  def apply(ArrayBuffer: js.typedarray.ArrayBuffer, SharedArrayBuffer: SharedArrayBuffer): ArrayBufferTypes = {
    val __obj = js.Dynamic.literal(ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any], SharedArrayBuffer = SharedArrayBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferTypes]
  }
  
  @scala.inline
  implicit class ArrayBufferTypesMutableBuilder[Self <: ArrayBufferTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "ArrayBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedArrayBuffer(value: SharedArrayBuffer): Self = StObject.set(x, "SharedArrayBuffer", value.asInstanceOf[js.Any])
  }
}
