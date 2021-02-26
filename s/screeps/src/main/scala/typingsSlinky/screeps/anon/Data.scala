package typingsSlinky.screeps.anon

import typingsSlinky.screeps.EVENT_ATTACK
import typingsSlinky.screeps.EventItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends EventItem {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK] */ js.Any = js.native
  
  var event: EVENT_ATTACK = js.native
  
  var objectId: String = js.native
}
object Data {
  
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK] */ js.Any,
    event: EVENT_ATTACK,
    objectId: String
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: EVENT_ATTACK): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
