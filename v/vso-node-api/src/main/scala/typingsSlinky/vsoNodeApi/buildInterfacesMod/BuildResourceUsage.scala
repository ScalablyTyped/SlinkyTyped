package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildResourceUsage extends js.Object {
  /**
    * The number of build agents.
    */
  var distributedTaskAgents: Double = js.native
  /**
    * The number of paid private agent slots.
    */
  var paidPrivateAgentSlots: Double = js.native
  /**
    * The total usage.
    */
  var totalUsage: Double = js.native
  /**
    * The number of XAML controllers.
    */
  var xamlControllers: Double = js.native
}

object BuildResourceUsage {
  @scala.inline
  def apply(
    distributedTaskAgents: Double,
    paidPrivateAgentSlots: Double,
    totalUsage: Double,
    xamlControllers: Double
  ): BuildResourceUsage = {
    val __obj = js.Dynamic.literal(distributedTaskAgents = distributedTaskAgents.asInstanceOf[js.Any], paidPrivateAgentSlots = paidPrivateAgentSlots.asInstanceOf[js.Any], totalUsage = totalUsage.asInstanceOf[js.Any], xamlControllers = xamlControllers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildResourceUsage]
  }
  @scala.inline
  implicit class BuildResourceUsageOps[Self <: BuildResourceUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistributedTaskAgents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributedTaskAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaidPrivateAgentSlots(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paidPrivateAgentSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXamlControllers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xamlControllers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

