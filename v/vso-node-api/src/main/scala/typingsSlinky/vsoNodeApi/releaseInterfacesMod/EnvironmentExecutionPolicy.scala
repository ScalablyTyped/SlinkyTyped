package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentExecutionPolicy extends js.Object {
  /**
    * This policy decides, how many environments would be with Environment Runner.
    */
  var concurrencyCount: Double = js.native
  /**
    * Queue depth in the EnvironmentQueue table, this table keeps the environment entries till Environment Runner is free [as per it's policy] to take another environment for running.
    */
  var queueDepthCount: Double = js.native
}

object EnvironmentExecutionPolicy {
  @scala.inline
  def apply(concurrencyCount: Double, queueDepthCount: Double): EnvironmentExecutionPolicy = {
    val __obj = js.Dynamic.literal(concurrencyCount = concurrencyCount.asInstanceOf[js.Any], queueDepthCount = queueDepthCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentExecutionPolicy]
  }
  @scala.inline
  implicit class EnvironmentExecutionPolicyOps[Self <: EnvironmentExecutionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrencyCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueDepthCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueDepthCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

