package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBTransactionEventMap extends StObject {
  
  var abort: org.scalajs.dom.raw.Event = js.native
  
  var complete: org.scalajs.dom.raw.Event = js.native
  
  var error: org.scalajs.dom.raw.Event = js.native
}
object IDBTransactionEventMap {
  
  @scala.inline
  def apply(
    abort: org.scalajs.dom.raw.Event,
    complete: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event
  ): IDBTransactionEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBTransactionEventMap]
  }
  
  @scala.inline
  implicit class IDBTransactionEventMapMutableBuilder[Self <: IDBTransactionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
