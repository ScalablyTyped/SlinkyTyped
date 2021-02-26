package typingsSlinky.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomSystemInfo extends StObject {
  
  var active: Boolean = js.native
  
  var createdByUserId: Double = js.native
  
  var creationDate: Double = js.native
  
  var id: String = js.native
}
object RoomSystemInfo {
  
  @scala.inline
  def apply(active: Boolean, createdByUserId: Double, creationDate: Double, id: String): RoomSystemInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], createdByUserId = createdByUserId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSystemInfo]
  }
  
  @scala.inline
  implicit class RoomSystemInfoMutableBuilder[Self <: RoomSystemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUserId(value: Double): Self = StObject.set(x, "createdByUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
