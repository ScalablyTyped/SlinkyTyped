package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentChangeEvent extends js.Object {
  var agent: TaskAgent = js.native
  var eventType: String = js.native
  var pool: TaskAgentPoolReference = js.native
  var poolId: Double = js.native
  var timeStamp: js.Date = js.native
}

object AgentChangeEvent {
  @scala.inline
  def apply(
    agent: TaskAgent,
    eventType: String,
    pool: TaskAgentPoolReference,
    poolId: Double,
    timeStamp: js.Date
  ): AgentChangeEvent = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentChangeEvent]
  }
  @scala.inline
  implicit class AgentChangeEventOps[Self <: AgentChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: TaskAgent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPool(value: TaskAgentPoolReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoolId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poolId")(value.asInstanceOf[js.Any])
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

