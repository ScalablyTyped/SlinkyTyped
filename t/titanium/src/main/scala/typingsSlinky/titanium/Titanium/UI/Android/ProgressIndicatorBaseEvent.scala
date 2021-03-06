package typingsSlinky.titanium.Titanium.UI.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Android.ProgressIndicator
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ProgressIndicatorBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: ProgressIndicator = js.native
}
object ProgressIndicatorBaseEvent {
  
  @scala.inline
  def apply(source: ProgressIndicator): ProgressIndicatorBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressIndicatorBaseEvent]
  }
  
  @scala.inline
  implicit class ProgressIndicatorBaseEventMutableBuilder[Self <: ProgressIndicatorBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: ProgressIndicator): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
