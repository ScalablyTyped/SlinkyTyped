package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentPoolQueueTarget extends PhaseTarget {
  /**
    * Enables scripts and other processes launched while executing phase to access the OAuth token
    */
  var allowScriptsAuthAccessOption: Boolean = js.native
  var demands: js.Array[_] = js.native
  /**
    * The execution options.
    */
  var executionOptions: AgentTargetExecutionOptions = js.native
  /**
    * The queue.
    */
  var queue: AgentPoolQueue = js.native
}

object AgentPoolQueueTarget {
  @scala.inline
  def apply(
    allowScriptsAuthAccessOption: Boolean,
    demands: js.Array[_],
    executionOptions: AgentTargetExecutionOptions,
    queue: AgentPoolQueue,
    `type`: Double
  ): AgentPoolQueueTarget = {
    val __obj = js.Dynamic.literal(allowScriptsAuthAccessOption = allowScriptsAuthAccessOption.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], executionOptions = executionOptions.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPoolQueueTarget]
  }
  @scala.inline
  implicit class AgentPoolQueueTargetOps[Self <: AgentPoolQueueTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowScriptsAuthAccessOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScriptsAuthAccessOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDemands(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionOptions(value: AgentTargetExecutionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: AgentPoolQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

