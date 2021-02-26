package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioWorkletNodeEventMap extends StObject {
  
  var processorerror: org.scalajs.dom.raw.Event = js.native
}
object AudioWorkletNodeEventMap {
  
  @scala.inline
  def apply(processorerror: org.scalajs.dom.raw.Event): AudioWorkletNodeEventMap = {
    val __obj = js.Dynamic.literal(processorerror = processorerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioWorkletNodeEventMap]
  }
  
  @scala.inline
  implicit class AudioWorkletNodeEventMapMutableBuilder[Self <: AudioWorkletNodeEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessorerror(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "processorerror", value.asInstanceOf[js.Any])
  }
}
