package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEndpoint extends js.Object {
  var administratorsGroup: IdentityRef = js.native
  /**
    * Gets or sets the authorization data for talking to the endpoint.
    */
  var authorization: EndpointAuthorization = js.native
  /**
    * The Gets or sets Identity reference for the user who created the Service endpoint
    */
  var createdBy: IdentityRef = js.native
  var data: StringDictionary[String] = js.native
  /**
    * Gets or Sets description of endpoint
    */
  var description: String = js.native
  var groupScopeId: String = js.native
  /**
    * Gets or sets the identifier of this endpoint.
    */
  var id: String = js.native
  /**
    * EndPoint state indictor
    */
  var isReady: Boolean = js.native
  /**
    * Gets or sets the friendly name of the endpoint.
    */
  var name: String = js.native
  /**
    * Error message during creation/deletion of endpoint
    */
  var operationStatus: js.Any = js.native
  var readersGroup: IdentityRef = js.native
  /**
    * Gets or sets the type of the endpoint.
    */
  var `type`: String = js.native
  /**
    * Gets or sets the url of the endpoint.
    */
  var url: String = js.native
}

object ServiceEndpoint {
  @scala.inline
  def apply(
    administratorsGroup: IdentityRef,
    authorization: EndpointAuthorization,
    createdBy: IdentityRef,
    data: StringDictionary[String],
    description: String,
    groupScopeId: String,
    id: String,
    isReady: Boolean,
    name: String,
    operationStatus: js.Any,
    readersGroup: IdentityRef,
    `type`: String,
    url: String
  ): ServiceEndpoint = {
    val __obj = js.Dynamic.literal(administratorsGroup = administratorsGroup.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupScopeId = groupScopeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], readersGroup = readersGroup.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpoint]
  }
  @scala.inline
  implicit class ServiceEndpointOps[Self <: ServiceEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministratorsGroup(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administratorsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorization(value: EndpointAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupScopeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupScopeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadersGroup(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readersGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

