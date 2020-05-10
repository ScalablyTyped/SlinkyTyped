package typingsSlinky.xstate.typesMod

import typingsSlinky.std.Record
import typingsSlinky.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  /**
    * @private
    */
  var _key: js.UndefOr[String] = js.native
  /**
    * @private
    */
  var _parent: js.UndefOr[StateNode[TContext, _, TEvent, _]] = js.native
  var actions: ActionFunctionMap[TContext, TEvent] = js.native
  var activities: Record[String, ActivityConfig[TContext, TEvent]] = js.native
  var delays: DelayFunctionMap[TContext, TEvent] = js.native
  var guards: Record[String, ConditionPredicate[TContext, TEvent]] = js.native
  var services: Record[String, ServiceConfig[TContext]] = js.native
}

object MachineOptions {
  @scala.inline
  def apply[TContext, TEvent](
    actions: ActionFunctionMap[TContext, TEvent],
    activities: Record[String, ActivityConfig[TContext, TEvent]],
    delays: DelayFunctionMap[TContext, TEvent],
    guards: Record[String, ConditionPredicate[TContext, TEvent]],
    services: Record[String, ServiceConfig[TContext]]
  ): MachineOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activities = activities.asInstanceOf[js.Any], delays = delays.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[MachineOptions[TContext, TEvent]]
  }
  @scala.inline
  implicit class MachineOptionsOps[Self[tcontext, tevent] <: MachineOptions[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withActions(value: ActionFunctionMap[TContext, TEvent]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivities(value: Record[String, ActivityConfig[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelays(value: DelayFunctionMap[TContext, TEvent]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuards(value: Record[String, ConditionPredicate[TContext, TEvent]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServices(value: Record[String, ServiceConfig[TContext]]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_key(value: String): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_key: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_key")(js.undefined)
        ret
    }
    @scala.inline
    def with_parent(value: StateNode[TContext, _, TEvent, _]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_parent: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parent")(js.undefined)
        ret
    }
  }
  
}

