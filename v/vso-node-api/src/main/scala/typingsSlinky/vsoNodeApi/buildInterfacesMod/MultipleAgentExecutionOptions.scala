package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleAgentExecutionOptions extends AgentTargetExecutionOptions {
  /**
    * Indicates whether failure on one agent should prevent the phase from running on other agents.
    */
  var continueOnError: Boolean = js.native
  /**
    * The maximum number of agents to use simultaneously.
    */
  var maxConcurrency: Double = js.native
}

object MultipleAgentExecutionOptions {
  @scala.inline
  def apply(continueOnError: Boolean, maxConcurrency: Double, `type`: Double): MultipleAgentExecutionOptions = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleAgentExecutionOptions]
  }
  @scala.inline
  implicit class MultipleAgentExecutionOptionsOps[Self <: MultipleAgentExecutionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinueOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

