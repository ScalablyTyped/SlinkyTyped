package typingsSlinky.yadda.libEventBusMod

import typingsSlinky.yadda.libContextMod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioEventData extends js.Object {
  var ctx: Properties
  var scenario: js.Array[String]
}

object ScenarioEventData {
  @scala.inline
  def apply(ctx: Properties, scenario: js.Array[String]): ScenarioEventData = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScenarioEventData]
  }
}

