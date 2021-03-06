package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.SubscriptionRequestType
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when some user tries to add current user into their roster. Current user can confirm or reject the subscription, then VoxImplant.IMEvents.RosterItemChange will be dispatched on for user that made the request
  */
@js.native
trait SubscriptionRequest extends VoxImplantIMEvent {
  
  /**
    *    User id
    */
  var id: String = js.native
  
  /**
    *    Optional message
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    *    Message event type. See VoxImplant.SubscriptionRequestType enum
    */
  var `type`: SubscriptionRequestType = js.native
}
object SubscriptionRequest {
  
  @scala.inline
  def apply(id: String, `type`: SubscriptionRequestType): SubscriptionRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionRequest]
  }
  
  @scala.inline
  implicit class SubscriptionRequestMutableBuilder[Self <: SubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setType(value: SubscriptionRequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
