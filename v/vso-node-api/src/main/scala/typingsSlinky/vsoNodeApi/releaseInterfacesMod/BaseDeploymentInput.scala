package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseDeploymentInput extends js.Object {
  var condition: String = js.native
  /**
    * Gets or sets the job cancel timeout in minutes for deployment which are cancelled by user for this release environment
    */
  var jobCancelTimeoutInMinutes: Double = js.native
  var overrideInputs: StringDictionary[String] = js.native
  /**
    * Gets or sets the job execution timeout in minutes for deployment which are queued against this release environment
    */
  var timeoutInMinutes: Double = js.native
}

object BaseDeploymentInput {
  @scala.inline
  def apply(
    condition: String,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    timeoutInMinutes: Double
  ): BaseDeploymentInput = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDeploymentInput]
  }
  @scala.inline
  implicit class BaseDeploymentInputOps[Self <: BaseDeploymentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobCancelTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobCancelTimeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideInputs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

