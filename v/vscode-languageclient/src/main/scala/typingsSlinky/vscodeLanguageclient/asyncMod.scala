package typingsSlinky.vscodeLanguageclient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("vscode-languageclient/lib/utils/async", "Delayer")
  @js.native
  class Delayer[T] protected () extends StObject {
    def this(defaultDelay: Double) = this()
    
    def cancel(): Unit = js.native
    
    var cancelTimeout: js.Any = js.native
    
    var completionPromise: js.Any = js.native
    
    var defaultDelay: Double = js.native
    
    def forceDelivery(): js.UndefOr[T] = js.native
    
    def isTriggered(): Boolean = js.native
    
    var onSuccess: js.Any = js.native
    
    var task: js.Any = js.native
    
    var timeout: js.Any = js.native
    
    def trigger(task: ITask[T]): js.Promise[T] = js.native
    def trigger(task: ITask[T], delay: Double): js.Promise[T] = js.native
  }
  
  type ITask[T] = js.Function0[T]
}
