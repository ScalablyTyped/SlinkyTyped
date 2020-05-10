package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobCompletedEvent extends JobEvent {
  var outputVariables: StringDictionary[VariableValue] = js.native
  var requestId: Double = js.native
  var result: TaskResult = js.native
}

object JobCompletedEvent {
  @scala.inline
  def apply(
    jobId: String,
    name: String,
    outputVariables: StringDictionary[VariableValue],
    requestId: Double,
    result: TaskResult
  ): JobCompletedEvent = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputVariables = outputVariables.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCompletedEvent]
  }
  @scala.inline
  implicit class JobCompletedEventOps[Self <: JobCompletedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputVariables(value: StringDictionary[VariableValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: TaskResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

