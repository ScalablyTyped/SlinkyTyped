package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.ActivityDefinition
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.Expr
import typingsSlinky.xstate.typesMod.StopAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallActorRef extends StObject {
  
  def apply[TContext, TEvent /* <: EventObject */](actorRef: String): StopAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](actorRef: ActivityDefinition[TContext, TEvent]): StopAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](actorRef: Expr[TContext, TEvent, String | Id]): StopAction[TContext, TEvent] = js.native
}
