package typingsSlinky.screeps.anon

import typingsSlinky.screeps.EVENT_EXIT
import typingsSlinky.screeps.EventItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEVENTEXIT extends EventItem {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_EXIT] */ js.Any = js.native
  
  var event: EVENT_EXIT = js.native
  
  var objectId: String = js.native
}
object EventEVENTEXIT {
  
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_EXIT] */ js.Any,
    event: EVENT_EXIT,
    objectId: String
  ): EventEVENTEXIT = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEVENTEXIT]
  }
  
  @scala.inline
  implicit class EventEVENTEXITMutableBuilder[Self <: EventEVENTEXIT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_EXIT] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: EVENT_EXIT): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
