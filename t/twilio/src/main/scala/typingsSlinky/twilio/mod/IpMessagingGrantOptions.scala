package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpMessagingGrantOptions extends js.Object {
  var deploymentRoleSid: String = js.native
  var endpointId: String = js.native
  var pushCredentialSid: String = js.native
  var serviceSid: String = js.native
}

object IpMessagingGrantOptions {
  @scala.inline
  def apply(deploymentRoleSid: String, endpointId: String, pushCredentialSid: String, serviceSid: String): IpMessagingGrantOptions = {
    val __obj = js.Dynamic.literal(deploymentRoleSid = deploymentRoleSid.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], pushCredentialSid = pushCredentialSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpMessagingGrantOptions]
  }
  @scala.inline
  implicit class IpMessagingGrantOptionsOps[Self <: IpMessagingGrantOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentRoleSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentRoleSid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushCredentialSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushCredentialSid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceSid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

