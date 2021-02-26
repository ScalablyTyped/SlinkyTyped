package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.anon.ContextTContext
import typingsSlinky.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateMeta[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent] = js.native
  
  var state: State[TContext, TEvent, _, ContextTContext[TContext]] = js.native
}
object StateMeta {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent],
    state: State[TContext, TEvent, _, ContextTContext[TContext]]
  ): StateMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMeta[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class StateMetaMutableBuilder[Self <: StateMeta[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (StateMeta[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setState(value: State[TContext, TEvent, _, ContextTContext[TContext]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_event(value: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
  }
}
