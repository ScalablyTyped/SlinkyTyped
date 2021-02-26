package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An opaque object describing a gradient. It is returned by the methods CanvasRenderingContext2D.createLinearGradient() or CanvasRenderingContext2D.createRadialGradient(). */
@js.native
trait CanvasGradient extends StObject {
  
  /**
    * Adds a color stop with the given color to the gradient at the given offset. 0.0 is the offset at one end of the gradient, 1.0 is the offset at the other end.
    * 
    * Throws an "IndexSizeError" DOMException if the offset is out of range. Throws a "SyntaxError" DOMException if the color cannot be parsed.
    */
  def addColorStop(offset: Double, color: java.lang.String): Unit = js.native
}
object CanvasGradient {
  
  @scala.inline
  def apply(addColorStop: (Double, java.lang.String) => Unit): org.scalajs.dom.raw.CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.asInstanceOf[org.scalajs.dom.raw.CanvasGradient]
  }
  
  @scala.inline
  implicit class CanvasGradientMutableBuilder[Self <: org.scalajs.dom.raw.CanvasGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddColorStop(value: (Double, java.lang.String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
  }
}
