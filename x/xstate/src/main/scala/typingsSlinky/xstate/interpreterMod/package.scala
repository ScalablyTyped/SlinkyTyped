package typingsSlinky.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interpreterMod {
  
  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], scala.Unit]
  
  type EventListener[TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */] = js.Function1[/* event */ TEvent, scala.Unit]
  
  type Listener = js.Function0[scala.Unit]
  
  type StateListener[TContext, TEvent /* <: typingsSlinky.xstate.typesMod.EventObject */, TStateSchema /* <: typingsSlinky.xstate.typesMod.StateSchema[TContext] */, TTypestate /* <: typingsSlinky.xstate.typesMod.Typestate[TContext] */] = js.Function2[
    /* state */ typingsSlinky.xstate.stateMod.State[TContext, TEvent, TStateSchema, TTypestate], 
    /* event */ TEvent, 
    scala.Unit
  ]
}
