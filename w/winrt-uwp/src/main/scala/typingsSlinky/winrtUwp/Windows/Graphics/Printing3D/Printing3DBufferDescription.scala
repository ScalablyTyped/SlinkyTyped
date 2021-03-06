package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies how to parse data in the buffer. */
@js.native
trait Printing3DBufferDescription extends StObject {
  
  /** Specifies the format used by the buffer. */
  var format: Printing3DBufferFormat = js.native
  
  /** Specifies how far to move the pointer forward to find the next unit of data. */
  var stride: Double = js.native
}
object Printing3DBufferDescription {
  
  @scala.inline
  def apply(format: Printing3DBufferFormat, stride: Double): Printing3DBufferDescription = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DBufferDescription]
  }
  
  @scala.inline
  implicit class Printing3DBufferDescriptionMutableBuilder[Self <: Printing3DBufferDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: Printing3DBufferFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStride(value: Double): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
  }
}
