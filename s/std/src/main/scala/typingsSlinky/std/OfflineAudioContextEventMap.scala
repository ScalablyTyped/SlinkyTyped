package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfflineAudioContextEventMap extends BaseAudioContextEventMap {
  
  var complete: org.scalajs.dom.raw.OfflineAudioCompletionEvent = js.native
}
object OfflineAudioContextEventMap {
  
  @scala.inline
  def apply(complete: org.scalajs.dom.raw.OfflineAudioCompletionEvent, statechange: org.scalajs.dom.raw.Event): OfflineAudioContextEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioContextEventMap]
  }
  
  @scala.inline
  implicit class OfflineAudioContextEventMapMutableBuilder[Self <: OfflineAudioContextEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: org.scalajs.dom.raw.OfflineAudioCompletionEvent): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
  }
}
