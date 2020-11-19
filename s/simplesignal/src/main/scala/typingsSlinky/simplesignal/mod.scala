package typingsSlinky.simplesignal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("simplesignal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  trait SimpleSignal[F /* <: js.Function */] extends js.Object {
    
    def add(func: F): Boolean = js.native
    
    def dispatch(args: js.Any*): Unit = js.native
    
    var functions: js.Any = js.native
    
    def numItems: Double = js.native
    
    def remove(func: F): Boolean = js.native
    
    def removeAll(): Boolean = js.native
  }
  
  @js.native
  class default[F /* <: js.Function */] () extends SimpleSignal[F]
}
