package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends StateNodeConfig[TContext, TStateSchema, TEvent] {
  /**
    * The machine's own version.
    */
  var version: js.UndefOr[String] = js.native
}

object MachineConfig {
  @scala.inline
  def apply[TContext, TStateSchema, TEvent](): MachineConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MachineConfig[TContext, TStateSchema, TEvent]]
  }
  @scala.inline
  implicit class MachineConfigOps[Self[tcontext, tstateschema, tevent] <: MachineConfig[tcontext, tstateschema, tevent], TContext, TStateSchema, TEvent] (val x: Self[TContext, TStateSchema, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TStateSchema, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TStateSchema, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TStateSchema, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TStateSchema, TEvent]) with Other]
    @scala.inline
    def withVersion(value: String): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

