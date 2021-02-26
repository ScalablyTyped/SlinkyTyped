package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackEventMap extends StObject {
  
  var cuechange: org.scalajs.dom.raw.Event = js.native
}
object TextTrackEventMap {
  
  @scala.inline
  def apply(cuechange: org.scalajs.dom.raw.Event): TextTrackEventMap = {
    val __obj = js.Dynamic.literal(cuechange = cuechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackEventMap]
  }
  
  @scala.inline
  implicit class TextTrackEventMapMutableBuilder[Self <: TextTrackEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCuechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "cuechange", value.asInstanceOf[js.Any])
  }
}
