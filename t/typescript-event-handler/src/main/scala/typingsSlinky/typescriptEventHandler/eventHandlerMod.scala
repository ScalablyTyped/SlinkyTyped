package typingsSlinky.typescriptEventHandler

import typingsSlinky.typescriptEventHandler.funcMod.Action
import typingsSlinky.typescriptEventHandler.funcMod.AsyncAction
import typingsSlinky.typescriptEventHandler.funcMod.AsyncPredicate
import typingsSlinky.typescriptEventHandler.funcMod.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-event-handler/dist/event-handler", JSImport.Namespace)
@js.native
object eventHandlerMod extends js.Object {
  
  @js.native
  class EventHandler[TInput] () extends js.Object {
    
    def handleAsync(value: TInput): js.Promise[Unit] = js.native
    
    val handlers: js.Any = js.native
    
    def register(pred: Predicate[TInput], handler: Action[TInput]): Unit = js.native
    
    def registerAsync(pred: AsyncPredicate[TInput], handler: AsyncAction[TInput]): Unit = js.native
  }
}
