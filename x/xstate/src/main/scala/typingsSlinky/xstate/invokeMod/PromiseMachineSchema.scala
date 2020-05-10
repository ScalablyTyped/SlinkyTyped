package typingsSlinky.xstate.invokeMod

import typingsSlinky.xstate.AnonPending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseMachineSchema extends js.Object {
  var states: AnonPending = js.native
}

object PromiseMachineSchema {
  @scala.inline
  def apply(states: AnonPending): PromiseMachineSchema = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseMachineSchema]
  }
  @scala.inline
  implicit class PromiseMachineSchemaOps[Self <: PromiseMachineSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStates(value: AnonPending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

