package typingsSlinky.xstream

import typingsSlinky.xstream.mod.Operator
import typingsSlinky.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstream/extra/split", JSImport.Namespace)
@js.native
object splitMod extends js.Object {
  
  def default[T](separator: Stream[_]): js.Function1[/* ins */ Stream[T], Stream[Stream[T]]] = js.native
  
  @js.native
  class SplitOperator[T] protected () extends Operator[T, Stream[T]] {
    def this( // s = separator
    s: Stream[_], ins: Stream[T]) = this()
    
    var curr: Stream[T] = js.native
    
    var s: Stream[_] = js.native
    
    var sil: js.Any = js.native
    
    def up(): Unit = js.native
  }
}
