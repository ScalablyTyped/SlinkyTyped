package typingsSlinky.yadda.pluginsMod

import typingsSlinky.yadda.anon.TypeofScenarioLevelPlugin
import typingsSlinky.yadda.anon.TypeofStepLevelPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MochaPlugin extends js.Object {
  var ScenarioLevelPlugin: TypeofScenarioLevelPlugin = js.native
  var StepLevelPlugin: TypeofStepLevelPlugin = js.native
}

object MochaPlugin {
  @scala.inline
  def apply(ScenarioLevelPlugin: TypeofScenarioLevelPlugin, StepLevelPlugin: TypeofStepLevelPlugin): MochaPlugin = {
    val __obj = js.Dynamic.literal(ScenarioLevelPlugin = ScenarioLevelPlugin.asInstanceOf[js.Any], StepLevelPlugin = StepLevelPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPlugin]
  }
  @scala.inline
  implicit class MochaPluginOps[Self <: MochaPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScenarioLevelPlugin(value: TypeofScenarioLevelPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScenarioLevelPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepLevelPlugin(value: TypeofStepLevelPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepLevelPlugin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

