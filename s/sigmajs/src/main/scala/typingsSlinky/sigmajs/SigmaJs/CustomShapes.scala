package typingsSlinky.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomShapes extends StObject {
  
  def init(sigma: Sigma): Unit = js.native
}
object CustomShapes {
  
  @scala.inline
  def apply(init: Sigma => Unit): CustomShapes = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CustomShapes]
  }
  
  @scala.inline
  implicit class CustomShapesMutableBuilder[Self <: CustomShapes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: Sigma => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
  }
}
