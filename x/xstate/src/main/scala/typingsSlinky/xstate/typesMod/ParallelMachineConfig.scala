package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.xstateStrings.parallel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelMachineConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends StateNodeConfig[TContext, TStateSchema, TEvent] {
  @JSName("initial")
  var initial_ParallelMachineConfig: js.UndefOr[scala.Nothing] = js.native
  @JSName("type")
  var type_ParallelMachineConfig: js.UndefOr[parallel] = js.native
}

object ParallelMachineConfig {
  @scala.inline
  def apply[TContext, TStateSchema, TEvent](): ParallelMachineConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelMachineConfig[TContext, TStateSchema, TEvent]]
  }
  @scala.inline
  implicit class ParallelMachineConfigOps[Self[tcontext, tstateschema, tevent] <: ParallelMachineConfig[tcontext, tstateschema, tevent], TContext, TStateSchema, TEvent] (val x: Self[TContext, TStateSchema, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TStateSchema, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TStateSchema, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TStateSchema, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TStateSchema, TEvent]) with Other]
    @scala.inline
    def withInitial(value: scala.Nothing): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: parallel): Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[TContext, TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

