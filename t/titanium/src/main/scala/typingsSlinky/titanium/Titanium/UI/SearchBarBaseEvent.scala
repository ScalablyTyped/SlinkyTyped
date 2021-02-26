package typingsSlinky.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.SearchBar
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait SearchBarBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: SearchBar = js.native
}
object SearchBarBaseEvent {
  
  @scala.inline
  def apply(source: SearchBar): SearchBarBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarBaseEvent]
  }
  
  @scala.inline
  implicit class SearchBarBaseEventMutableBuilder[Self <: SearchBarBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: SearchBar): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
