package typingsSlinky.xstream

import typingsSlinky.xstream.mod.MemoryStream
import typingsSlinky.xstream.mod.Operator
import typingsSlinky.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstream/extra/flattenConcurrently", JSImport.Namespace)
@js.native
object flattenConcurrentlyMod extends js.Object {
  
  def default[T](ins: Stream[Stream[T] | MemoryStream[T]]): Stream[T] = js.native
  
  @js.native
  class FlattenConcOperator[T] protected () extends Operator[Stream[T], T] {
    def this(ins: Stream[Stream[T]]) = this()
    
    var active: js.Any = js.native
    
    def less(): Unit = js.native
  }
}
