package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelExecutionInputBase extends ExecutionInput {
  var continueOnError: Boolean = js.native
  var maxNumberOfAgents: Double = js.native
}

object ParallelExecutionInputBase {
  @scala.inline
  def apply(continueOnError: Boolean, maxNumberOfAgents: Double, parallelExecutionType: ParallelExecutionTypes): ParallelExecutionInputBase = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxNumberOfAgents = maxNumberOfAgents.asInstanceOf[js.Any], parallelExecutionType = parallelExecutionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelExecutionInputBase]
  }
  @scala.inline
  implicit class ParallelExecutionInputBaseOps[Self <: ParallelExecutionInputBase] (val x: Self) extends AnyVal {
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
    def withMaxNumberOfAgents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumberOfAgents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

