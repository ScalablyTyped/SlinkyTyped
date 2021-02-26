package typingsSlinky.tarn

import typingsSlinky.tarn.utilsMod.Deferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pendingOperationMod {
  
  @JSImport("tarn/dist/PendingOperation", "PendingOperation")
  @js.native
  class PendingOperation[T] protected () extends StObject {
    def this(timeoutMillis: Double) = this()
    
    def abort(): Unit = js.native
    
    var deferred: Deferred[T] = js.native
    
    var isRejected: Boolean = js.native
    
    var possibleTimeoutCause: js.Error | Null = js.native
    
    var promise: js.Promise[T] = js.native
    
    def reject(err: js.Error): Unit = js.native
    
    def resolve(value: T): Unit = js.native
    
    var timeoutMillis: Double = js.native
  }
}
