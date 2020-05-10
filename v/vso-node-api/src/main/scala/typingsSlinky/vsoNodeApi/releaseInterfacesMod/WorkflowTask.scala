package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTask extends js.Object {
  var alwaysRun: Boolean = js.native
  var condition: String = js.native
  var continueOnError: Boolean = js.native
  var definitionType: String = js.native
  var enabled: Boolean = js.native
  var inputs: StringDictionary[String] = js.native
  var name: String = js.native
  var overrideInputs: StringDictionary[String] = js.native
  var refName: String = js.native
  var taskId: String = js.native
  var timeoutInMinutes: Double = js.native
  var version: String = js.native
}

object WorkflowTask {
  @scala.inline
  def apply(
    alwaysRun: Boolean,
    condition: String,
    continueOnError: Boolean,
    definitionType: String,
    enabled: Boolean,
    inputs: StringDictionary[String],
    name: String,
    overrideInputs: StringDictionary[String],
    refName: String,
    taskId: String,
    timeoutInMinutes: Double,
    version: String
  ): WorkflowTask = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], definitionType = definitionType.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], refName = refName.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTask]
  }
  @scala.inline
  implicit class WorkflowTaskOps[Self <: WorkflowTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinueOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrideInputs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

