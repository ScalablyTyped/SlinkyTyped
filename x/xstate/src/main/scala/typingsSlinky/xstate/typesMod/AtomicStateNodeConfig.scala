package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.xstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.xstate.typesMod.SimpleOrStateNodeConfig because Already inherited */ @js.native
trait AtomicStateNodeConfig[TContext, TEvent /* <: EventObject */]
  extends StateNodeConfig[TContext, StateSchema[js.Any], TEvent] {
  @JSName("initial")
  var initial_AtomicStateNodeConfig: js.UndefOr[scala.Nothing] = js.native
  @JSName("onDone")
  var onDone_AtomicStateNodeConfig: js.UndefOr[scala.Nothing] = js.native
  @JSName("parallel")
  var parallel_AtomicStateNodeConfig: js.UndefOr[`false`] = js.native
  @JSName("states")
  var states_AtomicStateNodeConfig: js.UndefOr[scala.Nothing] = js.native
}

object AtomicStateNodeConfig {
  @scala.inline
  def apply[TContext, TEvent](): AtomicStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtomicStateNodeConfig[TContext, TEvent]]
  }
  @scala.inline
  implicit class AtomicStateNodeConfigOps[Self[tcontext, tevent] <: AtomicStateNodeConfig[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withParallel(value: `false`): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallel: Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(js.undefined)
        ret
    }
  }
  
}

