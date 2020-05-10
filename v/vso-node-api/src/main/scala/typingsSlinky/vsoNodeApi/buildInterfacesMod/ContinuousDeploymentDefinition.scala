package typingsSlinky.vsoNodeApi.buildInterfacesMod

import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typingsSlinky.vsoNodeApi.coreInterfacesMod.WebApiConnectedServiceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousDeploymentDefinition extends js.Object {
  /**
    * The connected service associated with the continuous deployment
    */
  var connectedService: WebApiConnectedServiceRef = js.native
  /**
    * The definition associated with the continuous deployment
    */
  var definition: XamlDefinitionReference = js.native
  var gitBranch: String = js.native
  var hostedServiceName: String = js.native
  var project: TeamProjectReference = js.native
  var repositoryId: String = js.native
  var storageAccountName: String = js.native
  var subscriptionId: String = js.native
  var website: String = js.native
  var webspace: String = js.native
}

object ContinuousDeploymentDefinition {
  @scala.inline
  def apply(
    connectedService: WebApiConnectedServiceRef,
    definition: XamlDefinitionReference,
    gitBranch: String,
    hostedServiceName: String,
    project: TeamProjectReference,
    repositoryId: String,
    storageAccountName: String,
    subscriptionId: String,
    website: String,
    webspace: String
  ): ContinuousDeploymentDefinition = {
    val __obj = js.Dynamic.literal(connectedService = connectedService.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], gitBranch = gitBranch.asInstanceOf[js.Any], hostedServiceName = hostedServiceName.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], storageAccountName = storageAccountName.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any], webspace = webspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousDeploymentDefinition]
  }
  @scala.inline
  implicit class ContinuousDeploymentDefinitionOps[Self <: ContinuousDeploymentDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectedService(value: WebApiConnectedServiceRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinition(value: XamlDefinitionReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostedServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: TeamProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageAccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebspace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webspace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

