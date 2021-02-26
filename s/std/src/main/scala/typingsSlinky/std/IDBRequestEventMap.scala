package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBRequestEventMap extends StObject {
  
  var error: org.scalajs.dom.raw.Event = js.native
  
  var success: org.scalajs.dom.raw.Event = js.native
}
object IDBRequestEventMap {
  
  @scala.inline
  def apply(error: org.scalajs.dom.raw.Event, success: org.scalajs.dom.raw.Event): IDBRequestEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBRequestEventMap]
  }
  
  @scala.inline
  implicit class IDBRequestEventMapMutableBuilder[Self <: IDBRequestEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
