package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceBufferEventMap extends StObject {
  
  var abort: org.scalajs.dom.raw.Event = js.native
  
  var error: org.scalajs.dom.raw.Event = js.native
  
  var update: org.scalajs.dom.raw.Event = js.native
  
  var updateend: org.scalajs.dom.raw.Event = js.native
  
  var updatestart: org.scalajs.dom.raw.Event = js.native
}
object SourceBufferEventMap {
  
  @scala.inline
  def apply(
    abort: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    update: org.scalajs.dom.raw.Event,
    updateend: org.scalajs.dom.raw.Event,
    updatestart: org.scalajs.dom.raw.Event
  ): SourceBufferEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateend = updateend.asInstanceOf[js.Any], updatestart = updatestart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferEventMap]
  }
  
  @scala.inline
  implicit class SourceBufferEventMapMutableBuilder[Self <: SourceBufferEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateend(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "updateend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatestart(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "updatestart", value.asInstanceOf[js.Any])
  }
}
