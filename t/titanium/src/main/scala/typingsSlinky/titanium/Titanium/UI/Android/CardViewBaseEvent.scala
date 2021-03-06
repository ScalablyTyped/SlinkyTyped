package typingsSlinky.titanium.Titanium.UI.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.UI.Android.CardView
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait CardViewBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: CardView = js.native
}
object CardViewBaseEvent {
  
  @scala.inline
  def apply(source: CardView): CardViewBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBaseEvent]
  }
  
  @scala.inline
  implicit class CardViewBaseEventMutableBuilder[Self <: CardViewBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: CardView): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
