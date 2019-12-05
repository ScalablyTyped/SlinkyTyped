package typingsSlinky.yadda.libPluginsMod

import typingsSlinky.yadda.TypeofScenarioLevelPlugin
import typingsSlinky.yadda.TypeofStepLevelPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPlugin extends js.Object {
  var ScenarioLevelPlugin: TypeofScenarioLevelPlugin
  var StepLevelPlugin: TypeofStepLevelPlugin
}

object MochaPlugin {
  @scala.inline
  def apply(ScenarioLevelPlugin: TypeofScenarioLevelPlugin, StepLevelPlugin: TypeofStepLevelPlugin): MochaPlugin = {
    val __obj = js.Dynamic.literal(ScenarioLevelPlugin = ScenarioLevelPlugin.asInstanceOf[js.Any], StepLevelPlugin = StepLevelPlugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MochaPlugin]
  }
}

