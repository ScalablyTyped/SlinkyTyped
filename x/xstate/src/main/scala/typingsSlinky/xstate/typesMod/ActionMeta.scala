package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.anon.Context
import typingsSlinky.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionMeta[TContext, TEvent /* <: EventObject */] extends StateMeta[TContext, TEvent] {
  
  var action: ActionObject[TContext, TEvent] = js.native
}
object ActionMeta {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent],
    action: ActionObject[TContext, TEvent],
    state: State[TContext, TEvent, _, Context[TContext]]
  ): ActionMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class ActionMetaOps[Self <: ActionMeta[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (ActionMeta[TContext, TEvent])) extends AnyVal {
    
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
    def setAction(value: ActionObject[TContext, TEvent]): Self = this.set("action", value.asInstanceOf[js.Any])
  }
}
