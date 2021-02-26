package typingsSlinky.titanium.Titanium.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Android.Activity
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ActivityBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Activity = js.native
}
object ActivityBaseEvent {
  
  @scala.inline
  def apply(source: Activity): ActivityBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityBaseEvent]
  }
  
  @scala.inline
  implicit class ActivityBaseEventMutableBuilder[Self <: ActivityBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Activity): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
