package typingsSlinky.yadda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofScenarioLevelPlugin extends js.Object {
  def init(options: js.Any): Unit = js.native
}

object TypeofScenarioLevelPlugin {
  @scala.inline
  def apply(init: js.Any => Unit): TypeofScenarioLevelPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[TypeofScenarioLevelPlugin]
  }
  @scala.inline
  implicit class TypeofScenarioLevelPluginOps[Self <: TypeofScenarioLevelPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

