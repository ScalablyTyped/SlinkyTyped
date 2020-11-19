package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.anon.Context
import typingsSlinky.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateMeta[TContext, TEvent /* <: EventObject */] extends js.Object {
  
  var _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent] = js.native
  
  var state: State[TContext, TEvent, _, Context[TContext]] = js.native
}
object StateMeta {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent],
    state: State[TContext, TEvent, _, Context[TContext]]
  ): StateMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMeta[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class StateMetaOps[Self <: StateMeta[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (StateMeta[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_event(value: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent]): Self = this.set("_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State[TContext, TEvent, _, Context[TContext]]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
