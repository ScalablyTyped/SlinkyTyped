package typingsSlinky.xstate.typesMod

import typingsSlinky.std.Partial
import typingsSlinky.xstate.xstateStrings.`final`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalStateNodeConfig[TContext, TEvent /* <: EventObject */] extends AtomicStateNodeConfig[TContext, TEvent] {
  /**
    * The data to be sent with the "done.state.<id>" event. The data can be
    * static or dynamic (based on assigners).
    */
  @JSName("data")
  var data_FinalStateNodeConfig: js.UndefOr[(Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) | js.Any] = js.native
  @JSName("type")
  var type_FinalStateNodeConfig: `final` = js.native
}

object FinalStateNodeConfig {
  @scala.inline
  def apply[TContext, TEvent](`type`: `final`): FinalStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalStateNodeConfig[TContext, TEvent]]
  }
  @scala.inline
  implicit class FinalStateNodeConfigOps[Self[tcontext, tevent] <: FinalStateNodeConfig[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withType(value: `final`): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFunction3(value: (TContext, TEvent, /* meta */ AssignMeta[TContext, TEvent]) => Partial[TContext]): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withData(value: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) | js.Any): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

