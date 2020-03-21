package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildAgent extends js.Object {
  var buildDirectory: String
  var controller: XamlBuildControllerReference
  var createdDate: js.Date
  var description: String
  var enabled: Boolean
  var id: Double
  var messageQueueUrl: String
  var name: String
  var reservedForBuild: String
  var server: XamlBuildServerReference
  var status: AgentStatus
  var statusMessage: String
  var updatedDate: js.Date
  var uri: String
  var url: String
}

object BuildAgent {
  @scala.inline
  def apply(
    buildDirectory: String,
    controller: XamlBuildControllerReference,
    createdDate: js.Date,
    description: String,
    enabled: Boolean,
    id: Double,
    messageQueueUrl: String,
    name: String,
    reservedForBuild: String,
    server: XamlBuildServerReference,
    status: AgentStatus,
    statusMessage: String,
    updatedDate: js.Date,
    uri: String,
    url: String
  ): BuildAgent = {
    val __obj = js.Dynamic.literal(buildDirectory = buildDirectory.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageQueueUrl = messageQueueUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reservedForBuild = reservedForBuild.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildAgent]
  }
}

