package typingsSlinky.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpMessagingGrantPayload extends GrantPayload {
  
  var deployment_role_sid: String = js.native
  
  var endpoint_id: String = js.native
  
  var push_credential_sid: String = js.native
  
  var service_sid: String = js.native
}
object IpMessagingGrantPayload {
  
  @scala.inline
  def apply(deployment_role_sid: String, endpoint_id: String, push_credential_sid: String, service_sid: String): IpMessagingGrantPayload = {
    val __obj = js.Dynamic.literal(deployment_role_sid = deployment_role_sid.asInstanceOf[js.Any], endpoint_id = endpoint_id.asInstanceOf[js.Any], push_credential_sid = push_credential_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpMessagingGrantPayload]
  }
  
  @scala.inline
  implicit class IpMessagingGrantPayloadMutableBuilder[Self <: IpMessagingGrantPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployment_role_sid(value: String): Self = StObject.set(x, "deployment_role_sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint_id(value: String): Self = StObject.set(x, "endpoint_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush_credential_sid(value: String): Self = StObject.set(x, "push_credential_sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
  }
}
