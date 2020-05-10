package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentRefreshMessage extends js.Object {
  var agentId: Double = js.native
  var targetVersion: String = js.native
  var timeout: js.Any = js.native
}

object AgentRefreshMessage {
  @scala.inline
  def apply(agentId: Double, targetVersion: String, timeout: js.Any): AgentRefreshMessage = {
    val __obj = js.Dynamic.literal(agentId = agentId.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentRefreshMessage]
  }
  @scala.inline
  implicit class AgentRefreshMessageOps[Self <: AgentRefreshMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

