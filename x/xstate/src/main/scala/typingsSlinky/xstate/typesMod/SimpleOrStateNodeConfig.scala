package typingsSlinky.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xstate.typesMod.AtomicStateNodeConfig[TContext, TEvent]
  - typingsSlinky.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent]
*/
trait SimpleOrStateNodeConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends StObject
object SimpleOrStateNodeConfig {
  
  @scala.inline
  def AtomicStateNodeConfig[TContext, TEvent /* <: EventObject */](): typingsSlinky.xstate.typesMod.AtomicStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.xstate.typesMod.AtomicStateNodeConfig[TContext, TEvent]]
  }
  
  @scala.inline
  def StateNodeConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](): typingsSlinky.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent]]
  }
}
