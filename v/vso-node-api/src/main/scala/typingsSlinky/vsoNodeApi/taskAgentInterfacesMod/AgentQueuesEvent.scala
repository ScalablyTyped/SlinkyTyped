package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentQueuesEvent extends js.Object {
  var eventType: String = js.native
  var queues: js.Array[TaskAgentQueue] = js.native
}

object AgentQueuesEvent {
  @scala.inline
  def apply(eventType: String, queues: js.Array[TaskAgentQueue]): AgentQueuesEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentQueuesEvent]
  }
  @scala.inline
  implicit class AgentQueuesEventOps[Self <: AgentQueuesEvent] (val x: Self) extends AnyVal {
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
    def withQueues(value: js.Array[TaskAgentQueue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

