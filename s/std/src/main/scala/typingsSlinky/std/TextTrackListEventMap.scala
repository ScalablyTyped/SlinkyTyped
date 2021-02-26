package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackListEventMap extends StObject {
  
  var addtrack: org.scalajs.dom.raw.TrackEvent = js.native
  
  var change: org.scalajs.dom.raw.Event = js.native
  
  var removetrack: org.scalajs.dom.raw.TrackEvent = js.native
}
object TextTrackListEventMap {
  
  @scala.inline
  def apply(
    addtrack: org.scalajs.dom.raw.TrackEvent,
    change: org.scalajs.dom.raw.Event,
    removetrack: org.scalajs.dom.raw.TrackEvent
  ): TextTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackListEventMap]
  }
  
  @scala.inline
  implicit class TextTrackListEventMapMutableBuilder[Self <: TextTrackListEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddtrack(value: org.scalajs.dom.raw.TrackEvent): Self = StObject.set(x, "addtrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovetrack(value: org.scalajs.dom.raw.TrackEvent): Self = StObject.set(x, "removetrack", value.asInstanceOf[js.Any])
  }
}
