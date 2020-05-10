package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEndpointAuthenticationScheme extends js.Object {
  var authorizationHeaders: js.Array[AuthorizationHeader] = js.native
  var displayName: String = js.native
  var inputDescriptors: js.Array[InputDescriptor] = js.native
  var scheme: String = js.native
}

object ServiceEndpointAuthenticationScheme {
  @scala.inline
  def apply(
    authorizationHeaders: js.Array[AuthorizationHeader],
    displayName: String,
    inputDescriptors: js.Array[InputDescriptor],
    scheme: String
  ): ServiceEndpointAuthenticationScheme = {
    val __obj = js.Dynamic.literal(authorizationHeaders = authorizationHeaders.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointAuthenticationScheme]
  }
  @scala.inline
  implicit class ServiceEndpointAuthenticationSchemeOps[Self <: ServiceEndpointAuthenticationScheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationHeaders(value: js.Array[AuthorizationHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDescriptors(value: js.Array[InputDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

