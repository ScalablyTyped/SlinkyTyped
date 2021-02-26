package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.UserStatuses
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when roster item presence update happened
  */
@js.native
trait RosterPresenceUpdate extends VoxImplantIMEvent {
  
  /**
    *    User id
    */
  var id: String = js.native
  
  /**
    *    Status message
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    *    Current presence status
    */
  var presence: UserStatuses = js.native
  
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.native
}
object RosterPresenceUpdate {
  
  @scala.inline
  def apply(id: String, presence: UserStatuses): RosterPresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterPresenceUpdate]
  }
  
  @scala.inline
  implicit class RosterPresenceUpdateMutableBuilder[Self <: RosterPresenceUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setPresence(value: UserStatuses): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
