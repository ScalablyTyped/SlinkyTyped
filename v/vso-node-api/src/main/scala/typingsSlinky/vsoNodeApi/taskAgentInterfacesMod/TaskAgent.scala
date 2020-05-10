package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgent extends TaskAgentReference {
  /**
    * Gets the request which is currently assigned to this agent.
    */
  var assignedRequest: TaskAgentJobRequest = js.native
  /**
    * Gets or sets the authorization information for this agent.
    */
  var authorization: TaskAgentAuthorization = js.native
  /**
    * Gets the date on which this agent was created.
    */
  var createdOn: js.Date = js.native
  /**
    * Gets or sets the maximum job parallelism allowed on this host.
    */
  var maxParallelism: Double = js.native
  /**
    * Gets the pending update for this agent.
    */
  var pendingUpdate: TaskAgentUpdate = js.native
  var properties: js.Any = js.native
  /**
    * Gets the date on which the last connectivity status change occurred.
    */
  var statusChangedOn: js.Date = js.native
  var systemCapabilities: StringDictionary[String] = js.native
  var userCapabilities: StringDictionary[String] = js.native
}

object TaskAgent {
  @scala.inline
  def apply(
    _links: js.Any,
    assignedRequest: TaskAgentJobRequest,
    authorization: TaskAgentAuthorization,
    createdOn: js.Date,
    enabled: Boolean,
    id: Double,
    maxParallelism: Double,
    name: String,
    pendingUpdate: TaskAgentUpdate,
    properties: js.Any,
    status: TaskAgentStatus,
    statusChangedOn: js.Date,
    systemCapabilities: StringDictionary[String],
    userCapabilities: StringDictionary[String],
    version: String
  ): TaskAgent = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], assignedRequest = assignedRequest.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxParallelism = maxParallelism.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pendingUpdate = pendingUpdate.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusChangedOn = statusChangedOn.asInstanceOf[js.Any], systemCapabilities = systemCapabilities.asInstanceOf[js.Any], userCapabilities = userCapabilities.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgent]
  }
  @scala.inline
  implicit class TaskAgentOps[Self <: TaskAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignedRequest(value: TaskAgentJobRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorization(value: TaskAgentAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxParallelism(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingUpdate(value: TaskAgentUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusChangedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusChangedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemCapabilities(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserCapabilities(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

