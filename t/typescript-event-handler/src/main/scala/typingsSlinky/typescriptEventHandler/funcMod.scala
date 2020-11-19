package typingsSlinky.typescriptEventHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-event-handler/dist/func", JSImport.Namespace)
@js.native
object funcMod extends js.Object {
  
  type Action[TInput] = Func[TInput, Unit]
  
  type AsyncAction[TInput] = AsyncFunc[TInput, Unit]
  
  type AsyncFunc[TInput, TOutput] = js.Function1[/* value */ TInput, js.Promise[TOutput]]
  
  type AsyncPredicate[TInput] = AsyncFunc[TInput, Boolean]
  
  type Func[TInput, TOutput] = js.Function1[/* value */ TInput, TOutput]
  
  type Predicate[TInput] = Func[TInput, Boolean]
}
