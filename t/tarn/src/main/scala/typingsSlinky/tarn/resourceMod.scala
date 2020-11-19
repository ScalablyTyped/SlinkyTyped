package typingsSlinky.tarn

import typingsSlinky.tarn.utilsMod.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tarn/dist/Resource", JSImport.Namespace)
@js.native
object resourceMod extends js.Object {
  
  @js.native
  class Resource[T] protected () extends js.Object {
    def this(resource: T) = this()
    
    var deferred: Deferred[Unit] = js.native
    
    def promise: js.Promise[Unit] = js.native
    
    def resolve(): Resource[T] = js.native
    
    var resource: T = js.native
    
    val timestamp: Double = js.native
  }
}
