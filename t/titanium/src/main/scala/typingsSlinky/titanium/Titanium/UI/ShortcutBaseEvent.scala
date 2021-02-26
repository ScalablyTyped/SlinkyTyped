package typingsSlinky.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Shortcut
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ShortcutBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Shortcut = js.native
}
object ShortcutBaseEvent {
  
  @scala.inline
  def apply(source: Shortcut): ShortcutBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutBaseEvent]
  }
  
  @scala.inline
  implicit class ShortcutBaseEventMutableBuilder[Self <: ShortcutBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Shortcut): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
