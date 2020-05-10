package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IpMessagingGrantPayloadOps[Self <: IpMessagingGrantPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployment_role_sid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment_role_sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush_credential_sid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push_credential_sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService_sid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_sid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

