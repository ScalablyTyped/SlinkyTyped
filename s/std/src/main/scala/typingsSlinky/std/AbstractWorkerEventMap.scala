package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractWorkerEventMap extends StObject {
  
  var error: org.scalajs.dom.raw.ErrorEvent = js.native
}
object AbstractWorkerEventMap {
  
  @scala.inline
  def apply(error: org.scalajs.dom.raw.ErrorEvent): AbstractWorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractWorkerEventMap]
  }
  
  @scala.inline
  implicit class AbstractWorkerEventMapMutableBuilder[Self <: AbstractWorkerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
