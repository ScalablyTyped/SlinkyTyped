package typingsSlinky.yadda.eventBusMod

import typingsSlinky.yadda.contextMod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScenarioEventData extends js.Object {
  var ctx: Properties = js.native
  var scenario: js.Array[String] = js.native
}

object ScenarioEventData {
  @scala.inline
  def apply(ctx: Properties, scenario: js.Array[String]): ScenarioEventData = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioEventData]
  }
  @scala.inline
  implicit class ScenarioEventDataOps[Self <: ScenarioEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtx(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScenario(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenario")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

