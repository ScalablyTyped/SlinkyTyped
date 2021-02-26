package typingsSlinky.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.PickerRow
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait PickerRowBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: PickerRow = js.native
}
object PickerRowBaseEvent {
  
  @scala.inline
  def apply(source: PickerRow): PickerRowBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerRowBaseEvent]
  }
  
  @scala.inline
  implicit class PickerRowBaseEventMutableBuilder[Self <: PickerRowBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: PickerRow): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
