package typingsSlinky.xstate

import typingsSlinky.xstate.anon.Context
import typingsSlinky.xstate.anon.Id
import typingsSlinky.xstate.typesMod.AnyEventObject
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.InvokeDefinition
import typingsSlinky.xstate.typesMod.SCXML.Event
import typingsSlinky.xstate.typesMod.Spawnable
import typingsSlinky.xstate.typesMod.StateMachine
import typingsSlinky.xstate.typesMod.Subscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actorMod {
  
  @JSImport("xstate/lib/Actor", "createDeferredActor")
  @js.native
  def createDeferredActor(entity: Spawnable, id: String): Actor[_, AnyEventObject] = js.native
  @JSImport("xstate/lib/Actor", "createDeferredActor")
  @js.native
  def createDeferredActor(entity: Spawnable, id: String, data: js.Any): Actor[_, AnyEventObject] = js.native
  
  @JSImport("xstate/lib/Actor", "createInvocableActor")
  @js.native
  def createInvocableActor[TC, TE /* <: EventObject */](
    invokeDefinition: InvokeDefinition[TC, TE],
    machine: StateMachine[TC, _, TE, Context[TC]],
    context: TC,
    _event: Event[TE]
  ): Actor[_, AnyEventObject] = js.native
  
  @JSImport("xstate/lib/Actor", "createNullActor")
  @js.native
  def createNullActor(id: String): Actor[_, AnyEventObject] = js.native
  
  @JSImport("xstate/lib/Actor", "isActor")
  @js.native
  def isActor(item: js.Any): /* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean = js.native
  
  @js.native
  trait Actor[TContext, TEvent /* <: EventObject */] extends Subscribable[TContext] {
    
    var deferred: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var meta: js.UndefOr[InvokeDefinition[TContext, TEvent]] = js.native
    
    def send(event: TEvent): js.Any = js.native
    
    var state: js.UndefOr[js.Any] = js.native
    
    var stop: js.UndefOr[js.Function0[js.UndefOr[_]]] = js.native
    
    def toJSON(): Id = js.native
  }
}
