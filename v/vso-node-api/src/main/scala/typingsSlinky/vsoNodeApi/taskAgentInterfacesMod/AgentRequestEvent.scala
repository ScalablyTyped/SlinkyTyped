package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentRequestEvent extends js.Object {
  var eventType: String = js.native
  var planId: String = js.native
  var poolId: Double = js.native
  var reservedAgentId: Double = js.native
  var result: TaskResult = js.native
  var timeStamp: js.Date = js.native
}

object AgentRequestEvent {
  @scala.inline
  def apply(
    eventType: String,
    planId: String,
    poolId: Double,
    reservedAgentId: Double,
    result: TaskResult,
    timeStamp: js.Date
  ): AgentRequestEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], reservedAgentId = reservedAgentId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentRequestEvent]
  }
  @scala.inline
  implicit class AgentRequestEventOps[Self <: AgentRequestEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoolId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReservedAgentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedAgentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: TaskResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

