package typingsSlinky.vsoNodeApi.coreInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebApiConnectedService extends WebApiConnectedServiceRef {
  /**
    * The user who did the OAuth authentication to created this service
    */
  var authenticatedBy: IdentityRef = js.native
  /**
    * Extra description on the service.
    */
  var description: String = js.native
  /**
    * Friendly Name of service connection
    */
  var friendlyName: String = js.native
  /**
    * The kind of service.
    */
  var kind: String = js.native
  /**
    * The project associated with this service
    */
  var project: TeamProjectReference = js.native
  /**
    * Optional uri to connect directly to the service such as https://windows.azure.com
    */
  var serviceUri: String = js.native
}

object WebApiConnectedService {
  @scala.inline
  def apply(
    authenticatedBy: IdentityRef,
    description: String,
    friendlyName: String,
    id: String,
    kind: String,
    project: TeamProjectReference,
    serviceUri: String,
    url: String
  ): WebApiConnectedService = {
    val __obj = js.Dynamic.literal(authenticatedBy = authenticatedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], serviceUri = serviceUri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiConnectedService]
  }
  @scala.inline
  implicit class WebApiConnectedServiceOps[Self <: WebApiConnectedService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: TeamProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

