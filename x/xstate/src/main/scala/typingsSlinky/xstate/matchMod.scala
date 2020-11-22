package typingsSlinky.xstate

import typingsSlinky.xstate.anon.ContextTContext
import typingsSlinky.xstate.stateMod.State
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/match", JSImport.Namespace)
@js.native
object matchMod extends js.Object {
  
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: State[TContext, TEvent, _, ContextTContext[TContext]],
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: StateValue,
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  
  type StatePatternTuple[T, TContext, TEvent /* <: EventObject */] = js.Tuple2[StateValue, ValueFromStateGetter[T, TContext, TEvent]]
  
  type ValueFromStateGetter[T, TContext, TEvent /* <: EventObject */] = js.Function1[/* state */ State[TContext, TEvent, js.Any, ContextTContext[TContext]], T]
}
