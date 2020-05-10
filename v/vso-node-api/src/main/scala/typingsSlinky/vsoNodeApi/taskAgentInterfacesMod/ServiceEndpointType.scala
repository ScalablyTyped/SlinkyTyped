package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEndpointType extends js.Object {
  var authenticationSchemes: js.Array[ServiceEndpointAuthenticationScheme] = js.native
  var dataSources: js.Array[DataSource] = js.native
  var dependencyData: js.Array[DependencyData] = js.native
  var description: String = js.native
  var displayName: String = js.native
  var endpointUrl: EndpointUrl = js.native
  var helpLink: HelpLink = js.native
  var helpMarkDown: String = js.native
  var iconUrl: String = js.native
  var inputDescriptors: js.Array[InputDescriptor] = js.native
  var name: String = js.native
}

object ServiceEndpointType {
  @scala.inline
  def apply(
    authenticationSchemes: js.Array[ServiceEndpointAuthenticationScheme],
    dataSources: js.Array[DataSource],
    dependencyData: js.Array[DependencyData],
    description: String,
    displayName: String,
    endpointUrl: EndpointUrl,
    helpLink: HelpLink,
    helpMarkDown: String,
    iconUrl: String,
    inputDescriptors: js.Array[InputDescriptor],
    name: String
  ): ServiceEndpointType = {
    val __obj = js.Dynamic.literal(authenticationSchemes = authenticationSchemes.asInstanceOf[js.Any], dataSources = dataSources.asInstanceOf[js.Any], dependencyData = dependencyData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], endpointUrl = endpointUrl.asInstanceOf[js.Any], helpLink = helpLink.asInstanceOf[js.Any], helpMarkDown = helpMarkDown.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpointType]
  }
  @scala.inline
  implicit class ServiceEndpointTypeOps[Self <: ServiceEndpointType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationSchemes(value: js.Array[ServiceEndpointAuthenticationScheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationSchemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSources(value: js.Array[DataSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencyData(value: js.Array[DependencyData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointUrl(value: EndpointUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpLink(value: HelpLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpMarkDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpMarkDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDescriptors(value: js.Array[InputDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

