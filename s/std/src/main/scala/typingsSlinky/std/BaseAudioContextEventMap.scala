package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAudioContextEventMap extends StObject {
  
  var statechange: org.scalajs.dom.raw.Event = js.native
}
object BaseAudioContextEventMap {
  
  @scala.inline
  def apply(statechange: org.scalajs.dom.raw.Event): BaseAudioContextEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAudioContextEventMap]
  }
  
  @scala.inline
  implicit class BaseAudioContextEventMapMutableBuilder[Self <: BaseAudioContextEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
