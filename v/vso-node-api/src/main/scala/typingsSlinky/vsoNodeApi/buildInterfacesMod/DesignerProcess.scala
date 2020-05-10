package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesignerProcess extends BuildProcess {
  var phases: js.Array[Phase] = js.native
}

object DesignerProcess {
  @scala.inline
  def apply(phases: js.Array[Phase], `type`: Double): DesignerProcess = {
    val __obj = js.Dynamic.literal(phases = phases.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesignerProcess]
  }
  @scala.inline
  implicit class DesignerProcessOps[Self <: DesignerProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhases(value: js.Array[Phase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phases")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

