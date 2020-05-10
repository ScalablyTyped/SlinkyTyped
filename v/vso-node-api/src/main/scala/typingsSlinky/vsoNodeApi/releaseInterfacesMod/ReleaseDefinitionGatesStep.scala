package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionGatesStep extends js.Object {
  var gates: js.Array[ReleaseDefinitionGate] = js.native
  var gatesOptions: ReleaseDefinitionGatesOptions = js.native
  var id: Double = js.native
}

object ReleaseDefinitionGatesStep {
  @scala.inline
  def apply(gates: js.Array[ReleaseDefinitionGate], gatesOptions: ReleaseDefinitionGatesOptions, id: Double): ReleaseDefinitionGatesStep = {
    val __obj = js.Dynamic.literal(gates = gates.asInstanceOf[js.Any], gatesOptions = gatesOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionGatesStep]
  }
  @scala.inline
  implicit class ReleaseDefinitionGatesStepOps[Self <: ReleaseDefinitionGatesStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGates(value: js.Array[ReleaseDefinitionGate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatesOptions(value: ReleaseDefinitionGatesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatesOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

