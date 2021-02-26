package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioScheduledSourceNodeEventMap extends StObject {
  
  var ended: org.scalajs.dom.raw.Event = js.native
}
object AudioScheduledSourceNodeEventMap {
  
  @scala.inline
  def apply(ended: org.scalajs.dom.raw.Event): AudioScheduledSourceNodeEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioScheduledSourceNodeEventMap]
  }
  
  @scala.inline
  implicit class AudioScheduledSourceNodeEventMapMutableBuilder[Self <: AudioScheduledSourceNodeEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnded(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
  }
}
